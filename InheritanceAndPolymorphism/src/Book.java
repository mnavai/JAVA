public class Book extends  Publication{

    private int edition ;
    private int no_Of_pages;
    private int isbn_number;

    public Book(String title, String[] author, String publisher, int year, int edition, int no_Of_pages, int isbn_number) {
        super(title, author, publisher, year);
        this.edition = edition;
        this.no_Of_pages = no_Of_pages;
        this.isbn_number = isbn_number;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setNo_Of_pages(int no_Of_pages) {
        this.no_Of_pages = no_Of_pages;
    }

    public void setIsbn_number(int isbn_number) {
        this.isbn_number = isbn_number;
    }
    public int getEdition() {
        return edition;
    }

    public int getNo_Of_pages() {
        return no_Of_pages;
    }

    public int getIsbn_number() {
        return isbn_number;
    }



    @Override
    public String toString() {
        return "Book{" + super.toString() +
                " edition=" + edition +
                ", no_Of_pages=" + no_Of_pages +
                ", isbn_number=" + isbn_number +
                '}';
    }
}
