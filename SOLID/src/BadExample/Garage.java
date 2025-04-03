package BadExample;

import java.util.ArrayList;

public class Garage
{
  private ArrayList<Car> cars;
  private ArrayList<Bicycle> bicycles;

  public Garage()
  {
    cars = new ArrayList<Car>();
    bicycles = new ArrayList<Bicycle>();
  }

  public void addCar(Car car)
  {
    cars.add(car);
  }

  public void addBicycle(Bicycle bicycle)
  {
    bicycles.add(bicycle);
  }

  public void removeCar(Car car)
  {
    cars.remove(car);
  }

  public void removeBicycle(Bicycle bicycle)
  {
    bicycles.remove(bicycle);
  }

  public int getTotalNumberOfWheels()
  {
    int total = 0;
    for (Car car : cars)
    {
      total += car.getWheelCount();
    }
    for (Bicycle bicycle : bicycles)
    {
      total += bicycle.getWheelCount();
    }
    return total;
  }

  public int calculateFee()
  {
    int totalFee = 0;
    for (Car car : cars)
    {
      totalFee += car.getWheelCount() * 10;
    }
    for (Bicycle bicycle : bicycles)
    {
      totalFee += bicycle.getWheelCount() * 10;
    }
    return totalFee;
  }
}