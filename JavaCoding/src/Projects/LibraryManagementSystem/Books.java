package Projects.LibraryManagementSystem;

class BookStorage {

}
class Books {
    String title;
    String author;

    Books(String title, String author) {
        this.author = author;
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return  this.author;
    }

    String setAuthor(String author) {
        this.author = author;
        return this.author;
    }

    String setTitle() {
        this.title = title;
        return this.title;
    }
}
