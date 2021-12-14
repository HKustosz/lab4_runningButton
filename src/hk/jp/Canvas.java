package hk.jp;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


public class Canvas extends JPanel implements MouseInputListener {

    public int posX;
    public int posY;

    Circle circle = null;
    Square square = null;

    public Canvas(){
        setLayout(null);
        setFocusable(true);

        addMouseListener(this);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_C) {
                    circle = new Circle(posX-25, posY-25);
                    repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_S){
                    square = new Square(posX-25, posY-25);
                    repaint();
                }
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        posX = e.getX();
        posY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
            if(circle != null) {
                g.setColor(Color.GREEN);
                circle.drawCircle(g);}
            if(square != null) {
                g.setColor(Color.PINK);
                square.drawSquare(g);}
        }
    }

