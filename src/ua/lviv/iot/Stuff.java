package ua.lviv.iot;

public class Stuff {
// виправити мод досупу
    private int quantity;
    private float price;
    private int numberOfPages;
    private String title;
    protected int age;
    private String publishingHouse;
    private long ean13;
    private String description;
    private Size size;

    //public String getTitle() { return title; }

    Stuff(final int quantityObj, final float priceObj,
          final int numberOfPagesObj, final String titleObj, final int ageObj,
          final String publishingHouseObj, final long ean13Obj,
          final String descriptionObj, final Size sizeObj) {
        this.quantity = quantityObj;
        this.price = priceObj;
        this.numberOfPages = numberOfPagesObj;
        this.title = titleObj;
        this.age = ageObj;
        this.publishingHouse = publishingHouseObj;
        this.ean13 = ean13Obj;
        this.description = descriptionObj;
        this.size = sizeObj;
    }

    Stuff(final int quantity, final float price, final int numberOfPages) {
        this(quantity, price, numberOfPages, "", 0,
                "", 0,"",
                new Size(0, 0));
    }

    Stuff() {
        this(0, 0, 0);
    }

    Stuff(String serializedObject, char separator) {
        // Створення стрічкового масиву і заповнення його фрагментами вихідної
        // стрічки рохбитої "," Для цього використовується "\," GREP
        String[] field = serializedObject.split("\\" + separator );

        this.quantity = Integer.parseInt(field[0]);
        this.price = Float.parseFloat(field[1]);
        this.numberOfPages = Integer.parseInt(field[2]);
        this.title = field[3];
        this.age = Integer.parseInt(field[4]);
        this.publishingHouse = field[5];
        this.ean13 = Long.parseLong(field[6]);
        this.description = field[7];
        this.size = new Size(Integer.parseInt(field[8]),
                             Integer.parseInt(field[9]));
    }

    // для доступу до полів класу через get set
    public final int getQuantity() {
        return quantity;
    }
    public final void setQuantity(int quantityObj) {
        this.quantity = quantityObj;
    }

    public void setPrice(float priceObj) {
        this.price = priceObj;
    }

    public float getPrice() {
        return price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    public final void setNumberOfPages(int numberOfPagesObj) {
        this.numberOfPages = numberOfPagesObj;
    }

    public final String getTitle() {
        return title;
    }

    public final void setTitle(String titleObj) {
        this.title = titleObj;
    }

    public int getAge() {
        return age;
    }

    public final void setAge(int ageObj) {
        this.age = ageObj;
    }

    public final String getPublishingHouse() {
        return publishingHouse;
    }
    public final void setPublishingHouse(String publishingHouseObj) {
        this.publishingHouse = publishingHouseObj;
    }

    public final long getEan13() {
        return ean13;
    }
    public final void setEan13(long ean13Obj) {
        this.ean13 = ean13Obj;
    }

    public final String getDescription() {
        return description;
    }
    public final void setDescription(String descriptionObj) {
        this.description = descriptionObj;
    }

    public final void setSize(final Size sizeObj) {
        this.size = sizeObj;
    }

    public final Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return " Name: " + title + "\n Quantity: " + quantity + "\n EAN13: "
                + ean13 + "\n";
    }

    protected String serialize(char separator) {

        return "" + quantity + separator + price + separator +
                numberOfPages + separator + title + separator +
                age + separator + publishingHouse + separator +
                ean13 + separator + description + separator +
                size.serialize(separator);
    }
}

