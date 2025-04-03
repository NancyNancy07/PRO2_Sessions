package model;

import java.util.ArrayList;

public class ItemList
{
  private ArrayList<Item> items;
  private Bidder bidder;

  public ItemList()
  {
    items = new ArrayList<>();
  }

  public ArrayList<Item> getItems()
  {
    return items;
  }

  public void addItem(Item item)
  {
    items.add(item);
    System.out.println("item has buy now");
  }

  public void removeItem(Item item)
  {
    items.remove(item);
  }

  public void disabledButNow()
  {
    if (bidder.count() > 1)
    {
      System.out.println("Buy Now Disabled");
    }
  }
}

