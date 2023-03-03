package Session10;

public class DAOPatternApplication {
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImp1();
        System.out.println("Book List:");
        for (Book book : bookDao.getAllBooks()){
            System.out.println("\nBookID : " + book.getBookID() + ", Name: " + book.getName() + " ");
        }
        Book book = bookDao.getAllBooks().get(0);
        book.setName("Harry Long");
        bookDao.updateBook(book);
        bookDao.getBook(0);
        System.out.println("Book : [BookID : " + book.getBookID() + ", Name : " + book.getName() + " ]");
    }
}
