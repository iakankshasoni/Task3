public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book book1 = new Book(1, "Java Basics", "James Gosling");
        Book book2 = new Book(2, "Effective Java", "Joshua Bloch");

        // Add books
        library.addBook(book1);
        library.addBook(book2);

        // Create users
        User user1 = new User(101, "Alice");
        User user2 = new User(102, "Bob");

        // Add users
        library.addUser(user1);
        library.addUser(user2);

        // Issue and return examples
        library.issueBookToUser(1, 101);
        library.issueBookToUser(2, 101);
        library.returnBookFromUser(1, 101);
        library.issueBookToUser(1, 102);

        // Display everything
        System.out.println("\nAll Books:");
        library.displayAllBooks();

        System.out.println("\nAll Users:");
        library.displayAllUsers();
    }
}