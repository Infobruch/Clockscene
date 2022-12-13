import GLOOP.*;
public class Clockscene {
    GLKamera cam;
    GLTastatur kb;
    Clock clock1, clock2, clock3;

    public Clockscene(){
        cam = new GLKamera(800,600);
        new GLLicht();
        kb = new GLTastatur();
        cam.setzePosition(0,0,1000);

        clock1 = new Clock(-500, 0,"London");
        clock1.stelleZeit(1, 15);
        clock2 = new Clock(0, 0, "Washington");
        clock2.stelleZeit(2,15);
        clock3 = new Clock(+500, 0, "Berlin");
        clock3.stelleZeit(3,15);

        run();
    }

    public void run(){
        while (!kb.esc()){
            clock1.weiter();
            clock2.weiter();
            clock3.weiter();
            Sys.warte(100);
        }
        Sys.beenden();
    }
}