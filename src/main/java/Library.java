import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String book) {
        if(!books.contains(book)){
            books.add(book);
            sortBooks();
        }
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    public String getBook(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        }
        throw new IndexOutOfBoundsException("Position out of range");
    }

    public void addBookAtIndex(String book, int index) {
        if (!books.contains(book)) {
            books.add(index, book);
            sortBooks();
        }
    }

    public void removeBook(String book) {
        books.remove(book);
        sortBooks();
    }

    private void sortBooks() {
        Collections.sort(books);
    }
}
