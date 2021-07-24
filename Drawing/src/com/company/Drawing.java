//Robert Marsh
//Nov 2, 2020
//Program makes a 2D drawing


package com.company;

import javax.swing.*;
import java.awt.*;

public class Drawing extends JPanel {
    //set variables
    private final int X;
    private final int Y;
    private final int HEIGHT;
    private final int WIDTH;
    //constructor to set variables
    public Drawing(int X, int Y, int HEIGHT, int WIDTH){
        this.X = X;
        this.Y = Y;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    //paint class
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Color skyblue = new Color(172, 242, 255);//sky color
        Color brown = new Color(147, 81, 22);//tree trunk color
        Color foliage = new Color(15, 86, 2);//foliage green


        g2d.setColor(skyblue);
        g2d.fillRect(X - 50, Y - 50, WIDTH + 425, HEIGHT + 260);//blue background

        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawOval(X + 150, Y + 60, WIDTH, HEIGHT - 20);//ufo black cockpit outline

        g2d.setColor(Color.gray);
        g2d.fillOval(X + 150, Y + 60, WIDTH, HEIGHT - 20);//ufo gray cockpit

        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawOval(X + 100, Y + 75, WIDTH + 100, HEIGHT - 20);//ufo black body outline

        g2d.setColor(Color.gray);
        g2d.fillOval(X + 100, Y + 75, WIDTH + 100, HEIGHT - 20);//ufo body

        g2d.setColor(foliage);
        g2d.fillPolygon(new int[] {X - 50 ,X - 50, X}, new int[] {Y + 100, 75, Y + 100}, 3);//top tree part, left tree

        g2d.setColor(foliage);
        g2d.fillPolygon(new int[] {X - 50 ,X - 50, X + 15}, new int[] {Y + 150, 100, Y + 150}, 3);//middle tree part, left tree

        g2d.setColor(foliage);
        g2d.fillPolygon(new int[] {X - 50 ,X - 50, X + 25}, new int[] {Y + 200, 125, Y + 200}, 3);//bottom tree part, left tree

        g2d.setColor(brown);
        g2d.fillRect(X - 50, Y + 200, WIDTH - 50, HEIGHT + 10);//tree trunk

        g2d.setColor(foliage);
        g2d.fillOval(X + 245, Y + 225, WIDTH + 10, HEIGHT);//left part of bush

        g2d.setColor(foliage);
        g2d.fillOval(X + 260, Y + 210, WIDTH - 10, HEIGHT + 10);//middle part of bush

        g2d.setColor(foliage);
        g2d.fillOval(X + 270, Y + 225, WIDTH, HEIGHT);//right part of bush

        g2d.setColor(Color.black);
        g2d.fillRect(X - 50, Y + 255, WIDTH + 425, HEIGHT + 106);//black bottom

        g2d.setColor(Color.white);
        g2d.setFont(new Font("Arial Black", Font.PLAIN, 50));
        g2d.drawString("I WANT TO", X + 45, Y + 325);
        g2d.drawString("BELIEVE", X + 65, Y + 375);//I want to believe text
    }

    public static void main(String[] args) {

        JPanel drawing = new Drawing(50, 50, 50, 75);//create new drawing
        JFrame frame = new JFrame("Drawing");//set frame and title it
        frame.setPreferredSize(new Dimension(500, 500));//set window size
        frame.add(drawing);//add drawing class to frame
        frame.pack();//pack frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close window instructions
        frame.setVisible(true);//set window to visible

    }
}
