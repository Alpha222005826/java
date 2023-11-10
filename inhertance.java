 // Defining the Pages interface
interface Pages {
    void displayPageInfo();
}

// Defining the Library class that implements Pages
class Library implements Pages {
    String libraryName;

    public Library(String name) {
        this.libraryName = name;
    }

    public void displayPageInfo() {
        System.out.println("This is a Library named " + libraryName);
    }
}

// Defining the Books class that extends Library
class Books extends Library {
    String bookTitle;

    public Books(String libraryName, String title) {
        super(libraryName);
        this.bookTitle = title;
    }

    public void displayBookDetails() {
        System.out.println("This is the book titled '" + bookTitle + "' in the Library.");
    }
}

// Define the Category class that extends Books
class Category extends Books {
    String categoryName;

    public Category(String libraryName, String title, String category) {
        super(libraryName, title);
        this.categoryName = category;
    }

    public void displayCategoryInfo() {
        System.out.println("This book belongs to the category '" + categoryName + "'.");
    }
}

// Define the Author class that extends Category
class Author extends Category {
    String authorName;

    public Author(String libraryName, String title, String category, String author) {
        super(libraryName, title, category);
        this.authorName = author;
    }

    public void displayAuthorInfo() {
        System.out.println("This book is authored by " + authorName + ".");
    }
}

// Define the PagesExtended class that extends Author
class PagesExtended extends Author {
    int pageCount;

    public PagesExtended(String libraryName, String title, String category, String author, int pageCount) {
        super(libraryName, title, category, author);
        this.pageCount = pageCount;
    }

    public void displayPageInfo() {
        System.out.println("This book has " + pageCount + " pages.");
    }
}
public class inhertance {
    public static void main(String[] args) {
        Pages pages = new PagesExtended("My Library", "Book Title", "Fiction", "John Doe", 300);

        pages.displayPageInfo();

        Author author = new Author("Library ABC", "Book XYZ", "Mystery", "Jane Smith");
        author.displayAuthorInfo();

        Category category = new Category("Library X", "Novel Y", "Adventure");
        category.displayCategoryInfo();

        Books book = new Books("Library 123", "Science Book");
        book.displayBookDetails();

        Library library = new Library("Library Name");
        library.displayPageInfo();

        //calling all inhertance classes in the above main class above
    }
 
}
