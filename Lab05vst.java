// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        //bottom right
        int x1 = 50;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        //bottom left
        int x3 = 950;
        int y3 = 640;
        int x4 = 10;
        int y4 = 640;
        //top right
        int x5 = 50;
        int y5 = 10;
        int x6 = 990;
        int y6 = 10;
        //top left
        int x7 = 950;
        int y7 = 10;
        int x8 = 10;
        int y8 = 10;

        //Middle One s=second shape
        //bottom right
        int sx1 = 200;
        int sy1 = 440;
        int sx2 = 800;
        int sy2 = 400;
        //bottom left
        int sx3 = 800;
        int sy3 = 440;
        int sx4 = 200;
        int sy4 = 400;
        //top right
        int sx5 = 200;
        int sy5 = 200;
        int sx6 = 800;
        int sy6 = 250;
        //top left
        int sx7 = 800;
        int sy7 = 200;
        int sx8 = 200;
        int sy8 = 250;

        g.drawRect(10,10,width,height);
        for (int k = 1; k <= 94; k+=1) {
            g.drawLine(x1 += 10, y1, x2, y2 -= 6);
            g.drawLine(x3 -= 10,y3,x4,y4 -=6);
            g.drawLine(x5 +=10,y5,x6,y6 +=6);
            g.drawLine(x7 -=10,y7,x8,y8 +=6);
        }
        for (int k = 1; k <= 30; k+=1) {
            //middle one
            g.drawLine(sx1 += 20, sy1, sx2, sy2 -= 6);
            g.drawLine(sx3 -= 20, sy3, sx4, sy4 -= 6);
            g.drawLine(sx5 += 20, sy5, sx6, sy6 += 6);
            g.drawLine(sx7 -= 20, sy7, sx8, sy8 += 6);
        }
    }
}
