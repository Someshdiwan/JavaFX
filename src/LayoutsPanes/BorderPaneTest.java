package LayoutsPanes;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;

public class BorderPaneTest extends Application {

    @Override
    public void start(Stage stage)throws Exception
    {
        Button top = new Button("Top");
        Button left = new Button("Left");
        Button center = new Button("Center");
        Button right = new Button("Right");
        Button bottom = new Button("Bottom");

        BorderPane root = new BorderPane();
        root.setTop(top);
        root.setLeft(left);
        root.setCenter(center);
        root.setRight(right);
        root.setBottom(bottom);

        Scene sc = new Scene(root,400,400);
        stage.setScene(sc);
        stage.setTitle("BorderPane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}