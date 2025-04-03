package GoodExample;

import java.util.ArrayList;

public class GarageCalculator
{
  private ArrayList<Vehicle> vehicles;
  public GarageCalculator(ArrayList<Vehicle> vehicles)
  {
    this.vehicles = vehicles;
  }

  public int calculateTotalWheelCount()
  {
    int totalWheelCount = 0;
    for (Vehicle vehicle : vehicles)
    {
      totalWheelCount += vehicle.getWheelCount();
    }
    return totalWheelCount;
  }

  public int calculateParkingFee()
  {
    int totalFee = 0;
    for (Vehicle vehicle : vehicles)
    {
      totalFee += vehicle.getWheelCount() * 10;
    }
    return totalFee;
  }
}