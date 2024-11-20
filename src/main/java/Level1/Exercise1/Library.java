package Level1.Exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private final List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String book) {
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    public List<String> getBooks() {
        sortBooks();
        return Collections.unmodifiableList(books);
    }

    public String getBookByIndex(int index) {
        if (index < 0 || index >= books.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ". Valid range is 0 to " + (books.size() - 1));
        }
        return books.get(index);
    }

    public boolean addBookAtIndex(String book, int index) {
        if (index < 0 || index > books.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ". Valid range is 0 to " + books.size());
        }
        if (!books.contains(book)) {
            books.add(index, book);
            return true;
        }
        return false;
    }

    public boolean removeBook(String book) {
        return books.remove(book);
    }

    public int size() {
        return books.size();
    }

    private void sortBooks() {
        Collections.sort(books);
    }
}
