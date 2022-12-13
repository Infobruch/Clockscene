import GLOOP.*;
public class Clock {
    Dial dial;
    GLTafel display;
    Pointer seconds, minutes, hours;

    public Clock(double x, double y, String city) {
        dial = new Dial(x, y);

        display = new GLTafel(x, y - 300, 0, 250, 80);
        display.setzeTextur("src/" + city + ".png");

        seconds = new Pointer(x, y, 160, 2, 360.0 / 60);
        minutes = new Pointer(x, y, 140, 6, 360.0 / (60 * 60));
        hours = new Pointer(x, y, 80, 8, 360.0 / (60 * 12 * 60));
    }

    public void stelleZeit(int pHour, int pMinutes) {
        hours.setPointer(pHour * 360 / 12);
        minutes.setPointer(pMinutes * 360 / 60);
    }

    public void weiter() {
        seconds.weiter();
        minutes.weiter();
        hours.weiter();
    }

}