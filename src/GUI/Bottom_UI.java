package GUI;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 * Created by Stormwind on 13/05/2016.
 */
public class Bottom_UI extends Start_UI
{
    Button exit;
    VBox vBox;

    public VBox bottomLine()
    {
        exit = new Button("Exit");
        exit.setPrefSize(120, 30);
        exit.setOnAction(event -> close());

        vBox = new VBox();
        vBox.setAlignment(Pos.CENTER_RIGHT);
        vBox.setSpacing(10);
        vBox.getChildren().add(exit);

        return vBox;
    }
}
