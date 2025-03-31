package LayoutsPanes;

import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;

public class VBoxTest extends Application {

    @Override
    public void start(Stage stage) throws Exception
    {
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        VBox root = new VBox();
        root.getChildren().addAll(btn1, btn2, btn3);

        Scene sc = new Scene(root, 400, 200);
        stage.setScene(sc);
        stage.setTitle("VBox Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}