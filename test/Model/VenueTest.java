package Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stormwind on 27/05/2016.
 */
public class VenueTest
{
    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void testGetCvr() throws Exception
    {
        Venue venue = new Venue(12345678, "SKT T1", "Staples Center", 44383920);
        int result = venue.getCvr();
        int expResult = 12345678;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetCvr() throws Exception
    {
        Venue venue = new Venue(12345678, "SKT T1", "Staples Center", 44383920);
        venue.setCvr(98765433);
        int result = venue.getCvr();
        int expResult = 98765433;

        assertEquals(expResult, result);
    }

    @Test
    public void testGetPhoneNumber() throws Exception
    {
        Venue venue = new Venue(12345678, "SKT T1", "Staples Center", 44383920);
        int result = venue.getPhoneNumber();
        int expResult = 44383920;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetPhoneNumber() throws Exception
    {
        Venue venue = new Venue(12345678, "SKT T1", "Staples Center", 44383920);
        venue.setPhoneNumber(42333742);
        int result = venue.getPhoneNumber();
        int expResult = 42333742;

        assertEquals(expResult, result);
    }

    @Test
    public void testGetName() throws Exception
    {
        Venue venue = new Venue(12345678, "SKT T1", "Staples Center", 44383920);
        String result = venue.getName();
        String expResult = "SKT T1";

        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() throws Exception
    {
        Venue venue = new Venue(12345678, "SKT T1", "Staples Center", 44383920);
        venue.setName("RNG");
        String result = venue.getName();
        String expResult = "RNG";

        assertEquals(expResult, result);
    }

    @Test
    public void testGetLocation() throws Exception
    {
        Venue venue = new Venue(12345678, "SKT T1", "Staples Center", 44383920);
        String result = venue.getLocation();
        String expResult = "Staples Center";

        assertEquals(expResult, result);
    }

    @Test
    public void testSetLocation() throws Exception
    {
        Venue venue = new Venue(12345678, "SKT T1", "Staples Center", 44383920);
        venue.setLocation("Madison Square Garden");
        String result = venue.getLocation();
        String expResult = "Madison Square Garden";

        assertEquals(expResult, result);
    }

}