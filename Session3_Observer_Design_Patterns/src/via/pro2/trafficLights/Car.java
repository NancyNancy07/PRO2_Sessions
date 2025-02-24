package via.pro2.trafficLights;

public class Car implements Listener
{

  private int id;

  public Car(int id)
  {
    this.id = id;
  }

  public void update(String arg)
  {
    String reaction = switch (arg)
    {
      case "GREEN" -> "Car " + id + " drives";
      case "YELLOW" -> "Car " + id + " slows down";
      case "RED" -> "Car " + id + " stops";
      default -> throw new IllegalStateException("ooops");
    };
    System.out.println(reaction);
  }
}
