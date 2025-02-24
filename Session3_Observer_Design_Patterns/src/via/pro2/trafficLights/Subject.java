package via.pro2.trafficLights;

import java.net.http.WebSocket;

public interface Subject
{
  public void addListener(Listener listener);
}
