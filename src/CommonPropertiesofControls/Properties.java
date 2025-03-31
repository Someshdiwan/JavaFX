package CommonPropertiesofControls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.*;

import javafx.scene.control.*;
import java.awt.*;

/**
 * JavaFX button.
 *
 * @see <a href="https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Button.html">JavaFX Button API</a>
 */

public class Properties extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button b = new Button("Click _Me"); //also you can give a button icon.

        b.setTextFill(Color.BLUE);
        b.setMnemonicParsing(true); //short key,Press Alt on window.
        Tooltip tp = new Tooltip("Click this button to Save Data");
        b.setTooltip(tp);
        //b.setStyle("--fx-border-color:yellow;");

        //Alert box.
        Alert a = new Alert(Alert.AlertType.INFORMATION, "Button is Clicked");
        b.setOnAction(e -> a.show());
        //WhenEver a button is click then event is generated you
        //can handle that event by the event handler

        FlowPane fp = new FlowPane(b);

        Scene sc = new Scene(fp, 400, 400);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}