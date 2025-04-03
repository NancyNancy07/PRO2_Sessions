package model;

public class Item
{
  private String name;
  private int minPrice;
  private String state;
  private int buyNowPrice;

  public Item(String name, int minPrice)
  {
    this.name = name;
    this.minPrice = minPrice;
    this.state = "Avialable";
    this.buyNowPrice = 0;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setMinPrice(int minPrice)
  {
    this.minPrice = minPrice;
  }

  public void setState(String state)
  {
    this.state = state;
  }

  public void setBuyNowPrice(int buyNowPrice)
  {
    this.buyNowPrice = buyNowPrice;
  }

  public String getName()
  {
    return name;
  }

  public int getMinPrice()
  {
    return minPrice;
  }

  public String getState()
  {
    return state;
  }

  public int getBuyNowPrice()
  {
    return buyNowPrice;
  }

  public String toString()
  {
    return name + ", " + minPrice;
  }
}
