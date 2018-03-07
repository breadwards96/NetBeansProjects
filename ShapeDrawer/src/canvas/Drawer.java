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
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;

/**
 *
 * @author brandonedwards
 */
public class Drawer extends JComponent{

    @Override
    public void paint(Graphics g){
        
        Graphics2D painter = (Graphics2D)g;
        
        painter.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        Shape drawLine = new Line2D.Float(20,90,55,250);
        
        Shape drawArc2D = new Arc2D.Double(5, 150, 100, 100, 45, 180, Arc2D.OPEN);
        Shape drawArc2D2 = new Arc2D.Double(5, 200, 100, 100, 45, 45, Arc2D.CHORD);
        Shape drawArc2D3 = new Arc2D.Double(5, 250, 100, 100, 45, 45, Arc2D.PIE);
        Shape drawEllipis = new Ellipse2D.Float(10,10,100,100);
        Shape drawRoundRec = new RoundRectangle2D.Double(25, 25, 50, 50, 45, 45);
        Shape drawRect = new Rectangle2D.Float(300, 300, 150, 100);
        
        CubicCurve2D cubicCurve = new CubicCurve2D.Double();
        
        cubicCurve.setCurve(110, 50, 300, 200, 200, 200, 90, 263);
        
        painter.setPaint(Color.BLACK);
        
        painter.draw(drawLine);
        painter.draw(drawArc2D);
        painter.draw(drawArc2D2);
        painter.draw(drawArc2D3);
        painter.draw(drawEllipis);
        painter.draw(drawRoundRec);
        painter.draw(drawRect);
        
        painter.fill(drawArc2D3);
        
        
        
    }
    
}
