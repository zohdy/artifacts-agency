package Controller;

import GUI.Start_UI;
import GUI.Warning_UI;
import Model.Artist;
import Model.Database;
import javafx.stage.Stage;

/**
 * Created by Jeffrey on 18-05-2016.
 */
public class AddNewArtist_Controller{

    private static AddNewArtist_Controller instance;

    private AddNewArtist_Controller(){}

    public static AddNewArtist_Controller getInstance(){
        if(instance == null){
            instance = new AddNewArtist_Controller();
            return instance;
        }else{
            return instance;
        }
    }

    public void operateInsertion(String firstName, String lastName, String address, String phoneNumberString,String email, String cpr, String artistName){
        Warning_UI warning = new Warning_UI();
        int phoneNumber = Integer.parseInt(phoneNumberString);

        if(warning.alertWindow("Are you sure you want to save?","Are you sure you want to create a new artist with this information?")){
            Artist insertArtist = new Artist(firstName,lastName,address,phoneNumber,email,cpr,artistName);
            Database.getInstance().insertArtist(insertArtist);
            Start_UI.getArtistList().add(insertArtist);
            Start_UI.update_UI();
        }
        
    }

    public void closeInsertion(Stage stage)
    {
        stage.close();
    }

}
