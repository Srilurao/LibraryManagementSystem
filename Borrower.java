import java.util.LinkedList;

public class Borrower {

    String name;
    private LinkedList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        borrowedBooks = new LinkedList<>();
    }
    
    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }

    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }

    public LinkedList<Book> getBorrowedBooks() {
        System.out.println("Borrowed books are: "+borrowedBooks);
        return borrowedBooks;
    }

    @Override
    public String toString() {
        return "Borrower{" +
               "name='" + name + '\'' +
               ", borrowedBooks=" + borrowedBooks +
               '}';
    }
}
