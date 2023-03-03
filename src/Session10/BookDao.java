package Session10;

interface BookDao {
    public java.util.List<Book> getAllBooks();
    public Book getBook(int BookID);
    public void updateBook(Book book);
    public void deleteBook(Book book);
}
