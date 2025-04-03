package GoodExample;

public abstract class Vehicle
{
  private int wheelCount;
  private int feePerWheel;
  public Vehicle(int wheelCount, int feePerWheel)
  {
    this.wheelCount = wheelCount;
    this.feePerWheel = feePerWheel;
  }
  public int getWheelCount()
  {
    return wheelCount;
  }
  public double getParkingFee()
  {
    return wheelCount * feePerWheel;
  }
}