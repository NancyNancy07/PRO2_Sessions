package via.pro2.loginsystem.view.login;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import via.pro2.loginsystem.view.ViewHandler;

public class LoginController
{
  @FXML private TextField emailField;
  @FXML private TextField passwordField;
  @FXML private Label messageLabel;
  @FXML private Button loginBtn;

  private LoginVM loginVM;

  public LoginController(LoginVM loginVM)
  {
    this.loginVM = loginVM;
  }

  public void initialize()
  {
    emailField.textProperty().bindBidirectional(loginVM.emailPropProperty());
    passwordField.textProperty().bindBidirectional(loginVM.pwPropProperty());
    messageLabel.textProperty().bind(loginVM.msgPropProperty());
    loginBtn.disableProperty().bind(loginVM.loginBtnEnabledProp());

  }

  public void back()
  {
    System.out.println("Go back");
    ViewHandler.showView(ViewHandler.ViewType.FRONT);
  }

  public void login()
  {
    loginVM.loginUser();
  }
}
