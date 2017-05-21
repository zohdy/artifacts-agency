package Model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static org.junit.Assert.*;

/**
 * Created by Stormwind on 27/05/2016.
 */
public class DatabaseTest
{
    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void getInstance() throws Exception
    {
        assertSame(Database.getInstance(), Database.getInstance());
    }

    @Test
    public void connectToDatabase() throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/";
        Connection con = DriverManager.getConnection(url, "root", "1024Krystal");
        Assert.assertNotNull(con);
        Assert.assertTrue(con.isValid(0));
        con.close();
    }

    @Test
    public void insertContactPerson() throws Exception
    {

    }

    @Test
    public void deleteContactPerson() throws Exception {

    }

    @Test
    public void getContactPersons() throws Exception {

    }

    @Test
    public void updateContactPerson() throws Exception {

    }

    @Test
    public void insertArtist() throws Exception {

    }

    @Test
    public void updateArtist() throws Exception {

    }

    @Test
    public void getArtists() throws Exception {

    }

    @Test
    public void insertVenue() throws Exception {

    }

    @Test
    public void getVenues() throws Exception {

    }

    @Test
    public void deleteVenue() throws Exception {

    }

    @Test
    public void updateVenue() throws Exception {

    }

    @Test
    public void insertBooking() throws Exception {

    }

    @Test
    public void getBookings() throws Exception {

    }

    @Test
    public void deleteBooking() throws Exception {

    }

    @Test
    public void updateBooking() throws Exception {

    }

}