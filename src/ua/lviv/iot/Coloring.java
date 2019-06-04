package ua.lviv.iot;

public class Coloring extends Stuff {

    ColoringType kindOfColoring;

    public Coloring() {

    }

    Coloring(ColoringType kindOfColoring, int quantity, float price,
             int numberOfPages, String title, int age,
             String publishingHouse, long ean13,
             String description, Size size) {

        super(quantity, price, numberOfPages, title,
                age, publishingHouse, ean13, description, size);

        this.kindOfColoring = kindOfColoring;
    }

    Coloring(String title, int age, int quantity, long ean13) {
        super(quantity, 0, 0, title, age,
                "", ean13, "",
                new Size(0, 0));

        this.kindOfColoring = ColoringType.PENCILS;
    }

    Coloring(String serializedObject, char separator){
        super(serializedObject, separator);
        String[] field = serializedObject.split("\\" + separator );
        this.kindOfColoring = ColoringType.valueOf(field[field.length - 1]);
    }

    public final ColoringType getKindOfColoring() {
        return kindOfColoring;
    }

    public final void setKindOfColoring(ColoringType kindOfColoringObj) {
        this.kindOfColoring = kindOfColoringObj;
    }

    @Override
    public String toString() {
        return " Kind of coloring " + kindOfColoring + "\n";
    }

    @Override
    public String serialize(char separator) {
        return "Coloring" + separator + super.serialize(separator) +
                kindOfColoring;
    }

}
