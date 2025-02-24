package via.pro2.temperatureConverter;

import javafx.application.Application;
import javafx.stage.Stage;
import via.pro2.temperatureConverter.model.TemperatureModel;
import via.pro2.temperatureConverter.model.TemperatureModelManager;
import via.pro2.temperatureConverter.view.ViewHandler;

public class MyApplication extends Application
{
  public void start(Stage primaryStage)
  {
    // Model
    TemperatureModel model = new TemperatureModelManager();

    // View
    ViewHandler view = new ViewHandler(model);
    view.start(primaryStage);

  }
}
