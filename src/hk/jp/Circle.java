package hk.jp;

import java.awt.*;

public class Circle {
    public Circle(int x, int y){
        this.x=x;
        this.y=y;
    }

    private final int r = 50;
    private final int x;
    private final int y;

    public void drawCircle(Graphics g){
        g.fillOval(x, y, r, r);
    }

}
