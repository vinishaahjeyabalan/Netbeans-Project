/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2.loginpage;

//import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class JavaFXApplication2LoginPage extends Application {
    Stage window;
    
     public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Login Form Window");
       
        GridPane grid = new GridPane();
        
        
//        Image image = new Image("C:\\Users\\Vinishaah Jeyabalan\\Documents\\NetBeansProjects\\JavaFXApplication2(LoginPage)\\src");
//        ImageView imageView = new ImageView();
//        imageView.setImage(image);
//        imageView.setFitHeight(500);
//        imageView.setFitWidth(500);
//        grid.getChildren().addAll(imageView);
        

        Scene scene = new Scene(grid, 500, 500);
        
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10));
        //grid.setPadding(javafx.geometry.Insets.EMPTY);
        
        Text welcomeText = new Text("Welcome");
        welcomeText.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
        grid.add(welcomeText, 0, 0);
       
        Label user = new Label("Username");
        grid.add(user, 0, 1);
        
        TextField txtUser = new TextField();
        txtUser.setPromptText("username");
        grid.add(txtUser, 1, 1);
       
        Label password = new Label("Password");
        grid.add(password, 0, 2);
        
        PasswordField pwUser = new PasswordField();
        pwUser.setPromptText("password");
        grid.add(pwUser, 1, 2);
        
        Button loginBtn = new Button("Login");
        grid.add(loginBtn, 1, 3);
        loginBtn.setOnAction(e ->{
            System.out.println("Login Button Pressed");
        
        });
        
      
        //scene.setRoot(grid);
        window.setScene(scene);
        window.show();
        
    }
    
}
