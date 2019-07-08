package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    /*
    For this challenge, you'll create a simple contacts application that has a single main window.
    The application will allow the user to add a contact, edit a contact, and delete a contact.
    You'll display the contacts using the TableView control.

    There will be a single Contacts menu that contains Add, Edit, and Delete items.
    You will want to be able to load and store the contacts, which isn't a JavaFX topic.
    I've provided a ContactData class that contains a quick and dirty way to load and store contacts using XML.
    You'll have to add code to the ContactData class to complete the challenge.
    There are comments that indicate where your code should go.

    Hints:
    1. In addition to the ContactData class, you'll need a Contact class to store individual contacts.
       For each contact, you'll store the first name, last name, phone number, and notes.
    2. To get data binding to work with the TableView, you'll want to store the contact information as SimpleStringProperty fields.
    3. The TodoList application we worked on in an earlier lecture covers 90% of what you'll need to complete this challenge.
    */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("My Contacts");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}