package uk.ac.rhul.cs2800;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author zjac180
 *
 */
public class Driver extends Application {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    launch(args);

  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    // TODO Auto-generated method stub
    Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("myView.fxml"));
    Scene scene = new Scene(root, 800, 500);
    primaryStage.setScene(scene);
    primaryStage.show();

  }

}
