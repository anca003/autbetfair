package oop.libraryHomework;

public class Book {
    private String name;
    private int year;
    private Author author;
    private double price;

    public Book(String name, int year, Author author, double price) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getYear(){
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    private double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Book " + name +
                " ( " + price + " RON )" +
                ", by " + author +
                ", published in " + year;
    }


}
