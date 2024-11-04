package Level1.Exercise1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setup() {
        library = new Library();
    }

    @Test
    public void listNotNullAfterAddingBook() {
        library.addBook("The Hobbit");
        assertNotNull(library.books);
    }

    @Test
    public void listHasExpectedLengthAfterAddingBooks() {
        library.addBook("The Hobbit");
        library.addBook("The Fellowship of the Ring");
        library.addBook("The Two Towers");
        assertEquals(3, library.books.size());
    }

    @Test
    public void bookIsAddedToCorrectIndex() {
        library.addBook("The Hobbit");
        library.addBook("The Fellowship of the Ring");
        library.addBook("The Two Towers");
        library.addBookAtIndex("The Return of the King", 3);
        assertEquals("The Return of the King", library.books.get(2));
    }

    @Test
    public void listHasNoDuplicatesAfterAddingBook() {
        library.addBook("The Hobbit");
        library.addBook("The Hobbit");
        assertEquals(1, library.books.size());
    }

    @Test
    public void bookIsReturnedFromCorrectIndex() {
        library.addBook("The Hobbit");
        library.addBook("The Fellowship of the Ring");
        library.addBook("The Two Towers");
        assertEquals("The Fellowship of the Ring", library.getBook(0));
    }

    @Test
    public void addingBookChangesListSize() {
        library.addBook("The Hobbit");
        library.addBook("The Fellowship of the Ring");
        library.addBook("The Two Towers");
        library.addBookAtIndex("The Return of the King", 3);
        assertEquals(4, library.books.size());
    }

    @Test
    public void removingBookChangesListSize() {
        library.addBook("The Hobbit");
        library.addBook("The Fellowship of the Ring");
        library.addBook("The Two Towers");
        library.addBookAtIndex("The Return of the King", 3);
        library.removeBook("The Fellowship of the Ring");
        assertEquals(3, library.books.size());
    }

    @Test
    public void listIsSortedAfterAddingOrRemovingBook() {
        library.addBook("The Hobbit");
        library.addBook("The Fellowship of the Ring");
        library.addBook("The Two Towers");
        library.addBookAtIndex("The Return of the King", 3);
        library.removeBook("The Fellowship of the Ring");
        assertEquals("The Hobbit", library.books.get(0));
        assertEquals("The Return of the King", library.books.get(1));
        assertEquals("The Two Towers", library.books.get(2));
    }
}