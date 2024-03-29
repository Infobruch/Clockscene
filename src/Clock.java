import GLOOP.*;
public class Clock {
    Dial dial;
    GLTafel display;
    Pointer seconds, minutes, hours;

    public Clock(double x, double y, String city) {
        dial = new Dial(x, y);

        display = new GLTafel(x, y - 300, 0, 250, 80);
        display.setzeText(city, 30);

        seconds = new Pointer(x, y, 160, 2, 360.0 / 60,1,0,1);
        minutes = new Pointer(x, y, 140, 6, 360.0 / (60 * 60),1,1,1);
        hours = new Pointer(x, y, 80, 8, 360.0 / (60 * 12 * 60),0,1,1);
    }

    public void setTime(int pHour, int pMinutes, int pSeconds) {
        hours.setPointer(pHour * 360 / 12);
        minutes.setPointer(pMinutes * 360 / 60);
        seconds.setPointer(pSeconds * 360 / 60);
    }

    public void rotatePointer() {
        seconds.rotatePointer();
        minutes.rotatePointer();
        hours.rotatePointer();
    }

}