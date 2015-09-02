package nyc.c4q;

/**
 * Created by sufeizhao on 8/30/15.
 */
public class Members {

    private int id, dob_month, dob_day, dob_year;
    private String name, city, state;

    public Members(int id, String name, int dob_month, int dob_day, int dob_year, String city, String state) {
        this.city = city;
        this.dob_day = dob_day;
        this.dob_month = dob_month;
        this.dob_year = dob_year;
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDob_day() {
        return dob_day;
    }

    public void setDob_day(int dob_day) {
        this.dob_day = dob_day;
    }

    public int getDob_month() {
        return dob_month;
    }

    public void setDob_month(int dob_month) {
        this.dob_month = dob_month;
    }

    public int getDob_year() {
        return dob_year;
    }

    public void setDob_year(int dob_year) {
        this.dob_year = dob_year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
