import java.util.Arrays;

public class ConferencePaper extends  Publication {

    private String conName;
    private String[] editors;
    private int pageNum;
    private String location;


    public ConferencePaper(String title, String[] author, String publisher, int year, String conName, String[] editors, int pageNum, String location) {

        super(title, author, publisher, year);
        this.conName = conName;
        this.editors = editors;
        this.pageNum = pageNum;
        this.location = location;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public void setEditors(String[] editors) {
        this.editors = editors;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getConName() {
        return conName;
    }

    public String[] getEditors() {
        return editors;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String getTitle(){
        return "conference"+getTitle();
    }
    @Override
    public String toString() {
        return "ConferencePaper{" + super.toString() +
                " conName='" + conName + '\'' +
                ", editors=" + Arrays.toString(editors) +
                ", pageNum=" + pageNum +
                ", location='" + location + '\'' +
                '}';
    }
}
