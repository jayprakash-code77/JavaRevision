package Projects.LibraryManagementSystem.Books;

import java.util.HashMap;

// This class shores: Key = object of BooksKeys class AND Value = object of value class.
class BookStorage {
    private HashMap<BookId, Books> storage = new HashMap<>();

    public void addBook(int id, String title, String author, String bookCategory) {
//        BookId newID = new BookId(id);
//        Books newBook = new Books("How to win friends and influence people", "Dale Carnegie", "Self Transformation");
//        storage.put(newID, newBook);
    }

    public Books getBook(int id) {
        return storage.get(new BookId(id));
    }

}
