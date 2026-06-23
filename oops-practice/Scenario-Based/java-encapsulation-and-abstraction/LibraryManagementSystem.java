
abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void displayItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
    }
}

class Book extends LibraryItem {

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        LibraryItem book =
                new Book(101, "Java Programming", "James Gosling");

        LibraryItem magazine =
                new Magazine(102, "Tech Monthly", "Editorial Team");

        LibraryItem dvd =
                new DVD(103, "AI Documentary", "Discovery");

        System.out.println("===== BOOK =====");
        book.displayItemDetails();
        System.out.println("Loan Duration : " + book.getLoanDuration() + " Days");

        System.out.println("\n===== MAGAZINE =====");
        magazine.displayItemDetails();
        System.out.println("Loan Duration : " + magazine.getLoanDuration() + " Days");

        System.out.println("\n===== DVD =====");
        dvd.displayItemDetails();
        System.out.println("Loan Duration : " + dvd.getLoanDuration() + " Days");
    }
}
