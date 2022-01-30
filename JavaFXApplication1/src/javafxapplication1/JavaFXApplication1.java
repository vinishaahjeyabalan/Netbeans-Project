/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

//import java.awt.Image;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class JavaFXApplication1 extends Application {
    
    
    public static void main(String[] args) {
        launch(args);                                       //launch javafx application
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Button btn = new Button("Click Me");
        
        
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World");
//                System.out.println("How are you");
//            }
//        });
        
        VBox root = new VBox();                       //Layout called Vertical Box
        root.getChildren().add(new Label("Welcome To Sunway Car Parking Reservation System" + "\nLogin To Book Ticket"));
        
        HBox root1 = new HBox(new Label("Username : "));
        TextField text = new TextField();
        root1.getChildren().add(text);
        root.getChildren().add(root1);
        
        HBox root2 = new HBox(new Label("Password : "));
        TextField text2 = new TextField();
        root2.getChildren().add(text2);
        root.getChildren().add(root2);
        
        Button btn3 = new Button("Proceed");
        root.getChildren().add(btn3);
        //StackPane root = new StackPane();           //Layout called StackPanecalled root
        
        Scene scene = new Scene(root, 400, 300);  
        primaryStage.setTitle("Parking Reservation System");
        primaryStage.setScene(scene);
        primaryStage.setTitle("My First Gui Application");
        
        Button btn2 = new Button("Exit");
        
        //btn2.setOnAction(e -> System.exit(1));
        btn2.setOnAction(e -> {
            System.out.println("Exit this App");
            System.exit(0);
                });
        
        root.getChildren().addAll(btn2);         //Adding buttons to a layout 
        
        Image image = new Image("reindeer.jpg");
        ImageView imageView = new ImageView(image);
        
        primaryStage.show();             //show stage or window
    }
    
}
