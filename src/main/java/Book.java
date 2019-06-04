class Book extends Stuff {

    private String author;
    private boolean illustrations;
    private BookType kindOfBook;

    public Book(){

    }

    Book(final String authorObj, final boolean illustrationsObj,
         BookType kindOfBookObj, final int quantity, final float price,
         final int numberOfPages, final String title, final int age,
         final String publishingHouse, final long ean13,
         final String description, final Size size) {

        super(quantity, price, numberOfPages, title, age, publishingHouse,
                ean13, description, size);

        this.author = authorObj;
        this.illustrations = illustrationsObj;
        this.kindOfBook = kindOfBookObj;
    }

    Book(final String title, final int age, final int quantity,
         final long ean13) {
        super(quantity, 0, 0, title, age,
                "", ean13, "",
                new Size(0, 0));

        this.author = "";
        this.illustrations = false;
        this.kindOfBook = BookType.FICTION;
    }

    Book(String serializedObject, char separator) {
        super(serializedObject, separator);
        String[] field = serializedObject.split("\\" + separator );

        this.author = field[field.length - 3];
        this.illustrations = Boolean.parseBoolean(field[field.length - 2]);
        this.kindOfBook = BookType.valueOf(field[field.length - 1]);
    }

    public String getAuthor() {
        return author;
    }

    public final void setAuthor(final String authorObj) {
        this.author = authorObj;
    }

    boolean containIllustration(){
        return illustrations;
    }

    void setIllustrations(final boolean illustrationsObj) {
        this.illustrations = illustrationsObj;
    }

    public BookType getKindOfBook() {
        return kindOfBook;
    }

    public final void setKindOfBook(final BookType kindOfBookObj) {
        this.kindOfBook = kindOfBookObj;
    }

    @Override
    public String toString() {
       return "Book: " + " Author " + author + "\n Age " + age
               + "\n Illustrations " + illustrations
               + "\n Kind of books " + kindOfBook + "\n";
    }

    @Override
    public String serialize(char separator) {
        return "Book" + separator + super.serialize(separator) +
                author + separator + illustrations + separator +
                kindOfBook;
    }
}

