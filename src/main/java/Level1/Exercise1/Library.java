package Level1.Exercise1;

import Level1.Exercise1.exception.BookException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private final List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String book) {
        validateBookName(book);
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    public List<String> getBooks() {
        sortBooks();
        return Collections.unmodifiableList(books);
    }

    public String getBookByPosition(int position) {
        validatePosition(position);
        return books.get(position - 1);
    }

    public boolean addBookAtPosition(String book, int position) {
        validatePositionForInsertion(position);
        validateBookName(book);

        if (!books.contains(book)) {
            books.add(position - 1, book);
            return true;
        }
        return false;
    }

    public boolean removeBook(String book) {
        validateBookName(book);
        if (!books.contains(book)) {
            throw new BookException("Book not found: " + book);
        }
        return books.remove(book);
    }

    public boolean validateBook(String book) {
        return books.contains(book);
    }

    public int size() {
        return books.size();
    }

    private void sortBooks() {
        Collections.sort(books);
    }

    private void validatePosition(int position) {
        if (position < 1 || position > books.size()) {
            throw new BookException("Invalid position: " + position + ". Valid range is 1 to " + books.size());
        }
    }

    private void validatePositionForInsertion(int position) {
        if (position < 1 || position > books.size() + 1) {
            throw new BookException("Invalid position: " + position + ". Valid range is 1 to " + (books.size() + 1));
        }
    }

    private void validateBookName(String book) {
        if (book == null || book.trim().isEmpty()) {
            throw new BookException("Book name cannot be null or empty.");
        }
    }
}
