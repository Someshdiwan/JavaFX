package LayoutsPanes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class GridPaneTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        Button btn6 = new Button("Button 6");

        GridPane root = new GridPane();
        // Adding buttons at specific grid positions
        root.add(btn1, 0, 0); // Column 0, Row 0
        root.add(btn2, 1, 0); // Column 1, Row 0
        root.add(btn3, 0, 1); // Column 0, Row 1
        root.add(btn4, 1, 1); // Column 1, Row 1
        root.add(btn5, 0, 2); // Column 0, Row 2
        root.add(btn6, 1, 2); // Column 1, Row 2

        Scene sc = new Scene(root, 400, 400);
        stage.setScene(sc);
        stage.setTitle("GridPane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}