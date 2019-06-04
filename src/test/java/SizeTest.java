import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SizeTest {

    @Test
    void setHight() {
        Size size = new Size();
        size.setHight(100);
        assertEquals(100, size.getHight(),
                "Error in setHight");
    }

    @Test
    void setWeight() {
        Size size = new Size();
        size.setWeight(100);
        assertEquals(100, size.getWeight(),
                "Error in setWeight");
    }

    @Test
    void getHight() {
        Size size = new Size();
        size.setHight(100);
        assertEquals(100, size.getHight(),
                "Error in getHight");
    }

    @Test
    void getWeight() {
        Size size = new Size();
        size.setWeight(100);
        assertEquals(100, size.getWeight(),
                "Error in setWeight");
    }
}