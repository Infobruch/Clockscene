import GLOOP.*;
public class Dial {
    private GLZylinder rueckwand,narbe;
    private GLTorus umrandung;

    public Dial(double x, double y){
        rueckwand = new GLZylinder(x,y,-5, 210,5,"src/Holz.jpg");

        narbe = new GLZylinder (x,y,0,10,5);

        umrandung = new GLTorus (x,y,0,215,15,"src/Holzboden.jpg");
    }  

}