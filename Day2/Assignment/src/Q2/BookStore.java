import java.awt.print.Book;

public class BookStore {
private int SIZE;
private String bookStoreName;
private Book[] books;

public BookStore(int size, String bookStoreName){
    this.SIZE = size;
    this.bookStoreName = bookStoreName;
    this.books = new Book[SIZE];
    init();
}

private void init(){
    books[0]=new Book("rich dad poor dad", "RK", "54545A12", 10);
    books[1]=new Book("basic physics", "abc", "54595A12", 20);
    books[2]=new Book("pointer in c", "YK", "94545A12", 8);
    books[3]=new Book("head first core java", "foo", "50545A12", 20);
    books[4]=new Book("spring in action", "bar", "14545A12", 10);
    }
}

public void sellBook(String bookTitle, int noOfCopies){
    boolean available = false;
    for (int i = 0; i < SIZE; i++) {
        if (books[i].getbookTitle().equals(bookTitle)) {
            available = true;
            if (books[i].getNumOfCopies() >= noOfCopies) {
                books[i].setNumOfCopies(books[i].getNumOfCopies() - noOfCopies);
                System.out.println("Book sold successfully");
            } else {
                System.out.println("Required copies not available");
            }
        }else{
            System.out.println("Required book not available");
        }
    }
}

public void orderBook(String bookTitle, int noOfCopies) {
    boolean available = false;
    for (int i = 0; i < SIZE; i++) {
        if (books[i].getbookTitle().equals(bookTitle)) {
            available = true;
            books[i].setNumOfCopies(books[i].getNumOfCopies() + quantity);
            System.out.println("Book ordered successfully");
        }
    }
    if (!available) {
        System.out.println("Book is not available");
    }
}

public void display() {
    System.out.println("**********Book store *****************");
    System.out.println(bookStoreName);
    System.out.println("^^^^^^^^^^^^^^^Books details^^^^^^^^^^^^^^^^^^^^^^^^^");
    for(Book book: books) {
        book.display();
    }
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

}

public static void main() {
    BookStore store1=new BookStore(5, "Bengaluru Book Store");
    store1.sellBook("rich dad poor dad", 5);
    store1.display();
}