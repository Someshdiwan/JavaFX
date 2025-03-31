package EventHandling;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class EventHandling extends Application {
    Button b;
    int count=0;

    @Override
    public void start(Stage primaryStage)throws Exception {
        b = new Button("OK");
        //set the handler event
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                count++;
                b.setText(""+count); //handle event
            }
        });

        b.setPrefSize(100,30);

        FlowPane fp = new FlowPane(b);
        Scene sc = new Scene(fp,400,400);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}