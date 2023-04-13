import java.util.List;

public class City {
    String name;
    String zipCode;
    List<Cinema> cinemas;

    public City(String name, String zipCode, List<Cinema> cinemas) {
        this.name = name;
        this.zipCode = zipCode;
        this.cinemas = cinemas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }
}
