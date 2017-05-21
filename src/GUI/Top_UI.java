package GUI;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 * Created by Stormwind on 13/05/2016.
 */
public class Top_UI
{
    VBox vBox;
    ImageView imageView;

    public VBox logo()
    {
        vBox = new VBox();
        vBox.setAlignment(Pos.TOP_LEFT);

        imageView = new ImageView(new Image(getClass().getResourceAsStream("/Image/logo.png")));
        imageView.setFitHeight(80);
        imageView.setFitWidth(240);
        vBox.getChildren().add(imageView);

        return vBox;
    }
}

