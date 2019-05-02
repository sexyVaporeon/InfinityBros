package InfinityBros.models;

public class User {

    private int userID;
    private String email;
    private String password;
    private UserMovies userMovies;

    public User(int userID, String email, String password) {
        this.userID = userID;
        this.email = email;
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addMovie(Movie movie){
        this.userMovies.addMovie(movie);
    }

    public boolean removeMovie(String title){
        return userMovies.removeMovie(title);
    }

    public boolean checkMovie(String title,boolean check){
        return userMovies.checkMovie(title,check);
    }
}
