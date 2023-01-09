import GLOOP.*;

import java.time.ZoneId;

public class Clockscene {
    GLKamera cam;
    GLTastatur kb;
    GLHimmel sky;
    Clock clock1, clock2, clock3;
    ZoneId zone;

    ZoneId time;

    public Clockscene(){
        cam = new GLEntwicklerkamera(800,600);
        cam.setzePosition(0,0,1000);

        new GLLicht();

        kb = new GLTastatur();

        sky = new GLHimmel("src/white.png");

        time = ZoneId.of("Europe/London");
        clock1 = new Clock(-500, 0,"London");
        clock1.setTime(getHour(time),getMinute(time), getSecond(time));

        time = ZoneId.of("-05:00");
        clock2 = new Clock(0, 0, "Washington");
        clock2.setTime(getHour(time),getMinute(time), getSecond(time));

        time = ZoneId.of("Europe/Brussels");
        clock3 = new Clock(+500, 0, "Berlin");
        clock3.setTime(getHour(time),getMinute(time), getSecond(time));

        run();
    }
    private int getHour(ZoneId zone) {
        return java.time.LocalTime.now(zone).getHour();
    }
    private int getMinute(ZoneId zone) {
        return java.time.LocalTime.now(zone).getMinute();
    }
    private int getSecond(ZoneId zone) {
        return java.time.LocalTime.now(zone).getSecond();
    }

    public void run(){
        while (!kb.esc()){
            clock1.rotatePointer();
            clock2.rotatePointer();
            clock3.rotatePointer();
            Sys.warte(1000);
        }
        Sys.beenden();
    }
}
