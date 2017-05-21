package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 * Created by Stormwind on 13/05/2016.
 */
public class SidePane_UI extends Start_UI
{
    Button newArtist, newVenue, newContactPerson, history, newBooking, adMin;
    Text text;
    GridPane gridPane;

    AddNewArtist_UI addNewArtist = new AddNewArtist_UI();
    AddNewVenue_UI addNewVenue = new AddNewVenue_UI();
    AddNewContactPerson_UI addNewContactPerson = new AddNewContactPerson_UI();
    AddNewBooking_UI addNewBooking = new AddNewBooking_UI();

    public SidePane_UI()
    {

    }

    public Pane sidePane()
    {
        newArtist = new Button("New Artist");
        newArtist.setPrefSize(150, 20);
        newArtist.setOnAction(e -> addNewArtist());

        newVenue = new Button("New Venue");
        newVenue.setPrefSize(150, 20);
        newVenue.setOnAction(e -> addNewVenue());

        newContactPerson = new Button("New Contact Person");
        newContactPerson.setPrefSize(150, 20);
        newContactPerson.setOnAction(e -> addNewContactPerson());

        history = new Button("History");
        history.setPrefSize(150, 20);

        adMin = new Button("Admin");
        adMin.setPrefSize(150, 40);
        adMin.setStyle("-fx-border-color: darkblue");
        adMin.setOnAction(event ->
        {
            AdminPane_UI side = new AdminPane_UI();
            Bottom_UI bottom = new Bottom_UI();
            Home_UI home = new Home_UI();
            Top_UI top = new Top_UI();
            Tab_UI tab = new Tab_UI();

            scene = new Scene(home.homePane(side.adminPane(), bottom.bottomLine(), top.logo(), tab.tabPane_UI()));
            stage.setScene(scene);
            stage.setTitle("Artifacts Agency");
            stage.show();
        });

        newBooking = new Button("New Booking");
        newBooking.setStyle("-fx-border-color: darkred");
        newBooking.setPrefSize(150, 40);
        newBooking.setOnAction(e -> addNewBooking());

        text = new Text("Menu");
        text.setStyle("-fx-font-size: 200%");

        gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(0, 30, 30, 30));

        gridPane.add(text, 0, 3, 2, 1);
        gridPane.add(newArtist, 0, 6, 2, 1);
        gridPane.add(newVenue, 0, 9, 2, 1);
        gridPane.add(newContactPerson, 0, 12, 2, 1);
        gridPane.add(history, 0, 15, 2, 1);
        gridPane.add(adMin, 0, 20, 2, 1);
        gridPane.add(newBooking, 0, 22, 2, 1);

        return gridPane;
    }

    public void addNewArtist()
    {
        addNewArtist.showAndWait();
    }

    public void addNewVenue()
    {
        addNewVenue.showAndWait();
    }

    public void addNewContactPerson()
    {
        addNewContactPerson.showAndWait();
    }

    public void addNewBooking()
    {
        addNewBooking.showAndWait();
    }
}
