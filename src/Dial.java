import GLOOP.*;
public class Dial {
    private GLZylinder backWall,barrel;

    public Dial(double x, double y){
        backWall = new GLZylinder(x,y,-5, 210,5,"src/clock.jpg");

        barrel = new GLZylinder (x,y,0,10,5);
    }
}