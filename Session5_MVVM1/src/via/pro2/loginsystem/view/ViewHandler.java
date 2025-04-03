package via.pro2.loginsystem.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import via.pro2.loginsystem.model.services.authentication.AuthenticationService;
import via.pro2.loginsystem.model.services.authentication.AuthenticationServiceImp;
import via.pro2.loginsystem.view.front.FrontViewController;
import via.pro2.loginsystem.view.login.LoginController;
import via.pro2.loginsystem.view.login.LoginVM;
import via.pro2.loginsystem.view.register.RegisterController;
import via.pro2.loginsystem.view.register.RegisterVM;

import java.io.IOException;

public class ViewHandler
{
  public enum ViewType
  {
    FRONT, REGISTER, LOGIN
  }

  private static AuthenticationService authService = new AuthenticationServiceImp();
  private static Stage stage;

  public static void start(Stage s)
  {
    stage = s;
    showView(ViewType.FRONT);
    stage.show();
  }

  public static void showView(ViewType view)
  {
    try
    {
      switch (view)
      {
        case FRONT -> showFrontView();
        case REGISTER -> showRegisterView();
        case LOGIN -> showLoginView();

      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }

  private static void showFrontView() throws IOException
  {
    // no VM needed, the view doesn't do anything
    FrontViewController controller = new FrontViewController();
    FXMLLoader fxmlLoader = new FXMLLoader(
        ViewHandler.class.getResource("./front/front.fxml"));

    fxmlLoader.setControllerFactory(ignore -> controller);

    Scene scene = new Scene(fxmlLoader.load());
    stage.setTitle("Best Login app EVER!!");
    stage.setScene(scene);
  }

  private static void showRegisterView() throws IOException
  {
    RegisterVM registerVM = new RegisterVM(authService);
    RegisterController controller = new RegisterController(registerVM);
    FXMLLoader fxmlLoader = new FXMLLoader(
        ViewHandler.class.getResource("./register/Register.fxml"));

    fxmlLoader.setControllerFactory(ignore -> controller);

    Scene scene = new Scene(fxmlLoader.load());
    stage.setTitle("Please Register");
    stage.setScene(scene);
  }

  private static void showLoginView() throws IOException
  {
    LoginVM loginVM = new LoginVM(authService);
    LoginController controller = new LoginController(loginVM);
    FXMLLoader fxmlLoader = new FXMLLoader(
        ViewHandler.class.getResource("./login/Login.fxml"));

    fxmlLoader.setControllerFactory(ignore -> controller);

    Scene scene = new Scene(fxmlLoader.load());
    stage.setTitle("Login");
    stage.setScene(scene);
  }

}
