package ua.lviv.iot;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Manager {
    //Константи із великої букви
    final static char SEPARATOR = ',';

    //Передаєм значенна в backupDatabase
    public final static boolean backupDatabase(final BookStore store,
                                               final String filePath,
                                               final String fileName) {

        List<Stuff> list = store.getList();

        boolean state = true;
        try {
            //Відкривається файл на запис
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(
                            // Створення файлу
                            new FileOutputStream(filePath + fileName + ".csv"),
                            StandardCharsets.UTF_8));

            String serializedObject;
            //Проходження по списку list і кожного разу беремо наступнй елемент
            for (Stuff element : list) {
                serializedObject = element.serialize(SEPARATOR);

                //Запис серелізованого обєкта на диск
                bw.write(serializedObject);
                bw.newLine();
            }
            // примусово переписати кеш на диск
            bw.flush();
            bw.close();
        }
//        catch (UnsupportedEncodingException e) { state = false; }
//        catch (FileNotFoundException e) { state = false; }
        catch (IOException e) {
            e.printStackTrace();
            state = false;
        } finally {
        }

        return state;
    }

    //Переймаєм значення файлу з restoreDatabase (з стор в букстор)
    public final static boolean restoreDatabase(final BookStore store,
                                                final String filePath,
                                                final String fileName) {

        boolean state = true;

        try {
            //Відкривається файл на читання
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(filePath + fileName + ".csv"),
                            StandardCharsets.UTF_8));

            String newLine;
            while ((newLine = br.readLine()) != null) {
                Stuff newStuff;
                //System.out.println(newLine);
                int separatorIndex = newLine.indexOf(SEPARATOR);
                int endIndex = newLine.length();

                switch (newLine.substring(0, separatorIndex)) {
                    //Перевірка на перше слово у масиві
                    case "Book":
                        newStuff = new Book(newLine.substring(separatorIndex + 1, endIndex), SEPARATOR);
                        //System.out.println("Book");
                        break;
                    case "Coloring":
                        newStuff = new Coloring(newLine.substring(separatorIndex + 1, endIndex), SEPARATOR);
                        //System.out.println("Coloring");
                        break;
                    case "Calendar":
                        newStuff = new Calendar(newLine.substring(separatorIndex + 1, endIndex), SEPARATOR);
                        //System.out.println("Calendar");
                        break;
                    default:
                        newStuff = null;
                        //System.out.println("no match");
                }

                if (newStuff != null) store.addItem(newStuff);
/*


                if("Calendar".equals(newLine.substring(0,newLine.indexOf(SEPARATOR)))) {
                    System.out.println("Calendar");
                }
 */
            }

        }
//        catch (UnsupportedEncodingException e) { state = false; }
//        catch (FileNotFoundException e) { state = false; }
        catch (IOException e) {
            e.printStackTrace();
            state = false;
        } finally {
        }
        return state;
    }
}
