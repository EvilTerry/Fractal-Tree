import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) { SaxionApp.start(new Application(), 1000, 1000); }
    public void run() {
        SaxionApp.setBorderColor(Color.PINK);
        fractalTree(15, 700, 700, 150, 180);
    }
    public void drawLine(int xBegin, int yBegin, int xEnd, int yEnd)
    {
        SaxionApp.drawLine(xBegin, yBegin, xEnd, yEnd);
    }

    public void fractalTree(int iteration, int x1, int y1, int length, int degrees)
    {
        if(iteration <= 0)
            return;

        double radians = Math.toRadians(degrees);
        double x2 = x1 + (int) (Math.sin(radians) * length);
        double y2 = y1 + (int) (Math.cos(radians) * length);

        drawLine(x1, y1, (int) x2, (int) y2);

        double newLength = length / 1.15;

        fractalTree(iteration - 1, (int) x2, (int) y2, (int) (newLength * 1), degrees + 30);
        fractalTree(iteration - 1, (int) x2, (int) y2, (int) (newLength * 0.7), degrees - 30);
    }
}