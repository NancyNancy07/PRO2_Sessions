package via.pro2.exercises.E1characters;

public class Characters implements Runnable
{
  public Characters()
  {
  }

  @Override public void run()
  {
    for (int i = 0; i < 40; i++)
    {
      for (char c = 'A'; c <= 'Z'; c++)
      {
        System.out.println(c);
      }
    }
  }
}
