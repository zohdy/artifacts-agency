package GUI;

import javafx.geometry.Insets;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * Created by Stormwind on 13/05/2016.
 */
public class Home_UI
{
    BorderPane borderPane;

    private static Home_UI instance = null;

    public Home_UI()
    {

    }

    public static Home_UI getInstance()
    {
        if (instance == null)
        {
            instance = new Home_UI();
        }
        return  instance;
    }

    public BorderPane homePane(Pane sidePane, VBox bottom,VBox top, TabPane tabPane)
    {
        borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: ghostwhite");
        borderPane.setCenter(tabPane);
        borderPane.setLeft(sidePane);
        borderPane.setTop(top);
        borderPane.setBottom(bottom);
        borderPane.setPrefSize(1000, 600);
        borderPane.setPadding(new Insets(20));

        return borderPane;
    }
}
