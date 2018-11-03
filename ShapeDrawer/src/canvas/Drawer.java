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
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.JComponent;

/**
 *
 * @author brandonedwards
 */
public class Drawer extends JComponent{

        
        private int boxPosX = 50;
        private int boxPosY = 50;
        private int pelletPosY;
        private int pelletPosX;
        private Random randNumber;
        private Shape rect;
        private Shape pellet;
        private Shape hitbox;
    
    public Drawer() {
        
        
            randNumber = new Random();
        
            pelletPosX = randNumber.nextInt(490);
        
            pelletPosY = randNumber.nextInt(490);
        
    }

    @Override
    public void paint(Graphics g){
        
        Graphics2D painter = (Graphics2D)g;
        
        painter.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        
            setRect(new Rectangle2D.Float(boxPosX,boxPosY,10,10));
        
            setPellet(new Ellipse2D.Float(getPelletPosX(), getPelletPosY(), 10, 10));
        
            setHitbox(new Rectangle2D.Float(getPelletPosX(),getPelletPosY(),10,10));
        
        painter.setPaint(Color.BLACK);
        
        painter.draw(getRect());
        painter.draw(getPellet()); 
        painter.fill(getPellet());
        
        
        
        
    }

    /**
     * @return the x
     */
    public int getBoxPosX() {
        return boxPosX;
    }

    /**
     * @param boxPosX
     */
    public void setBoxPosX(int boxPosX) {
        this.boxPosX = boxPosX;
    }

    /**
     * @return the y
     */
    public int getBoxPosY() {
        return boxPosY;
    }

    /**
     * @param boxPosY
     */
    public void SetBoxPosY(int boxPosY) {
        this.boxPosY = boxPosY;
    }

    /**
     * @return the pelletPosY
     */
    public int getPelletPosY() {
        return pelletPosY;
    }

    /**
     * @param pelletPosY the pelletPosY to set
     */
    public void setPelletPosY(int pelletPosY) {
        this.pelletPosY = pelletPosY;
    }

    /**
     * @return the pelletPosX
     */
    public int getPelletPosX() {
        return pelletPosX;
    }

    /**
     * @param pelletPosX the pelletPosX to set
     */
    public void setPelletPosX(int pelletPosX) {
        this.pelletPosX = pelletPosX;
    }

    /**
     * @return the randNumber
     */
    public Random getRandNumber() {
        return randNumber;
    }

    /**
     * @param randNumber the randNumber to set
     */
    public void setRandNumber(Random randNumber) {
        this.randNumber = randNumber;
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

    /**
     * @return the pellet
     */
    public Shape getPellet() {
        return pellet;
    }

    /**
     * @param pellet the pellet to set
     */
    public void setPellet(Shape pellet) {
        this.pellet = pellet;
    }

    /**
     * @return the hitbox
     */
    public Shape getHitbox() {
        return hitbox;
    }

    /**
     * @param hitbox the hitbox to set
     */
    public void setHitbox(Shape hitbox) {
        this.hitbox = hitbox;
    }
    
}
