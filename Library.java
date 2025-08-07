import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    public Book findBookById(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId) return b;
        }
        return null;
    }

    public User findUserById(int userId) {
        for (User u : users) {
            if (u.getUserId() == userId) return u;
        }
        return null;
    }

    public void issueBookToUser(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);
        if (book != null && user != null) {
            user.borrowBook(book);
        } else {
            System.out.println("Book or User not found.");
        }
    }

    public void returnBookFromUser(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);
        if (book != null && user != null) {
            user.returnBook(book);
        } else {
            System.out.println("Book or User not found.");
        }
    }

    public void displayAllBooks() {
        for (Book b : books) {
            b.displayBookInfo();
        }
    }

    public void displayAllUsers() {
        for (User u : users) {
            u.displayUserInfo();
        }
    }
}