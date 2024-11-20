package Level1.Exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setup() {
        library = new Library();
    }

    @Test
    public void listIsNotNullAfterInitialization() {
        assertNotNull(library.getBooks());
        assertEquals(0, library.size());
    }

    @Test
    public void addBookIncreasesListSize() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        assertEquals(2, library.size());
    }

    @Test
    public void bookIsAddedAtSpecificIndex() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        assertTrue(library.addBookAtIndex("Book 3", 1));
        assertEquals("Book 3", library.getBookByIndex(1));
    }

    @Test
    public void bookIsNotDuplicatedInList() {
        library.addBook("Book 1");
        library.addBook("Book 1");
        assertEquals(1, library.size());
    }

    @Test
    public void bookIsReturnedFromCorrectIndex() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");

        assertEquals("Book 1", library.getBookByIndex(0));
        assertEquals("Book 2", library.getBookByIndex(1));
        assertEquals("Book 3", library.getBookByIndex(2));
    }

    @Test
    public void addingBookChangesListSize() {
        assertEquals(0, library.size());
        library.addBook("Book 1");
        assertEquals(1, library.size());
        library.addBook("Book 2");
        assertEquals(2, library.size());
    }

    @Test
    public void removingBookDecreasesListSize() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        assertTrue(library.removeBook("Book 1"));
        assertEquals(1, library.size());
    }

    @Test
    public void listIsSortedAfterAddingOrRemovingBook() {
        library.addBook("Book 3");
        library.addBook("Book 1");
        library.addBook("Book 2");

        List<String> books = library.getBooks();
        assertEquals("Book 2", books.get(1));
        assertEquals("Book 1", books.get(0));
        assertEquals("Book 3", books.get(2));

        library.removeBook("Book 2");
        books = library.getBooks();
        assertEquals("Book 1", books.get(0));
        assertEquals("Book 3", books.get(1));
    }

}
