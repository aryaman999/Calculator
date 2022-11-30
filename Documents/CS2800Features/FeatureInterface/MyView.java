package uk.ac.rhul.cs2800;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MyView {

  @FXML
  private Label label;

  @FXML
  private Button mainButton;

  @FXML
  void isPressed(ActionEvent event) {
    label.setText("pressed");

  }

}
