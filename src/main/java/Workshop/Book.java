package Workshop;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private String genre;
    private int pages;

    public Book(String title, String author, String publisher, String genre, int pages) { // Constructor
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.pages = pages;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }

    public String getGenre(){
        return genre;
    }

    public int getPages(){
        return pages;
    }

    @Override
    public String toString(){
        return "Title: " + title + " Author: " + author + " Publisher: " + publisher + " Genre: " + genre + " Pages: " + pages + "\n";
    }
}
