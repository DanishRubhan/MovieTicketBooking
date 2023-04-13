import java.util.List;

public class Hall {
    int hallId;
    String hallName;
    int numberOfScreens;
    List<Screen> screens;

    public Hall(int hallId, String hallName, int numberOfScreens, List<Screen> screens) {
        this.hallId = hallId;
        this.hallName = hallName;
        this.numberOfScreens = numberOfScreens;
        this.screens = screens;
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    public void setNumberOfScreens(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }
}
