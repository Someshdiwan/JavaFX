package LayoutsPanes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScrollPaneTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Create a VBox to hold the buttons as scrollable content
        VBox content = new VBox();
        // Add several buttons to the VBox to enable scrolling
        for (int i = 1; i <= 20; i++) {
            Button btn = new Button("Button " + i);
            content.getChildren().add(btn);
        }

        // Create a ScrollPane and set the VBox as its content
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(content);

        Scene sc = new Scene(scrollPane, 400, 400);
        stage.setScene(sc);
        stage.setTitle("ScrollPane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
