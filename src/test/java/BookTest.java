import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void shortConstructor() {
        Book book = new Book("Fog", 18, 3, 6437484355314L);

        assertEquals("", book.getAuthor(),
                "There is an error in short Constructor method");
    }

    @Test
    void getAuthor() {
        Book book = new Book();
        book.setAuthor("Marck");
        assertEquals("Marck", book.getAuthor(),
                "Error in getAuthor");
    }

    @Test
    void setAuthor() {
        Book book = new Book();
        book.setAuthor("Marck");
        assertEquals("Marck", book.getAuthor(),
                "Error in setAuthor");
    }

    @Test
    void containIllustration() {
        Book book = new Book();
        book.setIllustrations(true);
        assertEquals(true, book.containIllustration(),
                "Error in containIllustration");
    }

    @Test
    void setIllustrations() {
        Book book = new Book();
        book.setIllustrations(true);
        assertEquals(true, book.containIllustration(),
                "Error in setIllustrations");
    }

    @Test
    void getKindOfBook() {
        Book book = new Book();
        book.setKindOfBook(BookType.FICTION);
        assertEquals(BookType.FICTION, book.getKindOfBook(),
                "Error in getKindOfBook");
    }

    @Test
    void setKindOfBook() {
        Book book = new Book();
        book.setKindOfBook(BookType.FICTION);
        assertEquals(BookType.FICTION, book.getKindOfBook(),
                "Error in setKindOfBook");
    }

    @Test
    void teastToString() {
        Size a4 = new Size(30, 21);

        Book book = new Book("Stephan King", true, BookType.FICTION,
                10, (float) 100.0, 200, "Fog", 18, "O'Relly", 6437484355314L,
                "Nice book", a4);

        assertEquals("Book: " + " Author " + "Stephan King" +
                        "\n Age " + 18 + "\n Illustrations " + true +
                        "\n Kind of books " + BookType.FICTION + "\n",
                book.toString(),"There is an error in toString() method");

    }
}