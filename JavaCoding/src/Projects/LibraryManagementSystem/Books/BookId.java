package Projects.LibraryManagementSystem.Books;

import java.util.Objects;

class BookId {
    //    storing the id passed during object creation
    private final int id;

    //    BookId Constructor
    BookId(int id) {
        this.id = id;
    }

    //    This checks weather two objects are actually equal or not
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookId bookId = (BookId) o;
        return id == bookId.id;
    }

    //    This hashCode methods return the hashed value of the integer "id", that is passed to this function
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

