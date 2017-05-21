package Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stormwind on 27/05/2016.
 */
public class ContactPersonTest
{
    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void testGetAddress() throws Exception
    {
        ContactPerson contactPerson = new ContactPerson("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk");
        String result = contactPerson.getAddress();
        String expResult = "Studsgaardsgade 5";

        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddress() throws Exception
    {
        ContactPerson contactPerson = new ContactPerson("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk");
        contactPerson.setAddress("Lygten 37");
        String result = contactPerson.getAddress();
        String expResult = "Lygten 37";

        assertEquals(expResult, result);
    }

    @Test
    public void testGetFirstName() throws Exception
    {
        ContactPerson contactPerson = new ContactPerson("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk");
        String result = contactPerson.getFirstName();
        String expResult = "Xinkai";

        assertEquals(expResult, result);
    }

    @Test
    public void testSetFirstName() throws Exception
    {
        ContactPerson contactPerson = new ContactPerson("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk");
        contactPerson.setFirstName("Jeff");
        String result = contactPerson.getFirstName();
        String expResult = "Jeff";

        assertEquals(expResult, result);
    }

    @Test
    public void testGetLastName() throws Exception
    {
        ContactPerson contactPerson = new ContactPerson("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk");
        String result = contactPerson.getLastName();
        String expResult = "Huang";

        assertEquals(expResult, result);
    }

    @Test
    public void testSetLastName() throws Exception
    {
        ContactPerson contactPerson = new ContactPerson("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk");
        contactPerson.setLastName("Kwarteng");
        String result = contactPerson.getLastName();
        String expResult = "Kwarteng";

        assertEquals(expResult, result);
    }

    @Test
    public void testGetPhoneNumber() throws Exception
    {
        ContactPerson contactPerson = new ContactPerson("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk");
        int result = contactPerson.getPhoneNumber();
        int expResult = 23456989;

        assertEquals(expResult, result);
    }

    @Test
    public void testSetPhoneNumber() throws Exception
    {
        ContactPerson contactPerson = new ContactPerson("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk");
        contactPerson.setPhoneNumber(44567890);
        int result = contactPerson.getPhoneNumber();
        int expResult = 44567890;

        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmail() throws Exception
    {
        ContactPerson contactPerson = new ContactPerson("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk");
        String result = contactPerson.getEmail();
        String expResult = "xink0001@stud.kea.dk";

        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() throws Exception
    {
        ContactPerson contactPerson = new ContactPerson("Xinkai", "Huang", "Studsgaardsgade 5", 23456989, "xink0001@stud.kea.dk");
        contactPerson.setEmail("Jeff0221@stud.kea.dk");
        String result = contactPerson.getEmail();
        String expResult = "Jeff0221@stud.kea.dk";

        assertEquals(expResult, result);
    }


}