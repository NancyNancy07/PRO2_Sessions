package via.pro2.trafficLights;

public class Pedestrian implements Listener
{
  private int id;

  public Pedestrian(int id)
  {
    this.id = id;
  }

  public void update(String arg)
  {
    String reaction = switch (arg)
    {
      case "GREEN" -> "Pedestrian " + id + " waiting";
      case "YELLOW" -> "Pedestrian " + id + " looking at light";
      case "RED" -> "Pedestrian " + id + " walks";
      default -> throw new IllegalStateException("ooops");
    };
    System.out.println(reaction);
  }
}
