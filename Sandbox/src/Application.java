import nl.saxion.app.SaxionApp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1920, 768);
    }
    public void run() {
        int waysToWin = 0;

        BigInteger time = new BigInteger("61677571");
        BigInteger distance = new BigInteger("430103613071150");

        for(BigInteger j = new BigInteger("0");
            j.compareTo(time) < 0;
            j = j.add(BigInteger.ONE))
        {
            if(j.multiply((time.subtract(j))).compareTo(distance) > 0)
            {
                waysToWin++;
            }
        }
        SaxionApp.printLine(waysToWin);
    }
}