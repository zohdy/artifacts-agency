package GUI;

import Controller.AddNewBooking_Controller;
import Model.Artist;
import Model.Database;
import Model.Venue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peterzohdy on 24/05/2016.
 */
public class AddNewBooking_UI
{
    private Scene scene;
    private Stage addBookingStage;
    private Pane pane = new Pane();
    HBox hBox = new HBox();
    HBox hBox2 = new HBox();

    DatePicker datePicker = new DatePicker();
    Label titleLabel;
    TextField priceTextField = new TextField();
    TextArea textArea = new TextArea();
    Button bookButton = new Button("Confirm Booking");
    Button cancelButton = new Button("Cancel");

    public AddNewBooking_UI()
    {
        titleLabel = new Label("Add New Booking");
        titleLabel.setFont(new Font("Verdana", 20));
        titleLabel.setLayoutX(205);
        titleLabel.setLayoutY(25);

        hBox.setSpacing(40);
        hBox.setPadding(new Insets(80, 0, 0, 30));

        hBox2.setLayoutY(90);
        hBox2.setSpacing(40);
        hBox2.setPadding(new Insets(80, 0, 0, 30));

        datePicker.setMaxWidth(150);
        datePicker.setPromptText("Select Date");
        priceTextField.setMaxWidth(150);
        priceTextField.setPromptText("Artist salary in DKK");

        hBox.getChildren().addAll(Start_UI.getComboBoxArtist(),Start_UI.getComboBoxVenue(),Start_UI.getComboBoxContactPerson());
        hBox2.getChildren().addAll(datePicker, priceTextField);

        textArea.setLayoutX(50);
        textArea.setLayoutY(240);
        textArea.setMaxWidth(300);
        textArea.setPromptText("Other information for this booking goes here..");

        bookButton.setLayoutX(30);
        bookButton.setLayoutY(450);
        bookButton.setOnAction(event -> {AddNewBooking_Controller.getInstance().
                operateInsertion(priceTextField.getText(),datePicker, Start_UI.getComboBoxArtist().getSelectionModel().getSelectedItem(),
                        Start_UI.getComboBoxContactPerson().getSelectionModel().getSelectedItem(), Start_UI.getComboBoxVenue().getSelectionModel().getSelectedItem(),
                        textArea.getText());
        AddNewBooking_Controller.getInstance().closeInsertion(addBookingStage);});

        cancelButton.setLayoutX(310);
        cancelButton.setLayoutY(450);
        cancelButton.setOnAction(event -> AddNewBooking_Controller.getInstance().closeInsertion(addBookingStage));

        pane.getChildren().addAll(titleLabel,hBox, textArea, hBox2, bookButton, cancelButton);

        scene = new Scene(pane, 610, 500);
    }

    public void showAndWait()
    {
        addBookingStage = new Stage();
        addBookingStage.setScene(scene);
        addBookingStage.initModality(Modality.APPLICATION_MODAL);
        addBookingStage.showAndWait();
    }
}
