package LayoutsPanes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TabPaneTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Create a TabPane to hold multiple tabs
        TabPane tabPane = new TabPane();

        // First Tab with a button
        Tab tab1 = new Tab("Tab 1");
        VBox tab1Content = new VBox(new Button("Button in Tab 1"));
        tab1.setContent(tab1Content);
        tab1.setClosable(false); // Prevent closing the tab

        // Second Tab with another button
        Tab tab2 = new Tab("Tab 2");
        VBox tab2Content = new VBox(new Button("Button in Tab 2"));
        tab2.setContent(tab2Content);
        tab2.setClosable(false);

        // Third Tab with different content
        Tab tab3 = new Tab("Tab 3");
        VBox tab3Content = new VBox(new Button("Button in Tab 3"));
        tab3.setContent(tab3Content);
        tab3.setClosable(false);

        // Add tabs to the TabPane
        tabPane.getTabs().addAll(tab1, tab2, tab3);

        Scene sc = new Scene(tabPane, 400, 400);
        stage.setScene(sc);
        stage.setTitle("TabPane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}