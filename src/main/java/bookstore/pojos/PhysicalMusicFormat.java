package bookstore.pojos;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public abstract class PhysicalMusicFormat extends Product {
    private double playbackDurationMinutes;
    private String title;
    private String artist;
    private Date dateOfRelease;
    private double price;

    public PhysicalMusicFormat() {}

    public PhysicalMusicFormat(String title, Date dateOfRelease, String artist, double playbackDurationMinutes) {
        this.title = title;
        this.dateOfRelease = dateOfRelease;
        this.artist = artist;
        this.playbackDurationMinutes = playbackDurationMinutes;
    }

    public double getPlaybackDurationMinutes() {
        return playbackDurationMinutes;
    }

    public void setPlaybackDurationMinutes(double playbackDurationMinutes) {
        this.playbackDurationMinutes = playbackDurationMinutes;
    }

    public String getartist() {
        return artist;
    }

    public void setartist(String artist) {
        this.artist = artist;
    }

    public Date getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(Date dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PhysicalMusicFormat that = (PhysicalMusicFormat) o;
        return playbackDurationMinutes == that.playbackDurationMinutes && Objects.equals(artist, that.artist) && Objects.equals(dateOfRelease, that.dateOfRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playbackDurationMinutes, artist, dateOfRelease);
    }

    @Override
    public String toString() {
        return "PhysicalMusicFormat{" +
                "playbackDurationMinutes=" + playbackDurationMinutes +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", dateOfRelease=" + dateOfRelease +
                ", price=" + price +
                '}';
    }

    @Override
    public void initialize(Scanner input) {
        System.out.println("Enter title:");
        this.title = getInput(input, "title");

        System.out.println("Enter Artist:");
        this.artist = getInput(input, "artist");

        System.out.println("Enter duration of playback (in Minutes):");
        this.playbackDurationMinutes = getInput(input, 0);

        System.out.println("Enter Release Date (dd-MM-yyyy):");
        this.dateOfRelease = getInput(input, new Date());

        System.out.println("Enter price:");
        this.price = getInput(input, 0.0);
    }

    @Override
    public void edit(Scanner input) {
        System.out.println("Edit title [" + this.title + "]:");
        this.title = getInput(input, this.title);

        System.out.println("Edit artist [" + this.artist + "]:");
        this.artist = getInput(input, this.artist);

        System.out.println("Edit duration of playback (in Minutes) [" + this.playbackDurationMinutes + "]:");
        this.playbackDurationMinutes = getInput(input, this.playbackDurationMinutes);

        System.out.println("Edit date of release [" + this.dateOfRelease + "]:");
        this.dateOfRelease = getInput(input, this.dateOfRelease);

        System.out.println("Edit Price [" + this.price + "]:");
        this.price = getInput(input, this.price);
    }
}
