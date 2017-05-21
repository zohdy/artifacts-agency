package GUI;

import Model.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.util.List;

/**
 * Created by Stormwind on 09/05/2016.
 */
public class Start_UI extends Application
{
    Database dataBase;
    Scene scene;
    public static Stage stage;

    // ObservableLists for TableViews
    static ObservableList<Booking> bookingList = FXCollections.observableArrayList();
    static ObservableList<Artist> artistList = FXCollections.observableArrayList();
    static ObservableList<ContactPerson> contactPersonList = FXCollections.observableArrayList();
    static ObservableList<Venue> venueList = FXCollections.observableArrayList();

    // TableViews for main gui
    static TableView<Artist> artistTable;
    static TableView<ContactPerson> contactPersonTable;
    static TableView<Booking> bookingTable;
    static TableView<Venue> venueTable;

    // ComboBoxes for AddNewBooking
    static ComboBox<Artist> artistComboBox;
    static ComboBox<Venue> venueComboBox;
    static ComboBox<ContactPerson> contactPersonComboBox;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        dataBase = Database.getInstance();

        // Load tables from Database
        Database.getInstance().getArtists(artistList);
        Database.getInstance().getBookings(bookingList);
        Database.getInstance().getContactPersons(contactPersonList);
        Database.getInstance().getVenues(venueList);

        // Initialize TableViews
        artistTable = new TableView<>();
        contactPersonTable = new TableView<>();
        bookingTable = new TableView<>();
        venueTable = new TableView<>();

        // Initialize ComboBoxes for AddNewBooking
        artistComboBox = new ComboBox();
        artistComboBox.setPromptText("Select Artist");
        artistComboBox.setPrefSize(150, 10);
        artistComboBox.setItems(artistList);

        venueComboBox = new ComboBox();
        venueComboBox.setPromptText("Select Venue");
        venueComboBox.setPrefSize(150, 10);
        venueComboBox.setItems(venueList);

        contactPersonComboBox = new ComboBox();
        contactPersonComboBox.setPromptText("Select Contact Person");
        contactPersonComboBox.setPrefSize(150, 10);
        contactPersonComboBox.setItems(contactPersonList);

        stage = primaryStage;
        mainStage();
    }

    public Stage mainStage()
    {
        SidePane_UI side = new SidePane_UI();
        Bottom_UI bottom = new Bottom_UI();
        Home_UI home = new Home_UI();
        Top_UI top = new Top_UI();
        Tab_UI tab = new Tab_UI();

        scene = new Scene(home.homePane(side.sidePane(), bottom.bottomLine(), top.logo(), tab.tabPane_UI()));
        stage.setScene(scene);
        stage.setTitle("Artifacts Agency");
        stage.show();

        return stage;
    }

    public void close()
    {
        stage.close();
    }

    public static List<Booking> getBookingList() {
        return bookingList;
    }

    public static List<Artist> getArtistList() {
        return artistList;
    }

    public static List<ContactPerson> getContactPersonList() {
        return contactPersonList;
    }

    public static List<Venue> getVenueList() {
        return venueList;
    }

    public static TableView<Artist> getTableArtist() {
        return artistTable;
    }

    public static TableView<ContactPerson> getTableContactPerson() {
        return contactPersonTable;
    }

    public static TableView<Booking> getTableBooking() {
        return bookingTable;
    }

    public static TableView<Venue> getTableVenue() {
        return venueTable;
    }

    public static ComboBox<Artist> getComboBoxArtist() {
        return artistComboBox;
    }

    public static ComboBox<Venue> getComboBoxVenue() {
        return venueComboBox;
    }

    public static ComboBox<ContactPerson> getComboBoxContactPerson() {
        return contactPersonComboBox;
    }

    public static void update_UI() {
        // Update TableViews
        artistTable.setItems(artistList);
        contactPersonTable.setItems(contactPersonList);
        venueTable.setItems(venueList);
        bookingTable.setItems(bookingList);

        // Update ComboBoxes
        artistComboBox.setItems(artistList);
    }

}
