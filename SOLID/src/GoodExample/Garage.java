package GoodExample;

import java.util.ArrayList;

public class Garage
{
  private ArrayList<Vehicle> vehicles;

  public Garage()
  {
    vehicles = new ArrayList<Vehicle>();
  }

  public void addVehicle(Vehicle vehicle)
  {
    vehicles.add(vehicle);
  }

  public void removeVehicle(Vehicle vehicle)
  {
    vehicles.remove(vehicle);
  }

  public ArrayList<Vehicle> getVehicles()
  {
    return vehicles;
  }
}
