package E2characters;

public class Characters implements Runnable
{
  private int count;

  public Characters(int count)
  {
    this.count = count;
  }

  @Override public void run()
  {
    char letter = 'A';
    for (int i = 0; i < count; i++)
    {
      System.out.println(letter);
      letter++;
      if (letter > 'Z')
      {
        letter = 'A';
      }
    }
  }
}
