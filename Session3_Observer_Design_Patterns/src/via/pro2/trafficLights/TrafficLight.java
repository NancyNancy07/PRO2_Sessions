package via.pro2.trafficLights;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight implements Subject
{
  private final List<Listener> listeners = new ArrayList<>();
 /* private ArrayList<Car> cars;
  private ArrayList<Pedestrian> pedestrians;
  private ArrayList<Taxi> taxis;*/

  /* public TrafficLight()
   {
     cars = new ArrayList<>();
     pedestrians = new ArrayList<>();
     taxis = new ArrayList<>();
   }

   public void addCar(Car car)
   {
     cars.add(car);
   }

   public void addPedestrian(Pedestrian pedestrian)
   {
     pedestrians.add(pedestrian);
   }

   public void addTaxi(Taxi taxi)
   {
     taxis.add(taxi);
   }
 */
  public void addListener(Listener listener)
  {
    listeners.add(listener);
  }

  private void notifyListeners(String arg)
  {
    for (Listener listener : listeners)
    {
      listener.update(arg);
    }
  }

  public void start() throws InterruptedException
  {
    String[] lights = {"GREEN", "YELLOW", "RED"};
    int lightIndex = -1;

    for (int i = 0; i < 10; i++)
    {
      Thread.sleep(1000);
      lightIndex = (++lightIndex) % 3;
      String currentLight = lights[lightIndex];
      System.out.println("\nLight is " + currentLight);
      notifyListeners(currentLight);

      /*for (int j = 0; j < cars.size(); j++)
      {
        cars.get(j).reactToLight(currentLight);
      }

      for (int k = 0; k < pedestrians.size(); k++)
      {
        pedestrians.get(k).reactToLight(currentLight);
      }

      for (int l = 0; l < taxis.size(); l++)
      {
        taxis.get(l).reactToLight(currentLight);
      }*/
    }
  }

}
