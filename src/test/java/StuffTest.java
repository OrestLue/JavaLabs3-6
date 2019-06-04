import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StuffTest {
    Size a3 = new Size(42, 30);
    Size a4 = new Size(30, 21);
    Size a5 = new Size(21, 15);
    @Test
    void getQuantity() {
        Stuff stuff = new Stuff();
        stuff.setQuantity(100);
        assertEquals(100, stuff.getQuantity(),
                "Error in getQuantity");
    }

    @Test
    void setQuantity() {
        Stuff stuff = new Stuff();
        stuff.setQuantity(100);
        assertEquals(100, stuff.getQuantity(),
                "Error in setQuantity");
    }

    @Test
    void setPrice() {
        Stuff stuff = new Stuff();
        stuff.setPrice(100);
        assertEquals(100, stuff.getPrice(),
                "Error in setPrice");
    }

    @Test
    void getPrice() {
        Stuff stuff = new Stuff();
        stuff.setPrice(100);
        assertEquals(100, stuff.getPrice(),
                "Error in getPrice");
    }

    @Test
    void getNumberOfPages() {
        Stuff stuff = new Stuff();
        stuff.setNumberOfPages(100);
        assertEquals(100, stuff.getNumberOfPages(),
                "Error in getNumberOfPages");
    }

    @Test
    void setNumberOfPages() {
        Stuff stuff = new Stuff();
        stuff.setNumberOfPages(100);
        assertEquals(100, stuff.getNumberOfPages(),
                "Error in setNumberOfPages");
    }

    @Test
    void getTitle() {
        Stuff stuff = new Stuff();
        stuff.setTitle("Tit");
        assertEquals("Tit", stuff.getTitle(),
                "Error in getTitle");
    }

    @Test
    void setTitle() {
        Stuff stuff = new Stuff();
        stuff.setTitle("Tit");
        assertEquals("Tit", stuff.getTitle(),
                "Error in setTitle");
    }

    @Test
    void getAge() {
        Stuff stuff = new Stuff();
        stuff.setAge(10);
        assertEquals(10, stuff.getAge(),
                "Error in getAge");
    }

    @Test
    void setAge() {
        Stuff stuff = new Stuff();
        stuff.setAge(10);
        assertEquals(10, stuff.getAge(),
                "Error in setAge");
    }

    @Test
    void getPublishingHouse() {
        Stuff stuff = new Stuff();
        stuff.setPublishingHouse("Books");
        assertEquals("Books", stuff.getPublishingHouse(),
                "Error in getPublishingHouse");
    }

    @Test
    void setPublishingHouse() {
        Stuff stuff = new Stuff();
        stuff.setPublishingHouse("Books");
        assertEquals("Books", stuff.getPublishingHouse(),
                "Error in setPublishingHouse");
    }

    @Test
    void getEan13() {
        Stuff stuff = new Stuff();
        stuff.setEan13(6437484355314l);
        assertEquals(6437484355314l, stuff.getEan13(),
                "Error in getEan13");
    }

    @Test
    void setEan13() {
        Stuff stuff = new Stuff();
        stuff.setEan13(6437484355314l);
        assertEquals(6437484355314l, stuff.getEan13(),
                "Error in setEan13");
    }

    @Test
    void getDescription() {
        Stuff stuff = new Stuff();
        stuff.setDescription("Nice");
        assertEquals("Nice", stuff.getDescription(),
                "Error in getDescription");
    }

    @Test
    void setDescription() {
        Stuff stuff = new Stuff();
        stuff.setDescription("Nice");
        assertEquals("Nice", stuff.getDescription(),
                "Error in setDescription");
    }

    @Test
    void setSize() {
        Stuff stuff = new Stuff();
        stuff.setSize(a4);
        assertEquals(a4, stuff.getSize(),
                "Error in setSize");
    }

    @Test
    void getSize() {
        Stuff stuff = new Stuff();
        stuff.setSize(a4);
        assertEquals(a4, stuff.getSize(),
                "Error in getSize");
    }
}