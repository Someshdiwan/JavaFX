package ComboBoxApp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

class Customer
        //No Serialization implemented here if you wish you can. Object input and output stream
{
    private int custid;
    private String name;
    private String address;

    public Customer(int c,String n, String a)
    {
        custid=c;
        name=n;
        address=a;
    }
    public int getID(){return custid;}
    public String getName(){return name;}
    public String getAddress() {return address;}
    public void setAddress(String add){address=add;}
}

public class ComboBox extends Application {

    int count =0;
    @Override
    public void start(Stage stage)throws Exception
    {
        HashMap<Integer, Customer> hm = new HashMap<>();

        Font f = new Font("Times New Roman",20);

        Label l1 = new Label("Customer ID");        l1.setFont(f);
        Label l2 = new Label("Name ");              l2.setFont(f);
        Label l3 = new Label("Address");            l3.setFont(f);

        javafx.scene.control.ComboBox<Integer> cust = new javafx.scene.control.ComboBox<>();
        cust.setStyle("-fx-font-size:20");

        TextField name = new TextField();
        TextField Add = new TextField();

        name.setPrefColumnCount(15);
        Add.setPrefColumnCount(20);

        Button save = new Button("Save");
        Button create = new Button("Create");
        //Button search = new Button("Search");

        create.setOnAction(e->{
            ++count;
            cust.getItems().add(count);
            cust.setValue(count);
            name.setText("");
            Add.setText("");
        });

        //what ever the data is created into the text field,
        //we create the obj of Text field add it to the HashMap and save it to the file.
        save.setOnAction(e->
        {
            Customer c = new Customer(cust.getValue(),name.getText(),Add.getText());
            //Adding a data in the HashMap
            hm.put(count,c);

            try(PrintStream ps = new PrintStream(new FileOutputStream("C://JavaFX//JavaFX Setup//src//ComboBoxFormApplication//customer.txt")))
            {
                //Write down everything into the file.
                //Content take form the HashMap and save them into the file.
                for(Customer ct : hm.values()) //HashMap have customer object,
                //so it take all the values.
                {
                    ps.print(ct.getID());
                    ps.println(ct.getName());
                    ps.println(ct.getAddress());
                }

            }catch(Exception ex){}

        });

        HBox hb1 = new HBox();    hb1.setAlignment(Pos.CENTER);
        HBox hb2 = new HBox();    hb2.setAlignment(Pos.CENTER);
        HBox hb3 = new HBox();    hb3.setAlignment(Pos.CENTER);
        HBox hb4 = new HBox();    hb4.setAlignment(Pos.CENTER);


        hb1.getChildren().addAll(l1,cust);
        hb2.getChildren().addAll(l2, name);
        hb3.getChildren().addAll(l3, Add);
        hb4.getChildren().addAll(create, save);

        // Added VBox to hold HBoxes and display on stage
        VBox vb = new VBox(10); // spacing of 10 pixels between elements
        vb.getChildren().addAll(hb1, hb2, hb3, hb4);

        Scene sc = new Scene(vb, 400, 200);

        stage.setScene(sc);
        stage.setTitle("ComboBox Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}