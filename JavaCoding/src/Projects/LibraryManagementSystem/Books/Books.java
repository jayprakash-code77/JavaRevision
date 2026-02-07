package Projects.LibraryManagementSystem.Books;



abstract class Books {
    String title;
    String author;
    String bookCategory;

    Books(String title, String author, String bookCategory) {
        this.author = author;
        this.title = title;
        this.bookCategory = bookCategory;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return  this.author;
    }

    String getBookCategory() {
        return this.bookCategory;
    }

    String setTitle(String title) {
        this.title = title;
        return this.title;
    }

    String setAuthor(String author) {
        this.author = author;
        return this.author;
    }
}



class LiteraryFiction extends Books {
    String bookCategory = "Literary Fiction";
    LiteraryFiction(String title, String author, String bookCategory) {
        super(title, author, bookCategory);
    }
}


