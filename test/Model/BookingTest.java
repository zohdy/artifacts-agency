package Model;

import org.junit.Before;
import org.junit.Test;


import java.sql.Date;

import static org.junit.Assert.*;

/**
 * Created by Stormwind on 27/05/2016.
 */
public class BookingTest {
    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void testGetPrice() throws Exception
    {
        Booking booking = new Booking();
        int result = booking.getPrice();
        int expResult = 0;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetPrice() throws Exception
    {
        Booking booking = new Booking();
        booking.setPrice(1500);
        int result = booking.getPrice();
        int expResult = 1500;

        assertEquals(expResult, result);
    }

    @Test
    public void testGetDate() throws Exception
    {
        Booking booking = new Booking();
        Date result = booking.getDate();
        Date expResult = null;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetDate() throws Exception
    {
        Booking booking = new Booking();
        Date date = new Date(2016/06/27);
        booking.setDate(date);
        Date result = booking.getDate();
        Date expResult = date;

        assertEquals(expResult, result);
    }

    @Test
    public void testGetArtist() throws Exception
    {
        Booking booking = new Booking();
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        Artist result = booking.getArtist();
        Artist expResult = null;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetArtist() throws Exception
    {
        Booking booking = new Booking();
        Artist artist = new Artist("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk", "0912915634", "Shin");
        booking.setArtist(artist);
        Artist result = booking.getArtist();
        Artist expResult = artist;

        assertEquals(expResult, result);
    }

    @Test
    public void testGetContactPerson() throws Exception
    {
        Booking booking = new Booking();
        ContactPerson contactPerson = new ContactPerson("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk");
        ContactPerson result = booking.getContactPerson();
        ContactPerson expResult = null;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetContactPerson() throws Exception
    {
        Booking booking = new Booking();
        ContactPerson contactPerson = new ContactPerson("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk");
        booking.setContactPerson(contactPerson);
        ContactPerson result = booking.getContactPerson();
        ContactPerson expResult = contactPerson;

        assertEquals(expResult, result);
    }

    @Test
    public void testGetVenue() throws Exception
    {
        Booking booking = new Booking();
        Venue venue = new Venue(12345678, "SKT T1", "Staples Center", 44383920);
        Venue result = booking.getVenue();
        Venue expResult = null;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetVenue() throws Exception
    {
        Booking booking = new Booking();
        Venue venue = new Venue(12345678, "SKT T1", "Staples Center", 44383920);
        booking.setVenue(venue);
        Venue result = booking.getVenue();
        Venue expResult = venue;

        assertEquals(expResult, result);
    }

    @Test
    public void testGetComment() throws Exception
    {
        Booking booking = new Booking();
        String result = booking.getComment();
        String expResult = null;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetComment() throws Exception
    {
        Booking booking = new Booking();
        booking.setComment("WEEEEE! GOOD");
        String result = booking.getComment();
        String expResult = "WEEEEE! GOOD";

        assertEquals(expResult, result);
    }

}