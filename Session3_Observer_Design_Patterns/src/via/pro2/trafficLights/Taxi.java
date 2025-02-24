package via.pro2.trafficLights;

public class Taxi implements Listener
{
  private int id;

  public Taxi(int id)
  {
    this.id = id;
  }

  public void update(String arg)
  {
    String reaction = switch (arg)
    {
      case "GREEN" -> "Taxi " + id + " become a racing car";
      case "YELLOW" -> "Taxi " + id + " speeds up";
      case "RED" -> "Taxi " + id + " stops with screeching breaks";
      default -> throw new IllegalStateException("ooops");
    };
    System.out.println(reaction);
  }
}
