import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    final private String filePath = "C:\\";
    final private String fileName = "test";
    final private String fileExtention = ".csv";

    private BookStore testStore;
    private BookStore newStore;

    final Size a3 = new Size(42, 30);
    final Size a4 = new Size(30, 21);
    final Size a5 = new Size(21, 15);

    final Book book1 = new Book("Stephan King", true, BookType.FICTION,
            10, (float) 100.0, 200, "Fog", 18, "O'Relly", 6437484355314L,
            "Nice book", a4);

    final Coloring coloring1 = new Coloring(ColoringType.PENCILS, 5, 25, 15, "Sun", 0, "Rainbow",
            5634264385168L, "Nice Coloring", a3);

    final Calendar calendar1 = new Calendar(CalendarType.DESK_CALENDAR, 1, 10, 12, "2019", 7, "Cal",
            7134264385168L, "Nice Calendar", a5);

    @BeforeEach
    public void setUp() {
        testStore = new BookStore();
        testStore.addItem(book1);
        testStore.addItem(coloring1);
        testStore.addItem(calendar1);
    }

    @Test
    void testBackupDatabase() throws IOException {
        Manager.backupDatabase(testStore, filePath, fileName);

        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath + fileName + fileExtention),
                        StandardCharsets.UTF_8));

        assertEquals(br.readLine(), book1.serialize(','), "Error: cant read the book from file");
        assertEquals(br.readLine(), coloring1.serialize(','), "Error: cant read the coloring from file");
        assertEquals(br.readLine(), calendar1.serialize(','), "Error: cant read the calendar from file");
    }

    @Test
    void testRestoreDatabase() {
        Manager.restoreDatabase(newStore, filePath, fileName);
        List<Stuff> oldList = testStore.getList();
        List<Stuff> newList = newStore.getList();

        for(int i = 0; i < oldList.size(); i++) {
            assertEquals(oldList.get(i), newList.get(i), "Error: heshCode isnt equal");
        }


    }
}