package Controller;

import GUI.Start_UI;
import GUI.Warning_UI;
import Model.*;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by Zonde on 30-05-2016.
 */
public class AddNewBooking_Controller{

    private static AddNewBooking_Controller instance;

    private AddNewBooking_Controller(){}

    public static AddNewBooking_Controller getInstance(){
        if(instance == null){
            instance = new AddNewBooking_Controller();
            return instance;
        }else{
            return instance;
        }
    }

    public void operateInsertion(String priceString, DatePicker datePicker, Artist artist, ContactPerson contactPerson, Venue venue, String comment){
        Warning_UI warning = new Warning_UI();
        int price = Integer.parseInt(priceString);

        //gets the date from datepicker type to LocalDate type
        LocalDate localDate = datePicker.getValue();
        //Converts the date from LocalDate type to
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        //Converts from Java.Util.Date to Java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        if(warning.alertWindow("Are you sure you want to save?","Are you sure you want to create a new booking with this information?")){
            Booking booking = new Booking(price, sqlDate, artist, contactPerson, venue, comment);
            Database.getInstance().insertBooking(booking);
            Start_UI.getBookingList().add(booking);
            Start_UI.update_UI();
        }
    }

    public void closeInsertion(Stage stage)
    {
        stage.close();
    }
}
