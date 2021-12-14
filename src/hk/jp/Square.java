package hk.jp;

import java.awt.*;

public class Square {
    public Square(int x, int y){
        this.x=x;
        this.y=y;
    }

    private final int r = 50;
    private final int x;
    private final int y;

    public void drawSquare(Graphics g){g.fillRect(x, y, r, r);}
}

