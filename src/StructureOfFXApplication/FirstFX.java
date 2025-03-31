package StructureOfFXApplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import javafx.scene.control.*;
import java.awt.*;

public class FirstFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b = new Button("Click Me");

        FlowPane fp = new FlowPane();

        fp.getChildren().add(b);

        //You have to take a Scene.
        Scene sc = new Scene(fp);
        //Scene is contained parent and parent contain a leaf control that is button.

        primaryStage.setScene(sc);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        //Launch the application.
    }
}