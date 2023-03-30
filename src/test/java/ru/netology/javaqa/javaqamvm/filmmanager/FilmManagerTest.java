package ru.netology.javaqa.javaqamvm.filmmanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void addFilmFirstManagerTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findAllOverLimitFirstManagerTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        manager.addFilm("Film9");
        manager.addFilm("Film10");
        manager.addFilm("Film11");
        manager.addFilm("Film12");

        String[] expected = {"Film12", "Film11", "Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3",};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void findAllUnderLimitFirstManagerTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");


        String[] expected = {"Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void addFilmSecondManagerTest() {
        FilmManager manager = new FilmManager(5);

        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findAllOverLimitSecondManagerTest() {
        FilmManager manager = new FilmManager(8);

        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        manager.addFilm("Film9");
        manager.addFilm("Film10");
        manager.addFilm("Film11");
        manager.addFilm("Film12");

        String[] expected = {"Film12", "Film11", "Film10", "Film9", "Film8", "Film7", "Film6", "Film5"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void findAllUnderLimitSecondManagerTest() {
        FilmManager manager = new FilmManager(8);

        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");


        String[] expected = {"Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}
