package Model;

/**
 * Created by Zonde on 13-05-2016.
 */

public class Venue
{
    private int cvr;
    private String name;
    private String location;
    private int phoneNumber;

    public Venue(int cvr, String name, String location, int phoneNumber) {
        this.cvr = cvr;
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    // .--

    public int getCvr() {
        return cvr;
    }

    public void setCvr(int cvr) {
        this.cvr = cvr;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String toString() {
        return name;
    }
}
