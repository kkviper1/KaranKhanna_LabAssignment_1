/**
 * 
 * 
 * @author karan
 *
 *	CD class extends MediaItem by providing functionalities for CD items, CD provides a field for artist and overrides the print function to print
 *	artist field alongside other fields too 
 *
 */
public class CD extends MediaItem {

    private String artist;

    public CD() {
        super();
        artist = "karan";
    }

    public CD(int id, String title, int copies, int yearOfRelease, String genre, String artist) {
        super(id,title,copies,yearOfRelease,genre);
        this.artist = artist;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String print() {
        super.print();
        return("artist: " + this.getArtist());
    }

}
