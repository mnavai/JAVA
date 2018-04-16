public class JournalPaper extends Publication{

    String journalName;
    private int volume;
    private int issue;
    private int pageNumbers;



    public JournalPaper(String title, String[] author, String publisher, int year, String journalName, int volume, int issue, int pageNumbers) {

        super(title, author, publisher, year);
        this.journalName = journalName;
        this.volume = volume;
        this.issue = issue;
        this.pageNumbers = pageNumbers;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }


    public String getJournalName() {
        return journalName;
    }

    public int getVolume() {
        return volume;
    }

    public int getIssue() {
        return issue;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }


    @Override
    public String toString() {
        return "JournalPaper{" + super.toString() +
                " journalName='" + journalName + '\'' +
                ", volume=" + volume +
                ", issue=" + issue +
                ", pageNumbers=" + pageNumbers +
                '}';
    }
}
