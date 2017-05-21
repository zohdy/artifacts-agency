package Model;
import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;
import javafx.collections.ObservableList;

import java.sql.*;
import java.util.List;
import java.util.Observable;

/**
 * Created by Zonde on 13-05-2016.
 */

public class Database
{
    private static Database instance;
    private Connection con;
    private PreparedStatement statement;
    private ResultSet resultSet;

    private final String DB_PASSWORD = "1024Krystal,";

    private Database()
    {
        connectToDatabase();
    }

    public static Database getInstance()
    {
        if(instance == null)
        {
            instance = new Database();
            return instance;
        }
        else
        {
            return instance;
        }
    }

    public void connectToDatabase()
    {
        try {

            System.out.println("Starting up DataBase");
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";

            con = DriverManager.getConnection(url, "root", DB_PASSWORD);

            System.out.println("URL: " + url);
            System.out.println("Connection: " + con);

            checkDB();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    private void checkDB() {
        try {
            statement = con.prepareStatement("USE Artifacts_Agency");
            statement.executeUpdate();

            System.out.println("Database Artifacts_Agency exists using it");
        } catch (MySQLSyntaxErrorException e) {
            System.out.println("Database does not exist creating database Artifacts_Agency");
            createDB();

            try {
                statement = con.prepareStatement("USE Artifacts_Agency");
                statement.executeUpdate();
            } catch (Exception e2) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        checkTables();
    }

    private void checkTables() {
        try {
            statement = con.prepareStatement("SELECT * FROM Artist");
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Table Artist does not exist creating");
            createTableArtist();
        }

        try {
            statement = con.prepareStatement("SELECT * FROM ContactPerson");
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Table Artist does not exist creating");
            createTableContactPerson();
        }

        try {
            statement = con.prepareStatement("SELECT * FROM Venue");
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Table Venue does not exist creating");
            createTableVenue();
        }

        try {
            statement = con.prepareStatement("SELECT * FROM Booking");
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Table Booking does not exist creating");
            createTableBooking();
        }
    }

    private void createDB() {
        try {
            statement = con.prepareStatement("CREATE DATABASE Artifacts_Agency");
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createTableArtist() {
        try {
            statement = con.prepareStatement("CREATE TABLE Artifacts_Agency.Artist(cpr char(10) NOT NULL Primary Key, artistName VARCHAR(25), firstname VARCHAR(25) NOT NULL, lastname VARCHAR(30) NOT NULL, address VARCHAR(50), email VARCHAR(50), telephone INT)");
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createTableContactPerson() {
        try {
            statement = con.prepareStatement("CREATE TABLE Artifacts_Agency.ContactPerson(email VARCHAR(50) NOT NULL Primary Key, firstname VARCHAR(25) NOT NULL, lastname VARCHAR(30) NOT NULL, address VARCHAR(50), telephone INT NOT NULL)");
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createTableVenue() {
        try {
            statement = con.prepareStatement("CREATE TABLE Artifacts_Agency.Venue(cvr INT NOT NULL Primary Key, name VARCHAR(50) NOT NULL, address VARCHAR(50), telephone INT NOT NULL)");
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createTableBooking() {
        try {
            statement = con.prepareStatement("CREATE TABLE Artifacts_Agency.Booking(cpr CHAR(10) NOT NULL, cvr INT NOT NULL, email VARCHAR(50) NOT NULL, date DATE NOT NULL, price INT NOT NULL, comment TEXT, PRIMARY KEY(cpr, cvr, email), FOREIGN KEY(cpr) REFERENCES Artist(cpr), FOREIGN KEY(cvr) REFERENCES Venue(cvr), FOREIGN KEY(email) REFERENCES ContactPerson(email))");
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertContactPerson(ContactPerson person)
    {
        System.out.println("Inserting contact person into database");

        try {
            statement = con.prepareStatement("INSERT INTO ContactPerson (email, firstname, lastname, address, telephone) VALUES(?, ?, ?, ?, ?)");

            statement.setString(1, person.getEmail());
            statement.setString(2, person.getFirstName());
            statement.setString(3, person.getLastName());
            statement.setString(4, person.getAddress());
            statement.setInt(5, person.getPhoneNumber());

            statement.executeUpdate();

            System.out.println("Contact person added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteContactPerson(Person person)
    {

    }

    public void getContactPersons(List<ContactPerson> contactPersons) {
        System.out.println("Loading contact persosns");

        try {
            statement = con.prepareStatement("SELECT * FROM ContactPerson");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                contactPersons.add(new ContactPerson(resultSet.getString("firstName"), resultSet.getString("lastName"), resultSet.getString("address"), resultSet.getInt("telephone"), resultSet.getString("email")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void updateContactPerson(Person person)
    {

    }

    public void insertArtist(Artist artist) {
        System.out.println("Inserting artist into database");

        try {
            statement = con.prepareStatement("INSERT INTO Artist (cpr, artistname, firstname, lastname, address, telephone, email) VALUES(?, ?, ?, ?, ?, ?, ?)");

            statement.setString(1, artist.getCpr());
            statement.setString(2, artist.getArtistName());
            statement.setString(3, artist.getFirstName());
            statement.setString(4, artist.getLastName());
            statement.setString(5, artist.getAddress());
            statement.setInt(6, artist.getPhoneNumber());

            statement.setString(7, artist.getEmail());

            statement.executeUpdate();

            System.out.println("Artist added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteArtist(Artist artist) {

    }

    public void getArtists(List<Artist> artistList) {
        System.out.println("Loading artists");

        try {
            statement = con.prepareStatement("SELECT * FROM Artist");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                artistList.add(new Artist(resultSet.getString("firstName"), resultSet.getString("lastname"), resultSet.getString("address"), resultSet.getInt("telephone"), resultSet.getString("email"), resultSet.getString("cpr"), resultSet.getString("artistname")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateArtist(Artist artist) {

    }

    public void insertVenue(Venue venue)
    {
        System.out.println("Inserting venue into database");

        try {
            statement = con.prepareStatement("INSERT INTO Venue (cvr, name, address, telephone) VALUES (?, ?, ?, ?)");

            statement.setInt(1, venue.getCvr());
            statement.setString(2, venue.getName());
            statement.setString(3, venue.getLocation());
            statement.setInt(4, venue.getPhoneNumber());

            statement.executeUpdate();

            System.out.println("Venue added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteVenue(Venue venue)
    {

    }

    public void getVenues(List<Venue> venueList) {
        System.out.println("Loading venues");

        try {
            statement = con.prepareStatement("SELECT * FROM Venue");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                venueList.add(new Venue(resultSet.getInt("cvr"), resultSet.getString("name"), resultSet.getString("address"), resultSet.getInt("telephone")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
    }

    public void updateVenue(Venue venue)
    {

    }

    public void insertBooking(Booking booking) {
        System.out.println("Inserting booking into database");

        try {
            statement = con.prepareStatement("INSERT INTO Booking (cpr, cvr, email, date, price, comment) VALUES (?, ?, ?, ?, ?, ?)");

            statement.setString(1, booking.getArtist().getCpr());
            statement.setInt(2, booking.getVenue().getCvr());
            statement.setString(3, booking.getContactPerson().getEmail());
            statement.setDate(4, booking.getDate());
            statement.setInt(5, booking.getPrice());
            statement.setString(6, booking.getComment());

            statement.executeUpdate();

            System.out.println("Booking added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteBooking(Booking booking)
    {

    }

    public void getBookings(List<Booking> bookingList) {
        System.out.println("Loading Bookings");
        try {
            statement = con.prepareStatement("SELECT * FROM Booking");
            ResultSet localResultSet = statement.executeQuery();

            while (localResultSet.next()) {
                Artist artist = getArtist(localResultSet.getString("cpr"));
                Venue venue = getVenue(localResultSet.getInt("cvr"));
                ContactPerson contactPerson = getContactPerson(localResultSet.getString("email"));

                bookingList.add(new Booking(localResultSet.getInt("price"), localResultSet.getDate("date"), artist, contactPerson, venue, localResultSet.getString("comment")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateBooking(Booking booking)
    {

    }

    private Artist getArtist(String cpr) {
        Artist artist = null;

        try {
            statement = con.prepareStatement("SELECT * FROM Artist WHERE cpr = " + cpr);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                artist = new Artist(resultSet.getString("firstname"), resultSet.getString("lastname"), resultSet.getString("address"), resultSet.getInt("telephone"), resultSet.getString("email"), resultSet.getString("cpr"), resultSet.getString("artistName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return artist;
    }

    private Venue getVenue(int cvr) {
        Venue venue = null;

        try {
            statement = con.prepareStatement("SELECT * FROM Venue WHERE cvr = " + cvr);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                venue = new Venue(resultSet.getInt("cvr"), resultSet.getString("name"), resultSet.getString("address"), resultSet.getInt("telephone"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return venue;
    }

    private ContactPerson getContactPerson(String email) {
        ContactPerson contactPerson = null;

        try {
            statement = con.prepareStatement("SELECT * FROM ContactPerson WHERE email = '" + email + "'");
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                contactPerson = new ContactPerson(resultSet.getString("firstname"), resultSet.getString("lastname"), resultSet.getString("address"), resultSet.getInt("telephone"), resultSet.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return contactPerson;
    }

}
