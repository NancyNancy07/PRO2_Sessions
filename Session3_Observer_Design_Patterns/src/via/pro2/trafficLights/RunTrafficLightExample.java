package via.pro2.trafficLights;

import java.util.ArrayList;

public class RunTrafficLightExample
{

  public static void main(String[] args) throws InterruptedException
  {
    TrafficLight trafficLight = new TrafficLight();

    Car car1 = new Car(1);
    Car car2 = new Car(2);
    Car car3 = new Car(3);

    Pedestrian pedestrian1 = new Pedestrian(7);
    Pedestrian pedestrian2 = new Pedestrian(8);
    Pedestrian pedestrian3 = new Pedestrian(9);

    Taxi taxi1 = new Taxi(11);
    Taxi taxi2 = new Taxi(12);
    Taxi taxi3 = new Taxi(13);

    trafficLight.addListener(car1);
    trafficLight.addListener(car2);
    trafficLight.addListener(car3);

    trafficLight.addListener(taxi1);
    trafficLight.addListener(taxi2);
    trafficLight.addListener(taxi3);

    trafficLight.addListener(pedestrian1);
    trafficLight.addListener(pedestrian2);
    trafficLight.addListener(pedestrian3);


   /* trafficLight.addCar(car1);
    trafficLight.addCar(car2);
    trafficLight.addCar(car3);

    trafficLight.addPedestrian(pedestrian1);
    trafficLight.addPedestrian(pedestrian2);
    trafficLight.addPedestrian(pedestrian3);

    trafficLight.addTaxi(taxi1);
    trafficLight.addTaxi(taxi2);
    trafficLight.addTaxi(taxi3);*/

    // more stuff
    trafficLight.start();

  }
}
