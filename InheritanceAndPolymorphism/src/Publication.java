import java.util.Arrays;

public abstract class Publication {


    private String title;
    private String[] author;
    private String publisher;
    private int year;

    public Publication(String title, String[] author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String[] getAuthor() {
        return author;
    }



    @Override
    public String toString() {
        return "Publication{" +
                "author=" + Arrays.toString(author) +
                " Title: " + title +
                " Publisher: " + publisher +
                " Year: " + year +
                '}';
    }

}
