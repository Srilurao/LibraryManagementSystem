public class Book {

    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle(){
        return title;

    }

    public String getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    @Override
    public boolean equals(Object object){
        Book book = (Book) object;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return "Book{" +
               "title='" + title + '\'' +
               ", author='" + author + '\'' +
               ", isbn='" + isbn + '\'' +
               '}';
    }
    
}
