import org.example.FilmsManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestManager {

    @Test
    public void test1() {
        FilmsManager filmLibrary = new FilmsManager();

        filmLibrary.add("Фильм 1");
        filmLibrary.add("Фильм 2");
        filmLibrary.add("Фильм 3");


        String[] actual = filmLibrary.findAll();


        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3"};


        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void test2() {
        FilmsManager filmLibrary = new FilmsManager();


        filmLibrary.add("Фильм 1");
        filmLibrary.add("Фильм 2");
        filmLibrary.add("Фильм 3");


        String[] actual = filmLibrary.findAll();


        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3"};


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        FilmsManager filmLibrary = new FilmsManager();


        filmLibrary.add("Фильм 1");
        filmLibrary.add("Фильм 2");
        filmLibrary.add("Фильм 3");


        String[] actual = filmLibrary.findAll();


        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3"};


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        FilmsManager filmLibrary = new FilmsManager();


        filmLibrary.add("Фильм 1");
        filmLibrary.add("Фильм 2");
        filmLibrary.add("Фильм 3");


        String[] actual = filmLibrary.findAll();


        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3"};


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        FilmsManager filmLibrary = new FilmsManager();


        filmLibrary.add("Фильм 1");
        filmLibrary.add("Фильм 2");

        String[] actual = filmLibrary.findLast();

        String[] expected = {"Фильм 2", "Фильм 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        FilmsManager filmLibrary = new FilmsManager(3);

        filmLibrary.add("Фильм 1");
        filmLibrary.add("Фильм 2");
        filmLibrary.add("Фильм 3");

        String[] actual = filmLibrary.findLast();

        String[] expected = {"Фильм 3", "Фильм 2", "Фильм 1"};

        Assertions.assertArrayEquals(expected, actual);
    }



}
