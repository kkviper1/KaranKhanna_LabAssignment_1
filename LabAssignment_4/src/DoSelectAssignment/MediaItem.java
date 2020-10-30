abstract public class MediaItem extends Item {
    private int yearOfRelease;
    private String genre;

    public MediaItem(int id, String title, int copies, int yearOfRelease, String genre) {
        super(id, title, copies);
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    public MediaItem() {
        

    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;

    }

    public String getGenre() {
        return this.genre;

    }

    public void setGenre(String genre) {
        this.genre = genre;

    }

    @Override
    public String print() {
        return "MediaItem [yearOfRelease=" + yearOfRelease + ", genre=" + genre + "]";

    }





}
