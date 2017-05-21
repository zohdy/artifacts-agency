package Model;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Zonde on 13-05-2016.
 */

public class Artist extends Person
{
    private String cpr;
    private String artistName;

    public Artist(String firstName, String lastName, String address, int phoneNumber,String email, String cpr, String artistName)
    {
        super(firstName, lastName, address, phoneNumber,email);
        this.cpr = cpr;
        this.artistName = artistName;
    }

    public String getCpr()
    {
        return cpr;
    }

    public void setCpr(String cpr)
    {
        this.cpr = cpr;
    }

    public String getArtistName()
    {
        return artistName;
    }

    public void setArtistName(String artistName)
    {
        this.artistName = artistName;
    }

    public String toString() {
        return artistName;
    }


}
