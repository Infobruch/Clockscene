import GLOOP.*;
public class Clockscene {
    GLKamera cam;
    GLTastatur kb;
    GLHimmel sky;
    Clock clock1, clock2, clock3;

    public Clockscene(){
        cam = new GLEntwicklerkamera(800,600);
        cam.setzePosition(0,0,1000);

        new GLLicht();

        kb = new GLTastatur();

        sky = new GLHimmel("src/white.png");

        clock1 = new Clock(-500, 0,"London");
        clock1.setTime(1, 15);

        clock2 = new Clock(0, 0, "Washington");
        clock2.setTime(2,15);

        clock3 = new Clock(+500, 0, "Berlin");
        clock3.setTime(3,15);

        run();
    }

    public void run(){
        while (!kb.esc()){
            clock1.rotatePointer();
            clock2.rotatePointer();
            clock3.rotatePointer();
            Sys.warte(100);
        }
        Sys.beenden();
    }
}