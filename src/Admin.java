public class Admin extends Person {

    public Admin(String name, String address, String emailId, String phoneNumber) {
        super(name, address, emailId, phoneNumber);
    }

    public boolean addShow(ShowTime showTime) {
        // Add show time to the database or any other storage mechanism
        // Return true if successful, false otherwise
        return true;
    }
    public boolean updateShow(ShowTime showTime) {
        // Update show time to the database or any other storage mechanism
        // Return true if successful, false otherwise
        return true;
    }
    public boolean deleteShow(ShowTime showTime) {
        // Delete show time to the database or any other storage mechanism
        // Return true if successful, false otherwise
        return true;
    }
    public boolean addMovie(Movie movie) {
        // Add Movie to the database or any other storage mechanism
        // Return true if successful, false otherwise
        return true;
    }
    public boolean deleteMovie(Movie movie) {
        // Delete Movie to the database or any other storage mechanism
        // Return true if successful, false otherwise
        return true;
    }
}
