public class Book {
    // Attributes
    public String name;
    public String author;
    public double height;

    // Constructor
    public Book(String name, String author, double height) {
        this.name = name;
        this.author = author;
        this.height = height;
    }

    public void printBook() {
        System.out.print("Book: " + name);
        System.out.print(" Author: " + author);
        System.out.print(" Height: " + height);
        System.out.println();
    }
}

