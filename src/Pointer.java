import GLOOP.*;
public class Pointer {
    GLZylinder pointer;
    double speed;
    double xPos, yPos, length;
    
    public Pointer(double x, double y, double pLength, double thickness, double pSpeed,int r,int g,int b){
        pointer = new GLZylinder(x,y+pLength/2,0,thickness,pLength);
        pointer.drehe(90,0,0);
        pointer.setzeFarbe(r,g,b);
        xPos = x;
        yPos = y;
        length = pLength;
        speed = pSpeed;
    }    

    public void rotatePointer(){
        pointer.drehe(0,0,-speed, xPos,yPos,0);
    }


    public void setPointer(double angle){
        pointer.setzeDrehung(90,0,0);
        pointer.setzePosition (xPos,yPos+length/2,0);
        pointer.drehe(0,0,-angle, xPos, yPos,0);
    }
}