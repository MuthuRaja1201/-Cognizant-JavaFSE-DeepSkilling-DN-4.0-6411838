import java.util.Arrays;
import java.util.Comparator;

public class LibraryManager {
    private Book[] books;

    public LibraryManager(Book[] books) {
        this.books = books;
    }

    // Linear search by title
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search by title (Assumes sorted array)
    public Book binarySearchByTitle(String title) {
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int result = title.compareToIgnoreCase(books[mid].getTitle());

            if (result == 0) {
                return books[mid];
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }

    // Sort books by title (for binary search)
    public void sortBooksByTitle() {
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }

    // Display all books
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
