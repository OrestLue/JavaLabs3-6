import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColoringTest {

    @Test
    void getKindOfColoring() {
        Coloring coloring = new Coloring();
        coloring.setKindOfColoring(ColoringType.PENCILS);
        assertEquals(ColoringType.PENCILS, coloring.getKindOfColoring(),
                "There is an error in getKindOfColoring or setKindOfColoring");
    }

    @Test
    void setKindOfColoring() {
        Coloring coloring = new Coloring();
        coloring.setKindOfColoring(ColoringType.PENCILS);
        assertEquals(ColoringType.PENCILS, coloring.getKindOfColoring(),
                "There is an error in getKindOfColoring or setKindOfColoring");
    }
}