package Controller;

import GUI.Start_UI;
import GUI.Warning_UI;
import Model.*;
import javafx.stage.Stage;

/**
 * Created by Zonde on 30-05-2016.
 */
public class AddNewVenue_Controller{
    private static AddNewVenue_Controller instance;

    private AddNewVenue_Controller(){}

    public static AddNewVenue_Controller getInstance(){
        if(instance == null){
            instance = new AddNewVenue_Controller();
            return instance;
        }else{
            return instance;
        }
    }

    public void operateInsertion(String cvrString, String name, String location, String phoneNumberString){
        Warning_UI warning = new Warning_UI();
        int phoneNumber = Integer.parseInt(phoneNumberString);
        int cvr = Integer.parseInt(cvrString);

        if(warning.alertWindow("Are you sure you want to save?","Are you sure you want to create a new venue with this information?")){
            Venue insertVenue = new Venue(cvr,name,location,phoneNumber);
            Database.getInstance().insertVenue(insertVenue);
            Start_UI.getVenueList().add(insertVenue);
            Start_UI.update_UI();
        }
    }

    public void closeInsertion(Stage stage)
    {
        stage.close();
    }
}
