package mod2;
class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("--- Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Technical extends Book {
    String subject;

    Technical(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    void display() {
        System.out.println("--- Technical Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}

class Story extends Technical {
    String genre;

    Story(String title, String author, String subject, String genre) {
        super(title, author, subject);
        this.genre = genre;
    }

    @Override
    void display() {
        System.out.println("--- Story Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}

public class BookOverrideDemo {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Technical("Java Programming", "Herbert Schildt", "Computer Science");
        Book b3 = new Story("Harry Potter", "J.K. Rowling", "Fantasy Fiction", "Fantasy");

        b1.display();
        System.out.println();
        b2.display();
        System.out.println();
        b3.display();
    }
}
