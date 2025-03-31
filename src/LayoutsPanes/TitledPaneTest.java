package LayoutsPanes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TitledPaneTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Create the first TitledPane with a button inside
        TitledPane pane1 = new TitledPane("Section 1", new Button("Button in Section 1"));

        // Create the second TitledPane with another button
        TitledPane pane2 = new TitledPane("Section 2", new Button("Button in Section 2"));

        // Create a VBox to hold the TitledPanes
        VBox root = new VBox(10); // Spacing of 10 pixels
        root.getChildren().addAll(pane1, pane2);

        Scene sc = new Scene(root, 400, 400);
        stage.setScene(sc);
        stage.setTitle("TitledPane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
