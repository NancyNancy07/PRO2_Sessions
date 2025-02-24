package via.pro2.birdWatcher;

public class BlindBirdWatcher implements Listener
{
  private int id;

  public BlindBirdWatcher(int id)
  {
    this.id = id;
  }

  public void update(String arg)
  {
    if (arg.equals("sings a song"))
    {
      System.out.println("Blind bird watcher " + id + " hearing the good song");
    }
    else
    {
      System.out.println("Blind bird watcher " + id + " can't see a bird");
    }
  }
}
