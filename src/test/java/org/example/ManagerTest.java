package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {


    @Test
    public void getFiveFilms() {
        Manager manager = new Manager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void getOneFilm() {
        Manager manager = new Manager();
        manager.add("Film 1");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void findAll() {
        Manager manager = new Manager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");
        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void standardOutPutTenFilms() {
        Manager manager = new Manager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");
        String[] actual = manager.findLastMovie();
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void getOneAboveStandardOutPut() {
        Manager manager = new Manager(11);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");
        manager.add("Film 11");
        String[] actual = manager.findLastMovie();
        String[] expected = {"Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void oneBelowStandardOutPut() {
        Manager manager = new Manager(9);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");

        String[] actual = manager.findLastMovie();
        String[] expected = {"Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void standardOutPutNineFilms() {
        Manager manager = new Manager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");

        String[] actual = manager.findLastMovie();
        String[] expected = {"Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void standardOutPutElevenFilms() {
        Manager manager = new Manager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");
        manager.add("Film 11");
        String[] actual = manager.findLastMovie();
        String[] expected = {"Film 11","Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void oneOupPutFiveFilms() {
        Manager manager = new Manager(1);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");

        String[] actual = manager.findLastMovie();
        String[] expected = {"Film 5"};

        assertArrayEquals(expected, actual);

    }
}