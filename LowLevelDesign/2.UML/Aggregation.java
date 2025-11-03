import java.util.ArrayList;
import java.util.List;

class Library {
    private String name;
    private List<Book> books;
    Library(String name) {
        this.name = name;
        books = new ArrayList<Book>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.err.println("Successfully added book with title: " + book.getName());
    }
    public Book removeBook(String id) {
        for (Book book : books) {
            if (book.getId() == id) {
                books.remove(book);
                System.err.println("Successfully removed book with title: " + book.getName());
                return book;
            }
        }
        return null;
    }

}

class Book {
    private String name;
    private String id;
    Book(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public String getId() {
        return this.id;
    }
}

public class Aggregation {

    public static void main(String[] args) {
        Book harryPotter1 = new Book("Harry Potter and the sorcerer of stone", "hp1");
        Book harryPotter2 = new Book("Harry Potter and the chamber of secrets", "hp2");
        Book richDadPoorDad = new Book("Rich Dad Poor Dad", "rp1");
        Book macbeth = new Book("Macbeth by William Shakespeare", "mb1");
        Book tagore = new Book("Short stories by Rabindranath Tagore", "rn1");

        Library library = new Library("National Library");
        library.addBook(tagore);
        library.addBook(harryPotter1);
        library.addBook(harryPotter2);
        library.addBook(richDadPoorDad);
        library.addBook(macbeth);

        library.removeBook("hp2");

    }
    
}
