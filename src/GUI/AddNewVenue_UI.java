package GUI;

import Controller.AddNewVenue_Controller;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Lasse Jensen on 17-05-2016.
 */
public class AddNewVenue_UI
{
    private Scene scene;
    private Stage addVenueStage;
    private GridPane gridPane = new GridPane();

    private Label cvr = new Label("CVR.: ");
    private Label name = new Label("Name: ");
    private Label location = new Label("Location: ");
    private Label phoneNumber = new Label("Phone number: ");

    private TextField tfcvr = new TextField();
    private TextField tfName = new TextField();
    private TextField tfLocation = new TextField();
    private TextField tfPhoneNumber = new TextField();

    private Button btnAdd = new Button("Add");
    private Button btnCancel = new Button("Cancel");

    private HBox btnCancelContainer = new HBox();

    private Text text = new Text("Add New Venue");


    public AddNewVenue_UI()
    {
        text.setStyle("-fx-font-size: 150%");

        gridPane.add(text, 0 ,0, 2, 1);
        gridPane.add(cvr, 0, 1);
        gridPane.add(name, 0, 2);
        gridPane.add(location, 0, 3);
        gridPane.add(phoneNumber, 0, 4);

        gridPane.add(tfcvr, 1, 1);
        gridPane.add(tfName, 1, 2);
        gridPane.add(tfLocation, 1, 3);
        gridPane.add(tfPhoneNumber, 1, 4);

        btnCancelContainer.getChildren().addAll(btnCancel);
        btnCancelContainer.setAlignment(Pos.BASELINE_RIGHT);

        gridPane.add(btnAdd, 0, 5);
        gridPane.add(btnCancelContainer, 1, 5);

        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(20, 20, 20, 20));

        scene = new Scene(gridPane);

        btnAdd.setOnAction(event -> AddNewVenue_Controller.getInstance().operateInsertion(tfcvr.getText(),tfName.getText(),tfLocation.getText(),tfPhoneNumber.getText()));

        btnCancel.setOnAction(event -> AddNewVenue_Controller.getInstance().closeInsertion(addVenueStage));
    }

    public void showAndWait()
    {
        addVenueStage = new Stage();

        addVenueStage.setScene(scene);
        addVenueStage.initModality(Modality.APPLICATION_MODAL);
        addVenueStage.showAndWait();
    }
}
