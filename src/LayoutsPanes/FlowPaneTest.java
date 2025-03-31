package LayoutsPanes;

import javafx.application.Application;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;

public class FlowPaneTest extends Application {

    @Override
    public void start(Stage stage)throws Exception
    {
        Button btn1 = new Button("One");
        Button btn2 = new Button("Two");
        Button btn3 = new Button("Three");
        Button btn4 = new Button("Four");
        Button btn5 = new Button("Five");

        FlowPane root = new FlowPane();
        root.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);

        Scene sc = new Scene(root,400,400);
        stage.setScene(sc);
        stage.setTitle("FlowPane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}