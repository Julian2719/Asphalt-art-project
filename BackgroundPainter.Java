import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus{

/* paints the background of the picture blue
   goes row by row
  */
public void paintBackground(){
  for (int i = 0; i<3; i++){
  paint("blue");
  for (int j = 0; j<7; j++){
    move();
    paint("blue");
  }
  turnRight();
  move();
  turnRight();
  paint("blue");
  for (int h = 0; h<7; h++){
    move();
    paint("blue");

  }
  turnLeft();
  move();
  turnLeft();
}
  paint("blue");
  for (int j = 0; j<7; j++){
    move();
    paint("blue");
  }
  turnRight();
  move();
  turnRight();
  paint("blue");
  for (int h = 0; h<7; h++){
    move();
    paint("blue");

  }

}
}
