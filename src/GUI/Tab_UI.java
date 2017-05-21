package GUI;

import Model.*;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 * Created by Stormwind on 13/05/2016.
 */
public class Tab_UI
{
    TabPane tabPane;
    Tab artistTab, venueTab, bookingTab, contactPersonTab;

    public TabPane tabPane_UI()
    {
        tabPane = new TabPane();
        tabPane.setPadding(new Insets(30));
        tabPane.setTabMinWidth(150);
        artistTab = new Tab("Artist");
        artistTab.setClosable(false);
        venueTab = new Tab("Venue");
        venueTab.setClosable(false);
        bookingTab = new Tab("Bookings");
        bookingTab.setClosable(false);
        contactPersonTab = new Tab("Contact Person");
        contactPersonTab.setClosable(false);

        // Set the content of Tabs to TableViews
        artistTab.setContent(getTableArtists());
        bookingTab.setContent(getTableBookings());
        contactPersonTab.setContent(getTableContactPersons());
        venueTab.setContent(getTableVenue());

        // Add the tab to tabPane
        tabPane.getTabs().addAll(artistTab, bookingTab, venueTab, contactPersonTab);

        return tabPane;
    }

    public TableView<Artist> getTableArtists() {
        // Create TableColumn objects for artistTable
        TableColumn artistName = new TableColumn("Artist Name");
        artistName.setPrefWidth(100);
        TableColumn firstName = new TableColumn("First Name");
        firstName.setPrefWidth(100);
        TableColumn lastName = new TableColumn("Last Name");
        lastName.setPrefWidth(100);
        TableColumn address = new TableColumn("Address");
        address.setPrefWidth(100);
        TableColumn cpr = new TableColumn("Cpr");
        cpr.setPrefWidth(75);
        TableColumn phoneNumber = new TableColumn("Phone Number");
        phoneNumber.setPrefWidth(105);
        TableColumn email = new TableColumn("E-Mail");
        email.setPrefWidth(110);

        // Set artistTable columns to TableColumns
        Start_UI.getTableArtist().getColumns().addAll(artistName, firstName, lastName, address, cpr, phoneNumber, email);

        // Set artistName column to update from field in Artist
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));
        cpr.setCellValueFactory(new PropertyValueFactory<>("cpr"));
        artistName.setCellValueFactory(new PropertyValueFactory<>("artistName"));
        phoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));

        // Set the observable list for table
        Start_UI.getTableArtist().setItems((ObservableList<Artist>) Start_UI.getArtistList());

        //return artistTable;
        return Start_UI.getTableArtist();
    }

    public TableView<ContactPerson> getTableContactPersons() {
        // Create TableColumn objects for contactPersonTable
        TableColumn firstName = new TableColumn("First Name");
        firstName.setPrefWidth(100);
        TableColumn lastName = new TableColumn("Last Name");
        lastName.setPrefWidth(100);
        TableColumn address = new TableColumn("Address");
        address.setPrefWidth(100);
        TableColumn phoneNumber = new TableColumn("Phone Number");
        phoneNumber.setPrefWidth(120);
        TableColumn email = new TableColumn("E-Mail");
        email.setPrefWidth(120);

        // Set contactPersonTable columns to TableColumns
        Start_UI.getTableContactPerson().getColumns().addAll(firstName, lastName, address, phoneNumber, email);

        // Set columns to update from appropriate fields
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));
        phoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));

        // Set the observable list for table
        Start_UI.getTableContactPerson().setItems((ObservableList<ContactPerson>) Start_UI.getContactPersonList());

        //return contactPersonTable;
        return Start_UI.getTableContactPerson();
    }

    public TableView<Booking> getTableBookings() {
        // Create TableColumn objects for bookingTable
        TableColumn date = new TableColumn("Date");
        date.setPrefWidth(100);
        TableColumn artist = new TableColumn("Artist");
        artist.setPrefWidth(100);
        TableColumn contactPerson = new TableColumn("Contact Person");
        contactPerson.setPrefWidth(150);
        TableColumn venue = new TableColumn("Venue");
        venue.setPrefWidth(100);
        TableColumn price = new TableColumn("Price");
        price.setPrefWidth(100);
        TableColumn comment = new TableColumn("Comment");
        comment.setPrefWidth(150);

        // Set bookingTable columns to TabeColumns
        Start_UI.getTableBooking().getColumns().addAll(date, artist, contactPerson, venue, price, comment);

        // Set artsit column to update from field artist in Booking
        artist.setCellValueFactory(new PropertyValueFactory<>("artist"));
        contactPerson.setCellValueFactory(new PropertyValueFactory<>("contactPerson"));
        venue.setCellValueFactory(new PropertyValueFactory<>("venue"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        date.setCellValueFactory(new PropertyValueFactory<>("date"));
        comment.setCellValueFactory(new PropertyValueFactory<>("comment"));

        // Set the observable list for table
        Start_UI.getTableBooking().setItems((ObservableList<Booking>) Start_UI.getBookingList());

        //return bookingTable;
        return Start_UI.getTableBooking();
    }

    public TableView<Venue> getTableVenue() {
        // Create TableColumn objects for bookingTable
        TableColumn cvr = new TableColumn("cvr");
        cvr.setPrefWidth(100);
        TableColumn name = new TableColumn("Name");
        name.setPrefWidth(100);
        TableColumn location = new TableColumn("Location");
        location.setPrefWidth(100);
        TableColumn phoneNumber = new TableColumn("Phone Nummber");
        phoneNumber.setPrefWidth(150);

        // Set venueTable columns to TabeColumns
        Start_UI.getTableVenue().getColumns().addAll(cvr, name, location, phoneNumber);

        // Set columns to update from appropriate fields
        cvr.setCellValueFactory(new PropertyValueFactory<>("cvr"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        location.setCellValueFactory(new PropertyValueFactory<>("location"));
        phoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));

        // Set the observable list for table
        Start_UI.getTableVenue().setItems((ObservableList<Venue>) Start_UI.getVenueList());

        //return venueTable;
        return Start_UI.getTableVenue();
    }
}
