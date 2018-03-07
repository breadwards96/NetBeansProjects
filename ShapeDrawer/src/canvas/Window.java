/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvas;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Panel;
import javax.swing.JFrame;

/**
 *
 * @author brandonedwards
 */
public class Window extends JFrame {

    Panel panel;
    Drawer draw;
    Canvas space;

    public Window() {
        
        this.setSize(500,500);
        this.setTitle("Drawing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new Drawer(), BorderLayout.CENTER);
        this.setVisible(true);
        
        this.space = new Canvas();
        this.draw = new Drawer();
        this.panel = new Panel();
        
        panel.add(space);
        this.add(panel);
        
        
        
        
    }
    
    
}
