package ua.lviv.iot;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class BookStore {
    List<Stuff> store = new LinkedList<>();


    public List<Stuff> getList() {
        return store;
    }


    boolean addItem(Stuff item) {
        return store.add(item);
    }

//
    static void sortByName(List<Stuff> list, boolean reverse) {

        list.sort(Comparator.comparing(Stuff::getTitle));

        // (reverse ? -1 : 1)
        //   (a, b) -> a.getTitle().compareTo(b.getTitle()));

        if (reverse) Collections.reverse(list);

    }

    void sortByName(boolean reverse) {

        store.sort(Comparator.comparing(Stuff::getTitle));

        // (reverse ? -1 : 1)
        //   (a, b) -> a.getTitle().compareTo(b.getTitle()));

        if (reverse) Collections.reverse(store);

    }

    List<Stuff> findByAge(int from, int to) {
        List<Stuff> temp = new LinkedList<>();
        for (Stuff element : store) {
            if (element.age >= from && element.age <= to) {
                temp.add(element);
            }
        }
        return temp;
    }

    static final void sortByAge(List<Stuff> list, boolean reverse) {

        list.sort(Comparator.comparing(Stuff::getAge));
        if (reverse) {
            Collections.reverse(list);
        }

    }

    public String[] getListOfItems() {
        String[] array = new String[store.size()];
        int i = 0;

        for (Stuff element : store) {
            array[i++] = element.getTitle();
        }
        return array;
    }

}
