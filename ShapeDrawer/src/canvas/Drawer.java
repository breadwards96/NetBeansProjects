/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

/**
 *
 * @author brandonedwards
 */
public class Drawer extends JComponent{

        private Shape rect;
    
    public Drawer() {
    }

    @Override
    public void paint(Graphics g){
        
        Graphics2D painter = (Graphics2D)g;
        
        painter.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        setRect(new Rectangle2D.Float(50, 50, 10, 10));
        
        painter.setPaint(Color.BLACK);
        
        painter.draw(getRect());
        
    }

    /**
     * @return the rect
     */
    public Shape getRect() {
        return rect;
    }

    /**
     * @param rect the rect to set
     */
    public void setRect(Shape rect) {
        this.rect = rect;
    }
    
}
