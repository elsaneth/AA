import java.util.ArrayList;
import java.util.List;

public class BookSorting {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Book 1", "Author 1", 20));
        bookList.add(new Book("Book 2", "Author 2", 22.5));
        bookList.add(new Book("Book 3", "Author 3", 17));

        System.out.println("Before sorting:");
        bookList.forEach(Book::printBook);

        for (int i = 0; i < bookList.size(); i++) {
            for (int j = 1; j < (bookList.size() - i); j++) {
                if (bookList.get(j - 1).height > bookList.get(j).height) {
                    Book temp = bookList.get(j - 1);
                    bookList.set(j - 1, bookList.get(j));
                    bookList.set(j, temp);
                }
            }
        }

        System.out.println("After sorting:");
        bookList.forEach(Book::printBook);
    }
}