package InfinityBros.models;

public class Movie {
    private int movieID;
    private String title;
    private String releaseDate;
    private int chronoID;
    private boolean checked = false;

    public Movie(int movieID, String title, String releaseDate, int chronoID) {
        this.movieID = movieID;
        this.title = title;
        this.releaseDate = releaseDate;
        this.chronoID = chronoID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getChronoID() {
        return chronoID;
    }

    public void setChronoID(int chronoID) {
        this.chronoID = chronoID;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
