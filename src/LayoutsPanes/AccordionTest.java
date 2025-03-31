package LayoutsPanes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccordionTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Create the first TitledPane with a button inside
        TitledPane pane1 = new TitledPane("Section 1", new Button("Button in Section 1"));

        // Create the second TitledPane with another button
        TitledPane pane2 = new TitledPane("Section 2", new Button("Button in Section 2"));

        // Create the third TitledPane with another button
        TitledPane pane3 = new TitledPane("Section 3", new Button("Button in Section 3"));

        // Create an Accordion and add the TitledPanes
        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(pane1, pane2, pane3);

        // Set the first pane to be expanded by default
        accordion.setExpandedPane(pane1);

        VBox root = new VBox(10);
        root.getChildren().add(accordion);

        Scene sc = new Scene(root, 400, 400);
        stage.setScene(sc);
        stage.setTitle("Accordion Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}