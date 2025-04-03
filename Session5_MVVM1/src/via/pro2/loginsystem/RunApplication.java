package via.pro2.loginsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import via.pro2.loginsystem.model.services.authentication.AuthenticationService;
import via.pro2.loginsystem.model.services.authentication.AuthenticationServiceImp;
import via.pro2.loginsystem.view.ViewHandler;
import via.pro2.loginsystem.view.register.RegisterController;
import via.pro2.loginsystem.view.register.RegisterVM;

import java.io.IOException;

public class RunApplication extends Application
{

  public void start(Stage stage) throws IOException
  {
    ViewHandler.start(stage);
    /*AuthenticationService authenticationService = new AuthenticationServiceImp();
    RegisterVM vm = new RegisterVM(authenticationService);
    RegisterController controller = new RegisterController(vm);

    FXMLLoader fxmlLoader = new FXMLLoader(
        RunApplication.class.getResource("view/register/Register.fxml"));

    fxmlLoader.setControllerFactory(e -> controller);

    Scene scene = new Scene(fxmlLoader.load());
    stage.setTitle("Login System");
    stage.setScene(scene);
    stage.show();*/
  }

  public static void main(String[] args)
  {
    launch();
  }
}
