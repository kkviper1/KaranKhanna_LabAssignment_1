/**
 * 
 * @author karan
 *
 * Class JournalPaper extends WrittenItem by providing functionalities for Journal Papers i.e a field for year published.
 * The class also implements the abstract method print() which prints all the fields in the same manner as an overriden toString()
 *
 */
public class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int id, String title, int copies, String authorName, String publicationName, int noOfPages,
                        int yearPublished) {
                            super(id, title, copies, authorName, publicationName, noOfPages);
                            this.yearPublished = yearPublished;
        
    }

    @Override
    String print() {
        return ("JournalPaper [yearPublished=" + yearPublished + ", authorName=" + authorName
                + ", publicationName=" + publicationName + ", noOfPages=" + noOfPages + ", id=" + id + ", title="
                + title + ", copies=" + copies + "]");

    }

    public int getYearPublished() {
        return this.yearPublished;

    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public JournalPaper() {
        
    }

}
