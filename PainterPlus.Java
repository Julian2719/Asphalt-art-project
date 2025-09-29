import org.code.neighborhood.*;

/*sets the painter on where to turn
    */
public class PainterPlus extends Painter{
  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }
}
