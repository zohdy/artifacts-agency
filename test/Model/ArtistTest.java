package Model;

import javafx.beans.property.SimpleStringProperty;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stormwind on 27/05/2016.
 */
public class ArtistTest
{
    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void testGetCpr() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        String result = artist.getCpr();
        String expResult = "0912915634";

        assertEquals(expResult, result);
    }

    @Test
    public void testSetCpr() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        artist.setCpr("1111910987");
        String result = artist.getCpr();
        String expResult = "1111910987";

        assertEquals(expResult, result);
    }

    // -----------------------------------------------------------
    @Test
    public void testGetArtistName() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        String result = artist.getArtistName();
        String expResult = "Shin";

        assertEquals(expResult, result);
    }

    @Test
    public void testSetArtistName() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        artist.setArtistName("FlyJ");
        String result = artist.getArtistName();
        String expResult = "FlyJ";

        assertEquals(expResult, result);
    }

    // -----------------------------------------------------------

    @Test
    public void testGetAddress() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        String result = artist.getAddress();
        String expResult = "Studsgaardsgade 5";

        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddress() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        artist.setAddress("Lygten 37");
        String result = artist.getAddress();
        String expResult = "Lygten 37";

        assertEquals(expResult, result);
    }

    @Test
    public void testGetFirstName() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        String result = artist.getFirstName();
        String expResult = "Xinkai";

        assertEquals(expResult, result);
    }

    @Test
    public void testSetFirstName() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        artist.setFirstName("Jeff");
        String result = artist.getFirstName();
        String expResult = "Jeff";

        assertEquals(expResult, result);
    }

    @Test
    public void testGetLastName() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        String result = artist.getLastName();
        String expResult = "Huang";

        assertEquals(expResult, result);
    }

    @Test
    public void testSetLastName() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        artist.setLastName("Kwarteng");
        String result = artist.getLastName();
        String expResult = "Kwarteng";

        assertEquals(expResult, result);
    }

    @Test
    public void testGetPhoneNumber() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        int result = artist.getPhoneNumber();
        int expResult = 23456989;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetPhoneNumber() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        artist.setPhoneNumber(44567890);
        int result = artist.getPhoneNumber();
        int expResult = 44567890;

        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmail() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        String result = artist.getEmail();
        String expResult = "xink0001@stud.kea.dk";

        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() throws Exception
    {
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        artist.setEmail("Jeff0221@stud.kea.dk");
        String result = artist.getEmail();
        String expResult = "Jeff0221@stud.kea.dk";

        assertEquals(expResult, result);
    }
}