/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

/**
 *
 * @author brandonedwards
 */
public class Drawer extends JComponent{

        
        private int x = 50;
        private int y = 50;
    
    public Drawer() {
    }

    @Override
    public void paint(Graphics g){
        
        Graphics2D painter = (Graphics2D)g;
        
        painter.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        Shape rect = new Rectangle2D.Float(x,y,10,10);
        
        painter.setPaint(Color.BLACK);
        
        painter.draw(rect);
        
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
}
