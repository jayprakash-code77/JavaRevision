package MediumJava;

class Library {
    String name = "Ramkishan Mission";
    int numOfBooks = 12000;

    int getNumOfBooks() {
        return numOfBooks;
    }
    String getName() {
        return name;
    }
}

public class AnonymousObject {
    public static void main(String args[]) {
        int numOfBooks = new Library().getNumOfBooks();
        System.out.println(numOfBooks);
    }
}
