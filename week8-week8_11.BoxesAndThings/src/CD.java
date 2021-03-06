
public class CD implements ToBeStored {

    private String artist;
    private String title;
    private int publishingYear;
    private double weight = 0.1;

    public CD(String artist, String title, int publishigYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishigYear;
    }

    @Override
    public double weight() {
        return weight;
    }

    public String toString() {
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }
}
