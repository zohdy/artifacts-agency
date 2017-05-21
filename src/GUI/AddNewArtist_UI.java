package GUI;

import Controller.AddNewArtist_Controller;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class AddNewArtist_UI
{

    private Scene scene;
    private Stage addNewArtistStage;

    private GridPane gridPane = new GridPane();

    private Label cpr = new Label("CPR.: ");
    private Label firstName = new Label("First name: ");
    private Label lastName = new Label("Last name: ");
    private Label phoneNumber = new Label("Phone number: ");
    private Label address = new Label("Address: ");
    private Label email = new Label("Email address: ");

    private Label artistName = new Label("Artist name");

    private TextField tfCpr = new TextField();
    private TextField tfFirstName = new TextField();
    private TextField tfLastName = new TextField();
    private TextField tfPhoneNumber = new TextField();
    private TextField tfAddress = new TextField();
    private TextField tfemail = new TextField();

    private TextField tfArtistName = new TextField();

    private Button btnAdd = new Button("Add");
    private Button btnCancel = new Button("Cancel");

    private HBox btnCancelContainer = new HBox();

    private Text text = new Text("Add New Artist");

    public AddNewArtist_UI()
    {
        text.setStyle("-fx-font-size: 150%");

        gridPane.add(text, 0 ,0, 2, 1);
        gridPane.add(cpr, 0, 1);
        gridPane.add(firstName, 0, 2);
        gridPane.add(lastName, 0, 3);
        gridPane.add(address, 0, 4);
        gridPane.add(email, 0, 5);
        gridPane.add(phoneNumber, 0, 6);

        gridPane.add(artistName, 0, 7);

        gridPane.add(tfCpr, 1, 1);
        gridPane.add(tfFirstName, 1, 2);
        gridPane.add(tfLastName, 1, 3);
        gridPane.add(tfAddress, 1, 4);
        gridPane.add(tfemail, 1, 5);
        gridPane.add(tfPhoneNumber, 1, 6);

        gridPane.add(tfArtistName, 1, 7);

        btnCancelContainer.getChildren().addAll(btnCancel);
        btnCancelContainer.setAlignment(Pos.BASELINE_RIGHT);

        gridPane.add(btnAdd, 0, 8);
        gridPane.add(btnCancelContainer, 1, 8);

        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.setPadding(new Insets(20, 20, 20, 20));

        scene = new Scene(gridPane);

        btnAdd.setOnAction(event -> {
            System.out.println("Artist name = " + tfArtistName.getText());
            System.out.println("email = " + tfemail.getText());

            AddNewArtist_Controller.getInstance().operateInsertion(tfFirstName.getText(),tfLastName.getText(),tfAddress.getText(),
            tfPhoneNumber.getText(),tfemail.getText(), tfCpr.getText(), tfArtistName.getText());
            AddNewArtist_Controller.getInstance().closeInsertion(addNewArtistStage);
        });

        btnCancel.setOnAction(event -> AddNewArtist_Controller.getInstance().closeInsertion(addNewArtistStage));
    }

    public void showAndWait()
    {
        addNewArtistStage = new Stage();
        addNewArtistStage.setScene(scene);
        addNewArtistStage.initModality(Modality.APPLICATION_MODAL);
        addNewArtistStage.showAndWait();
    }
}
