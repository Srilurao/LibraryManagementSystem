public class Main {

    public static void main(String args[]){

        Library library = new Library();
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "12345"));
        library.addBook(new Book("1984", "George Orwell", "23456"));
        library.addBook(new Book("The bad boy", "J.R.R. Tolkien", "12346"));

        Borrower alice = new Borrower("Alice");
        library.addBorrower(alice);
        
        library.issueBook("12345", "Alice");
        library.issueBook("12346", "Alice");
        //library.returnBook("12345", "Alice");

        alice.getBorrowedBooks();

    }
    
}
