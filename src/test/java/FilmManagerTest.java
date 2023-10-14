import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void zeroFilm() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddTwoFilms() {
        FilmManager manager = new FilmManager(2);

        manager.addFilm("1");
        manager.addFilm("2");

        String[] expected = {"1", "2"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void shouldAddFilms(){
        FilmManager manager = new FilmManager();

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");

        String[] expected = {"1", "2","3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmIfOver(){
        FilmManager manager = new FilmManager();

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");
        manager.addFilm("4");
        manager.addFilm("5");
        manager.addFilm("6");

        String[] expected = {"6", "5","4", "3", "2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilm(){
        FilmManager manager = new FilmManager();

        manager.addFilm("1");
        manager.addFilm("2");
        manager.addFilm("3");

        String[] expected = {"3", "2","1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
