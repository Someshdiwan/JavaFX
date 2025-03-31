package javafx;

import javafx.application.Application;
import javafx.stage.Stage;

public class JFXSetup extends Application {
    @Override
    public void start(Stage Stage) {
        Stage.setTitle("Hello, Setup JAVA FX Done");
        Stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}