public class LibraryTest {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "The Alchemist", "Paulo Coelho"),
            new Book(102, "Wings of Fire", "A.P.J. Abdul Kalam"),
            new Book(103, "Zero to One", "Peter Thiel"),
            new Book(104, "Rich Dad Poor Dad", "Robert Kiyosaki")
        };

        LibraryManager manager = new LibraryManager(books);

        // Linear search
        System.out.println("Linear Search:");
        Book foundBook = manager.linearSearchByTitle("Zero to One");
        System.out.println(foundBook != null ? foundBook : "Book not found.");

        // Binary search (without sorting) → won't work reliably
        System.out.println("\nBinary Search (Before Sorting):");
        foundBook = manager.binarySearchByTitle("Zero to One");
        System.out.println(foundBook != null ? foundBook : "Book not found.");

        // Sort books
        manager.sortBooksByTitle();

        // Display sorted books
        System.out.println("\nBooks after sorting:");
        manager.displayBooks();

        // Binary search (after sorting)
        System.out.println("\nBinary Search (After Sorting):");
        foundBook = manager.binarySearchByTitle("Zero to One");
        System.out.println(foundBook != null ? foundBook : "Book not found.");
    }
}
