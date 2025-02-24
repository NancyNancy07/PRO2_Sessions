package via.pro2.birdWatcher;

public class BirdStart
{
  public static void main(String[] args) throws InterruptedException
  {
    Bird bird = new Bird();

    BirdWatcher birdWatcher1 = new BirdWatcher(1);
    BirdWatcher birdWatcher2 = new BirdWatcher(2);
    BirdWatcher birdWatcher3 = new BirdWatcher(3);

    BlindBirdWatcher blindBirdWatcher1 = new BlindBirdWatcher(4);
    BlindBirdWatcher blindBirdWatcher2 = new BlindBirdWatcher(5);
    BlindBirdWatcher blindBirdWatcher3 = new BlindBirdWatcher(6);

    bird.addListener(birdWatcher1);
    bird.addListener(birdWatcher2);
    bird.addListener(birdWatcher3);
    bird.addListener(blindBirdWatcher1);
    bird.addListener(blindBirdWatcher2);
    bird.addListener(blindBirdWatcher3);

    bird.start();
  }

}
