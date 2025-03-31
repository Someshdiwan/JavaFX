package DatePickerColorPickerFileChooser;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * JavaFX DatePicker Documentation:
 * <a href="https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/date-picker.htm">DatePicker Docs</a>
 * <a href="https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/DatePicker.html">DatePicker API</a>
 */

public class FileChooser extends Application {

    /**
     * JavaFX ColorPicker Documentation:
     * <a href="https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/color-picker.htm">ColorPicker Docs</a>
     * <a href="https://docs.oracle.com/javafx/2/ui_controls/color-picker.htm">ColorPicker API</a>
     */

    @Override
    public void start(Stage stage) throws Exception {
        TextArea ta = new TextArea();
        ta.setPrefColumnCount(100);


        ta.setPrefRowCount(20);

        Slider sl = new Slider(10, 50, 10);
        sl.setMajorTickUnit(5);
        sl.setShowTickMarks(true);

        sl.valueProperty().addListener(e -> ta.setFont(Font.font(sl.getValue())));

        DatePicker dp = new DatePicker();
        //add it to the vertical box.
        dp.setShowWeekNumbers(true);

        dp.setOnAction(e->ta.setText("Date :+"+dp.getValue()+"\n"+ta.getText()));

        ColorPicker cp = new ColorPicker();
        cp.setOnAction(e->
        {
            //0xccaabbff logic of writing (2,8).
            ta.setStyle("-fx-text-fill:#"+cp.getValue().toString().substring(2,8));
            ta.setText(cp.getValue()+"\n"+ta.getText());
        });

        Button b = new Button("Open File");
        //Add functionality of the opening a file.
        //where i use a FileChooser.

        b.setOnAction(e-> {
            javafx.stage.FileChooser fc = new javafx.stage.FileChooser();

            /* fc.showOpenDialog(stage);*/
            /*java.io.File file = FileChooser();*/

            java.io.File file = fc.showOpenDialog(stage);
            //we have to open this file and have to show content in the text filed area

            try (Scanner sc = new Scanner(new FileInputStream(file)))
            {
                String str = " ";
                while(sc.hasNext())
                    str=str+sc.nextLine()+"\n";
                ta.setText(str);
            } catch (Exception ex){
                ta.setText("Select Valid File");
            }
        });

        VBox vb = new VBox();
        vb.setAlignment(Pos.TOP_CENTER);
        vb.getChildren().addAll(ta, sl,dp,cp,b);

        Scene sc = new Scene(vb, 500, 500);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}