package ua.lviv.iot;

public class Main {

    public final static void main(String[] args) {

        BookStore bukva = new BookStore();

        final Size a3 = new Size(42, 30);
        final Size a4 = new Size(30, 21);
        final Size a5 = new Size(21, 15);

        Book book1 = new Book("Stephan King", true, BookType.FICTION,
                10, (float) 100.0, 200, "Fog", 18, "O'Relly", 6437484355314L,
                "Nice book", a4);
        Coloring coloring1 = new Coloring(ColoringType.PENCILS, 5, 25, 15, "Sun", 0, "Rainbow",
                5634264385168L, "Nice Coloring", a3);
        Calendar calendar1 = new Calendar(CalendarType.DESK_CALENDAR, 1, 10, 12, "2019", 7, "Cal",
                7134264385168L, "Nice Calendar", a5);

        // поміщення у магазин
        bukva.addItem(book1);
        bukva.addItem(coloring1);
        bukva.addItem(calendar1);

        //Записує дані про обєкт в файл csv
        Manager.backupDatabase(bukva, "C:\\", "bukva");

        //Зчитує дані про обєкт в файл csv
        BookStore litera = new BookStore();
        Manager.restoreDatabase(litera, "C:\\", "bukva");


        //Перевірка параметрів Bukva і вивід їх на екран
        for (String element : bukva.getListOfItems()) {
            System.out.println("Bukva: " + element + ", \tHashCode: " + element.hashCode() + ", \tSystem.identityHashCode: " + System.identityHashCode(element));
        }

        System.out.println();

        //Перевірка на параметри Litera
        for (String element : litera.getListOfItems()) {
            System.out.println("Litera: " + element + ", \tHashCode: " + element.hashCode() + ", \tSystem.identityHashCode: " + System.identityHashCode(element));
        }

/*

        // сортування методом класу
        BookStore.sortByName(bukva.getList(), true);
        BookStore.sortByAge(bukva.getList(), false);
        // сортування методом обєкту
        bukva.sortByName(true);

        for (String element : bukva.getListOfItems()) {
            System.out.println(element);
        }

        System.out.println();

        for (Stuff element : bukva.findByAge(6, 18)) {
            System.out.println(element.getTitle());
        }
    */

    }
}
