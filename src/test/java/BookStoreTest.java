import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.Test;
//import java.util.List;


public class BookStoreTest {

    BookStore bukva;

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
        bukva = new BookStore();
        bukva.addItem(book1);
        bukva.addItem(coloring1);
        bukva.addItem(calendar1);
    }
/*
Coloring(ColoringType kindOfColoring, int quantity, float price, int numberOfPages, String title, int age,
             String publishingHouse, long ean13, String description, Size size)
 */


    @Test
    public void testAddItem() {
        int items = bukva.getList().size();
        bukva.addItem(book1);
        assertEquals(items+1, bukva.getList().size(), "Error addItems return wrong number");
    }


    @Test
    public void testGetList() {
        assertEquals(3, bukva.getList().size(), "Error getList return wrong number");
    }

    @Test
    public void testGetListOfItems() {
        assertEquals(3, bukva.getListOfItems().length, "Error getListOfItems return wrong number");
    }

    @Test
    public void testClassSortByName() {

        BookStore.sortByName(bukva.getList(), false);
        assertEquals("Sun", bukva.getList().get(2).getTitle(), "Error ");

        BookStore.sortByName(bukva.getList(), true);
        assertEquals("2019", bukva.getList().get(2).getTitle(), "Error ");
    }

    @Test
    public void testSortByName() {

        bukva.sortByName( false);
        assertEquals("Sun", bukva.getList().get(2).getTitle(), "Error ");

        bukva.sortByName(true);
        assertEquals("2019", bukva.getList().get(2).getTitle(), "Error ");
    }

    @Test
    public void testSortByAge() {

        BookStore.sortByAge(bukva.getList(), false);
        assertEquals("Fog", bukva.getList().get(2).getTitle(), "Error ");

        BookStore.sortByAge(bukva.getList(), true);
        assertEquals("Sun", bukva.getList().get(2).getTitle(), "Error ");
    }

    @Test
    public void testFindByAge() {

        assertEquals("2019", bukva.findByAge(2, 8).get(0).getTitle(), "Error ");
    }

}
