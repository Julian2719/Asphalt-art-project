import org.code.neighborhood.*;

public class MainPainter extends PainterPlus{

  /* paints over the background for the smiley face
    */
  public void paintSmile(){
    move();
 
    turnRight();
    move();
    move();
    move();
    move();
    paint("black");
    move();
    turnLeft();
    move();
    for (int f = 0; f<3; f++){
      paint("black");
      move();
    }
    paint("black");
    move();
    turnLeft();
    move();
    paint("black");

    move();
    move();
    paint("black");
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    paint("black");
    move();
  }


  
}
