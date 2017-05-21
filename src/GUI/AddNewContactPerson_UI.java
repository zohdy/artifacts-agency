package GUI;

import Controller.AddNewArtist_Controller;
import Controller.AddNewContactPerson_Controller;
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
public class AddNewContactPerson_UI
{
    private Scene scene;
    private Stage addContactPersonStage;
    private GridPane gridPane = new GridPane();

    private Label firstName = new Label("First name: ");
    private Label lastName = new Label("Last name: ");
    private Label phoneNumber = new Label("Phone number: ");
    private Label emailAddress = new Label("Email address: ");
    private Label address = new Label("Address: ");

    private TextField tfFirstName = new TextField();
    private TextField tfLastName = new TextField();
    private TextField tfPhoneNumber = new TextField();
    private TextField tfEmailAddress = new TextField();
    private TextField tfAddress = new TextField();

    private Button btnAdd = new Button("Add");
    private Button btnCancel = new Button("Cancel");

    private HBox btnCancelContainer = new HBox();

    private Text text = new Text("Add New Contact Person");

    public AddNewContactPerson_UI()
    {
        text.setStyle("-fx-font-size: 150%");

        gridPane.add(text, 0 ,0, 2, 1);
        gridPane.add(firstName, 0, 1);
        gridPane.add(lastName, 0, 2);
        gridPane.add(emailAddress, 0, 3);
        gridPane.add(address, 0, 4);
        gridPane.add(phoneNumber, 0, 5);

        gridPane.add(tfFirstName, 1, 1);
        gridPane.add(tfLastName, 1, 2);
        gridPane.add(tfEmailAddress, 1, 3);
        gridPane.add(tfAddress, 1, 4);
        gridPane.add(tfPhoneNumber, 1, 5);

        btnCancelContainer.getChildren().addAll(btnCancel);
        btnCancelContainer.setAlignment(Pos.BASELINE_RIGHT);

        gridPane.add(btnAdd, 0, 6);
        gridPane.add(btnCancelContainer, 1, 6);

        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.setPadding(new Insets(20, 20, 20, 20));

        scene = new Scene(gridPane);

        btnAdd.setOnAction(event ->
        {AddNewContactPerson_Controller.getInstance().operateInsertion(tfFirstName.getText(),tfLastName.getText(),
            tfAddress.getText(),tfPhoneNumber.getText(),tfEmailAddress.getText());
            addContactPersonStage.close();
        });
        btnCancel.setOnAction(event -> AddNewContactPerson_Controller.getInstance().closeInsertion(addContactPersonStage));
    }

    public void showAndWait()
    {
        addContactPersonStage = new Stage();

        addContactPersonStage.setScene(scene);
        addContactPersonStage.initModality(Modality.APPLICATION_MODAL);
        addContactPersonStage.showAndWait();
    }
}
