package GUI;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 * Created by Jeffrey on 18-05-2016.
 */
public class Warning_UI{
    Alert alert;
    public boolean alertWindow(String Title, String action){
        boolean isAccepted = false;
        alert = new Alert(Alert.AlertType.CONFIRMATION);
        //Clears buttons in the window so i can add my own
        alert.getButtonTypes().clear();
        //Add library buttons for ease of use
        alert.getButtonTypes().addAll(ButtonType.YES,ButtonType.NO);

        alert.setTitle(Title);
        alert.setContentText(action);
        alert.showAndWait();

        if(alert.getResult() == ButtonType.NO){
            isAccepted = false;
        }else if(alert.getResult() == ButtonType.YES){
            isAccepted = true;
        }
        return isAccepted;
    }
}
