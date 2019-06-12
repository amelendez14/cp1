/**
 * Diamond
 *
 * @Alyssa Melendez
 * 1/25/19
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingProject extends JComponent
{
    public void paintComponent(Graphics g){
        
        Graphics2D g2 = (Graphics2D)g;
        //drawGrid(g2);
        
        g2.setColor(Color.green);
        g2.fillPolygon(new int[] {50, 100, 125}, new int[] {250, 250, 350}, 3);
        g2.setColor(Color.red);
        g2.fillPolygon(new int [] {100, 150 , 125} ,new int[] {250, 250, 350}, 3);
        g2.setColor(Color.blue);
        g2.fillPolygon(new int [] {150, 200, 125 } ,new int [] {250, 250, 350 }, 3);
        g2.setColor(Color.yellow);
        g2.fillPolygon(new int [] {50, 75, 100 }, new int [] {250, 200, 250 }, 3);
        g2.setColor(Color.orange);
        g2.fillPolygon(new int [] {75, 125, 100}, new int [] {200,200, 250}, 3);
        g2.setColor(Color.magenta);
        g2.fillPolygon(new int [] {125, 100, 150}, new int []{200, 250, 250 }, 3);
        g2.setColor(Color.cyan);
        g2.fillPolygon(new int [] {125, 175, 150}, new int []{200, 200, 250}, 3);
        g2.setColor(Color.pink);
        g2.fillPolygon(new int [] {175, 150, 200}, new int [] {200, 250,250 }, 3);
       
    }
        public void drawGrid(Graphics g2){
            g2.setColor(new Color(211, 211, 211));
            
            // Draw vertical lines
                    for(int x = 0; x < 1000; x += 50){
                g2.drawLine(x, 0, x, 1000);
                g2.drawString("" + x, x, 10);
            }
            
            // Draw horizontal lines
                    for(int y = 50; y < 1000; y += 50){
                g2.drawLine(0, y, 1000, y);
                g2.drawString("" + y, 0, y);
        
                    }
        
    }
    
    
    
}
