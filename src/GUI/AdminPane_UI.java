package GUI;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 * Created by Stormwind on 21/06/2016.
 */
public class AdminPane_UI extends Start_UI
{
    Button delete, edit, back;
    Text text;
    GridPane gridPane;

    public AdminPane_UI()
    {

    }

    public Pane adminPane()
    {
        delete = new Button("Delete");
        delete.setPrefSize(150, 20);
//        delete.setOnAction(e -> );

        edit = new Button("Edit");
        edit.setPrefSize(150, 20);
//        edit.setOnAction(e -> );

        back = new Button("Back");
        back.setPrefSize(150, 40);
//        back.setOnAction(event -> );

        text = new Text("Admin");
        text.setStyle("-fx-font-size: 200%");

        gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(0, 30, 30, 30));

        gridPane.add(text, 0, 3, 2, 1);
        gridPane.add(edit, 0, 6, 2, 1);
        gridPane.add(delete, 0, 9, 2, 1);
        gridPane.add(back, 0, 27, 2, 1);

        return gridPane;
    }
}
