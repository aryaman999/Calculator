package uk.ac.rhul.cs2800;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The Driver contains the code required to run the GUI interface scene so it's presented to the
 * user. This class was inspired by a demo video given to us by our professor.
 *
 * @author Aryaman Rawat
 */
public class Driver extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {

    Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("myView.fxml"));
    Scene scene = new Scene(root, 800, 500);
    primaryStage.setTitle("Calculator CS2800");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

}
