import processing.core.PApplet;

public class FourBalls_ProceduralAttempt extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int Y1 = HEIGHT * 1 / 5;
    public static final int Y2 = HEIGHT * 2 / 5;
    public static final int Y3 = HEIGHT * 3 / 5;
    public static final int Y4 = HEIGHT * 4 / 5;
    public static final int Diameter = 10;
    private int x1=0;
    private int x2=0;
    private int x3=0;
    private int x4=0;

    public static void main(String[] args) {
        PApplet.main("FourBalls_ProceduralAttempt",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
     //   super.setup();
    }

    @Override
    public void draw() {
        ellipse(x1, Y1, Diameter,Diameter);
        x1++;
        ellipse(x2,Y2, Diameter,Diameter);
        x2+=2;
        ellipse(x3,Y3, Diameter,Diameter);
        x3+=3;
        ellipse(x4,Y4, Diameter,Diameter);
        x4+=4;
    }
}
