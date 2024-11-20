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
        library.addBook("Book 1");
        library.addBook("Book 2");
    }

    @Test
    public void listIsNotNullAfterInitialization() {
        library = new Library();
        assertNotNull(library.getBooks());
    }

    @Test
    public void addBookIncreasesListSize() {
        assertEquals(2, library.size());
    }

    @Test
    public void bookIsAddedAtSpecificIndex() {
        assertTrue(library.addBookAtIndex("Book 3", 1));
        assertEquals("Book 3", library.getBookByIndex(1));
    }

    @Test
    public void bookIsNotDuplicatedInList() {
        library.addBook("Book 1");
        assertEquals(2, library.size());
    }

    @Test
    public void bookIsReturnedFromCorrectIndex() {
        assertEquals("Book 1", library.getBookByIndex(0));
        assertEquals("Book 2", library.getBookByIndex(1));
    }

    @Test
    public void addingBookChangesListSize() {
        library.addBook("Book 3");
        assertEquals(3, library.size());
    }

    @Test
    public void removingBookDecreasesListSize() {
        assertTrue(library.removeBook("Book 1"));
        assertEquals(1, library.size());
    }

    @Test
    public void listIsSortedAfterAddingOrRemovingBook() {
        library.addBook("Book 4");
        library.addBook("Book 3");

        List<String> books = library.getBooks();
        assertEquals("Book 2", books.get(1));
        assertEquals("Book 1", books.get(0));
        assertEquals("Book 4", books.get(3));
        assertEquals("Book 3", books.get(2));

        library.removeBook("Book 2");
        books = library.getBooks();
        assertEquals("Book 1", books.get(0));
        assertEquals("Book 3", books.get(1));
    }

}
