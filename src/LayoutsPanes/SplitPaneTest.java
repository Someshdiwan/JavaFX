package LayoutsPanes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SplitPaneTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Create two VBox containers for the left and right sides of the SplitPane
        VBox leftBox = new VBox();
        // Add buttons or other controls to the left container
        Button leftButton1 = new Button("Left Button 1");
        Button leftButton2 = new Button("Left Button 2");
        leftBox.getChildren().addAll(leftButton1, leftButton2);

        VBox rightBox = new VBox();
        // Add buttons or other controls to the right container
        Button rightButton1 = new Button("Right Button 1");
        Button rightButton2 = new Button("Right Button 2");
        rightBox.getChildren().addAll(rightButton1, rightButton2);

        // Create a SplitPane and add the left and right containers as its items
        SplitPane splitPane = new SplitPane();
        splitPane.getItems().addAll(leftBox, rightBox);

        Scene sc = new Scene(splitPane, 400, 400);
        stage.setScene(sc);
        stage.setTitle("SplitPane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}