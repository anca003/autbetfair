package oop.libraryHomework;

public class Library {
    public static void main(String[] args) {
        Author author = new Author("Hector Garcia", "hectorGarcia@gmail.com");
        Book book = new Book("IKIGAI", 2017, author, 100);
        System.out.println(book);
    }

}
