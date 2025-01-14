package Q2;

public class Book {
    String bookTitle, author, ISBN;
    int numOfCopies;

    public String getbookTitle() {
        return bookTitle;
    }
    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return ISBN;
    }
    public int getNumOfCopies() {
        return numOfCopies;
    }
    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    public Book(String bookTitle, String author, String ISBN, int numOfCopies) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.ISBN   = ISBN;
        this.numOfCopies = numOfCopies;
    }

    public void display() {
        System.out.println("---book details------");
        System.out.println("bookTitle: " + bookTitle);
        System.out.println("author: " + author);
        System.out.println("isbn: " + ISBN);
        System.out.println("numOfCopies: " + numOfCopies);
        System.out.println("---------------------");

    }
}
