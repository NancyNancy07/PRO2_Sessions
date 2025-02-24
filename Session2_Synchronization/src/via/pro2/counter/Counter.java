package via.pro2.counter;

public class Counter
{
  private long value;
  private long min;
  private long max;

  public Counter()
  {
    value = 0;
    this.min = min;
    this.max = max;
  }

  public void increment()
  {
    if (value >= min)
    {
      value++;
    }
  }

  public void decrement()
  {
    if (value <= max)
    {
      value--;
    }
  }

  public long getValue()
  {
    synchronized (this)
    {
      return value;

    }
  }
}
