package Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stormwind on 27/05/2016.
 */
public class PersonTest
{
    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void testGetAddress() throws Exception
    {
        Person person = new Person();
        String result = person.getAddress();
        String expResult = null;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddress() throws Exception
    {
        Person person = new Person();
        person.setAddress("Studsgaardsgade 5");
        String result = person.getAddress();
        String expResult = "Studsgaardsgade 5";

        assertEquals(expResult, result);
    }

    @Test
    public void testGetFirstName() throws Exception
    {
        Person person = new Person();
        String result = person.getFirstName();
        String expResult = null;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetFirstName() throws Exception
    {
        Person person = new Person();
        person.setFirstName("Xinkai");
        String result = person.getFirstName();
        String expResult = "Xinkai";

        assertEquals(expResult, result);
    }

    @Test
    public void testGetLastName() throws Exception
    {
        Person person = new Person();
        String result = person.getLastName();
        String expResult = null;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetLastName() throws Exception
    {
        Person person = new Person();
        person.setLastName("Huang");
        String result = person.getLastName();
        String expResult = "Huang";

        assertEquals(expResult, result);
    }

    @Test
    public void testGetPhoneNumber() throws Exception
    {
        Person person = new Person();
        int result = person.getPhoneNumber();
        int expResult = 0;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetPhoneNumber() throws Exception
    {
        Person person = new Person();
        person.setPhoneNumber(23456985);
        int result = person.getPhoneNumber();
        int expResult = 23456985;

        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmail() throws Exception
    {
        Person person = new Person();
        String result = person.getEmail();
        String expResult = null;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() throws Exception
    {
        Person person = new Person();
        person.setEmail("xink0001@stud.kea.dk");
        String result = person.getEmail();
        String expResult = "xink0001@stud.kea.dk";

        assertEquals(expResult, result);
    }
}