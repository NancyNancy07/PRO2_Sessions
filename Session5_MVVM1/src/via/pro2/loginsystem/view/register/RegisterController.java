package via.pro2.loginsystem.view.register;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import via.pro2.loginsystem.view.ViewHandler;

public class RegisterController
{
  @FXML private TextField emailField;
  @FXML private TextField passwordField;
  @FXML private TextField repeatField;
  @FXML private Label messageLabel;
  @FXML private Button registerButton;
  private RegisterVM registerVM;

  public RegisterController(RegisterVM registerVM)
  {
    this.registerVM = registerVM;
  }

  public void initialize()
  {
    emailField.textProperty().bindBidirectional(registerVM.emailPropProperty());
    passwordField.textProperty().bindBidirectional(registerVM.pwPropProperty());
    repeatField.textProperty()
        .bindBidirectional(registerVM.repeatPropProperty());
    messageLabel.textProperty().bind(registerVM.msgPropProperty());
    registerButton.disableProperty().bind(registerVM.RgstrBtnEnabledProp());
  }

  public void back()
  {
    System.out.println("Go back");
    ViewHandler.showView(ViewHandler.ViewType.FRONT);
  }

  public void register()
  {
    registerVM.registerUser();
  }
}
