package via.pro2.temperatureConverter.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import via.pro2.temperatureConverter.model.TemperatureModel;

public class TemperatureViewController
{
  @FXML private TextField textInput;
  @FXML private Label labelTimer;
  @FXML private Label labelOutput;

  private TemperatureModel model;
  private Region root;
  private ViewHandler viewHandler;

  public TemperatureViewController()
  {
  }

  public void init(ViewHandler viewHandler, TemperatureModel model, Region root)
  {
    this.viewHandler = viewHandler;
    this.model = model;
    this.root = root;
  }

  public void reset()
  {
    textInput.setText("");
  }

  public Region getRoot()
  {
    return root;
  }

  @FXML private void toCelsius()
  {
    try
    {
      double value = Double.parseDouble(textInput.getText());
      double result = model.toCelsius(value);
      labelOutput.setText(
          textInput.getText() + " fahrenheit = " + result + " celsius");
      reset();
    }
    catch (Exception e)
    {
      labelOutput.setText("Error in input");
    }
  }

  @FXML private void toFahrenheit()
  {
    try
    {
      double value = Double.parseDouble(textInput.getText());
      double result = model.toFahrenheit(value);
      labelOutput.setText(
          textInput.getText() + " celsius = " + result + " fahrenheit");
      reset();
    }
    catch (Exception e)
    {
      labelOutput.setText("Error in input");
    }
  }
}