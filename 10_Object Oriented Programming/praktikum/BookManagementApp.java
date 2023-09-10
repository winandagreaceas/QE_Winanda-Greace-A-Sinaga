import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class BookManagementApp {
    private List<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BookManagementApp app = new BookManagementApp();
        app.run();
    }

    public void run() {
        System.out.println("Welcome to book management app.");
        while (true) {
            System.out.println("Please choose your menu:");
            System.out.println("1. Create a new book");
            System.out.println("2. Get all books");
            System.out.println("3. Get book by ID");
            System.out.println("4. Update book");
            System.out.println("5. Delete book");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            switch (choice) {
                case 1:
                    createBook();
                    break;
                case 2:
                    getAllBooks();
                    break;
                case 3:
                    getBookById();
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 6:
                    System.out.println("Bye...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void createBook() {
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter category:");
        String category = scanner.nextLine();

        Book book = new Book(title, author, category);
        books.add(book);
        System.out.println("Book created!");
    }

    public void getAllBooks() {
        System.out.println("List of all books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void getBookById() {
        System.out.println("Enter book ID:");
        UUID id = UUID.fromString(scanner.nextLine());
        for (Book book : books) {
            if (book.getId().equals(id)) {
                System.out.println("Book found:");
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }

    public void updateBook() {
        System.out.println("Enter book ID:");
        UUID id = UUID.fromString(scanner.nextLine());
        for (Book book : books) {
            if (book.getId().equals(id)) {
                System.out.println("Enter new title:");
                String newTitle = scanner.nextLine();
                System.out.println("Enter new author:");
                String newAuthor = scanner.nextLine();
                System.out.println("Enter new category:");
                String newCategory = scanner.nextLine();

                book = new Book(newTitle, newAuthor, newCategory);
                books.remove(book);
                books.add(book);

                System.out.println("Book updated!");
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }

    public void deleteBook() {
        System.out.println("Enter book ID:");
        UUID id = UUID.fromString(scanner.nextLine());
        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                System.out.println("Book deleted!");
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }
}