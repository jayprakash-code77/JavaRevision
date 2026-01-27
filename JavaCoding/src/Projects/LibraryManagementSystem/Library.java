package Projects.LibraryManagementSystem;

import Projects.LibraryManagementSystem.Books;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {

        Books b1 = new Books("The Secret", "Rhonda Byrne");
        ArrayList<Books> BookStore = new ArrayList<>();
        BookStore.add(b1);


        System.out.println(BookStore.get(0).author);

        System.out.println("I am Library. Need books? Please follow " +
                "the instruction to: Issue a book, return a book, read a book");
    }
}
