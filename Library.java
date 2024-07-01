import java.util.HashSet;
import java.util.LinkedList;

public class Library {

    private HashSet<Book> books;
    private LinkedList<Borrower> borrowers;

    public Library(){
        books = new HashSet<>();
        borrowers = new LinkedList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addBorrower(Borrower borrower){
        borrowers.add(borrower);
    }

    public void issueBook(String isbn, String borrowerName){
        Book book = books.stream().filter(b -> b.getIsbn().equals(isbn)).findFirst().orElse(null);
        Borrower borrower = borrowers.stream().filter(bo -> bo.name.equals(borrowerName)).findFirst().orElse(null);

        if (book != null && borrower != null) {
            borrower.borrowBook(book);
            System.out.println("Book issued: " + book);
        } else {
            System.out.println("Book or Borrower not found");
        }
    }

    public void returnBook(String isbn, String borrowerName) {
        Borrower borrower = borrowers.stream().filter(b -> b.name.equals(borrowerName)).findFirst().orElse(null);
        if (borrower != null) {
            Book book = borrower.getBorrowedBooks().stream().filter(b -> b.getIsbn().equals(isbn)).findFirst().orElse(null);
            if (book != null) {
                borrower.returnBook(book);
                System.out.println("Book returned: " + book);
            } else {
                System.out.println("Book not found among the borrower's books");
            }
        } else {
            System.out.println("Borrower not found");
        }
    }
    
}
