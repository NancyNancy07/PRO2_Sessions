package via.pro2.birdWatcher;

import via.pro2.birdWatcher.Listener;
import via.pro2.birdWatcher.Subject;

import java.util.ArrayList;

public class Bird implements Subject
{
  private final ArrayList<Listener> listeners = new ArrayList<>();

  public void addListener(Listener listener)
  {
    listeners.add(listener);
  }

  public void notifyListener(String arg)
  {
    for (Listener listener : listeners)
    {
      listener.update(arg);
    }

  }

  public void start() throws InterruptedException
  {
    String[] birdReaction = {"flaps its wings", "sings a song"};
    int index = -1;

    for (int i = 0; i < 10; i++)
    {
      Thread.sleep(1000);
      index = (++index) % 2;
      String current = birdReaction[index];
      System.out.println("\nPeacock is " + current);
      notifyListener(current);
    }

  }
}
