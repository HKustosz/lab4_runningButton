package hk.jp;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Frame extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    new Frame();
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

    public Frame(){
        this.setTitle("");
        this.setSize(600,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        JButton catchMeB = new JButton("Catch me");
        catchMeB.setBounds(20,80,200,60);
        catchMeB.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Random position = new Random();
                if(e.getX()<20){
                    catchMeB.setLocation(position.nextInt(400), position.nextInt(540));}
            }
        });

        JButton restartB = new JButton("Restart");
        restartB.setBounds(20,20,200,60);
        restartB.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                catchMeB.setLocation(20,80);
            }
        });

        add(canvas);
        canvas.add(catchMeB);
        canvas.add(restartB);
    }
}

