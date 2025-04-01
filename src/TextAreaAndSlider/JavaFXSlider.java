package TextAreaAndSlider;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

/**
 * JavaFX Slider Documentation:
 * <a href="https://docs.oracle.com/javafx/2/ui_controls/slider.htm">Slider Docs</a>
 * <a href="https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Slider.html">Slider API</a>
 */

public class JavaFXSlider extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        TextArea ta = new TextArea();
        ta.setPrefColumnCount(100);
        //Show 10 letters in single line in a normal font size.

        ta.setPrefRowCount(20);

        Slider sl = new Slider(10, 50, 10);
        sl.setMajorTickUnit(5);
        sl.setShowTickMarks(true);

        VBox vb = new VBox();
        vb.getChildren().addAll(ta, sl);

        Scene sc = new Scene(vb, 500, 500);
        stage.setScene(sc);
        stage.show();

        sl.valueProperty().addListener(e -> ta.setFont(Font.font(sl.getValue())));
        //From Last, Get the Value of the slider and give it to the font to create a object of font that given size and
        //set that for the text area.
    }

    public static void main(String[] args) {
        launch(args);
    }
}