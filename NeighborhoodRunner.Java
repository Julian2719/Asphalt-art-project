import org.code.neighborhood.*;


public class NeighborhoodRunner {
  public static void main(String[] args) {


  /*sets the paint for the background and smile
    */
  BackgroundPainter Julian = new BackgroundPainter();
  Julian.setPaint(100000);
  Julian.paintBackground();

  MainPainter Julian2 = new MainPainter();
  Julian2.setPaint(10000);
  Julian2.paintSmile();
  }
}

