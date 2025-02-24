package via.pro2.birdWatcher;

public class BirdWatcher implements Listener
{
  int id;

  public BirdWatcher(int id)
  {
    this.id = id;
  }

  public void update(String arg)
  {
    String reaction = switch (arg)
    {
      case "flaps its wings" -> " Ohh nice";
      case "sings a song" -> " How nice";
      default -> throw new IllegalStateException("ooops");
    };
    System.out.println("Bird watcher " + id + reaction);
  }
}
