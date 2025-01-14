package Q2;

import java.util.Arrays;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

class BookCollection {
    private String owner;
    private Book[] books;

    public BookCollection(String owner, Book[] books) {
        this.owner = owner;
        this.books = books;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book Collection of ").append(owner).append(":\n");
        for (Book book : books) {
            sb.append(book).append("\n");
        }
        return sb.toString();
    }

    public boolean hasBook(Book b) {
        for (Book book : books) {
            if (book.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public void sort() {
        Arrays.sort(books, (b1, b2) -> {
            int titleCompare = b1.getTitle().compareTo(b2.getTitle());
            if (titleCompare == 0) {
                return b1.getAuthor().compareTo(b2.getAuthor());
            } else {
                return titleCompare;
            }
        });
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java in depth", "John Smith");
        Book book2 = new Book("Head First Java", "Kathy Sierra");
        Book book3 = new Book("Java: A Beginner's Guide", "Herbert Schildt");

        BookCollection collection = new BookCollection("John Doe", new Book[] {book1, book2, book3});

        System.out.println("Before sorting:");
        System.out.println(collection);

        System.out.println("Does the collection have 'Java in depth'? " + collection.hasBook(book1));

        collection.sort();

        System.out.println("After sorting:");
        System.out.println(collection);
    }
}