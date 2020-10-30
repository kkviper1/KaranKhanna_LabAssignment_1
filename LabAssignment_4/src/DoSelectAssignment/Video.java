/**
 * 
 * 
 * @author karan
 *
 * Video class extends MediaItem class by adding a field called director specifically for Video Items. The class also overrides the
 * print() method by printing the field for director alongside other fields
 * 
 */
public class Video extends MediaItem {
    private String director;

    public Video(int id, String title, int copies, int yearOfRelease, String genre, String director) {
            super(id,title,copies,yearOfRelease,genre);
            this.director = director;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String print() {
        super.print();
        return("director: " + this.getDirector());
    }

    public Video() {

    }


}
