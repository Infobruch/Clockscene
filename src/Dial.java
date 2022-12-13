import GLOOP.*;
public class Dial {
    private GLZylinder backWall,barrel;
    private GLTorus border;

    public Dial(double x, double y){
        backWall = new GLZylinder(x,y,-5, 210,5,"src/Holz.jpg");

        barrel = new GLZylinder (x,y,0,10,5);

        border = new GLTorus (x,y,0,215,15,"src/Holzboden.jpg");
    }  

}