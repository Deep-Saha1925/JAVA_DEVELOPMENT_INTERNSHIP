import java.util.*;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users = new ArrayList<>();

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.getTitle());
    }

    public void showAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
        if (books.isEmpty()) {
            System.out.println("No books available.");
        }
    }

    public void issueBook(String title, User user) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                if (!b.isIssued()) {
                    b.issue();
                    System.out.println("Book issued to " + user.getName());
                    return;
                } else {
                    System.out.println("Book is already issued.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title, User user) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                if (b.isIssued()) {
                    b.returnBook();
                    System.out.println("Book returned by " + user.getName());
                    return;
                } else {
                    System.out.println("Book was not issued.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    public void deleteBook(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                System.out.println("Book deleted.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getName());
    }

    public void showAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            for (User u : users) {
                System.out.println(u);
            }
        }
    }

    public User findUserById(int id) {
        for (User u : users) {
            if (u.getUserId() == id) return u;
        }
        return null;
    }
}
