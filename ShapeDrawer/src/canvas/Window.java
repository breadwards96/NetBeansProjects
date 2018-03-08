package canvas;

import java.awt.BorderLayout;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author brandonedwards
 */
public class Window extends JFrame {

    Drawer pencil;

    public Window() {

        pencil = new Drawer();

        this.setSize(500, 500);
        this.setTitle("Drawing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(pencil = new Drawer(), BorderLayout.CENTER);
        this.addKeyListener(new moveListener());
        this.setVisible(true);

    }

    private class moveListener implements KeyListener {
        
        int movement = 10;
        Shape rect = new Rectangle2D.Double(50,50,10,10);

        public moveListener() {
        }

        @Override
        public void keyTyped(KeyEvent e) {
            
            pencil.getGraphics().clearRect(0, 0, 500, 500);
            
            switch (e.getKeyChar()) {
                case 'w':
                    System.out.println("w pressed");
                    
                    pencil.getGraphics().drawRect(
                            (int)rect.getBounds().x,
                            (int)rect.getBounds().y-movement,
                            (int)rect.getBounds().getWidth(),
                            (int)rect.getBounds().getHeight());
                    
                    rect.getBounds().setRect(
                            (int)rect.getBounds().x,
                            (int)(rect.getBounds().y-movement),
                            (int)rect.getBounds().getWidth(),
                            (int)rect.getBounds().getHeight());
                    break;
                case 's':
                    System.out.println("s pressed");
                    
                    pencil.getGraphics().drawRect(
                            (int)rect.getBounds().x,
                            (int)rect.getBounds().y+movement,
                            (int)rect.getBounds().getWidth(),
                            (int)rect.getBounds().getHeight());
                    
                    pencil.setRect(rect);
                    break;
                    
                case 'a':
                    System.out.println("a pressed");
                    
                    pencil.getGraphics().drawRect(
                            (int)rect.getBounds().x-movement,
                            (int)rect.getBounds().y,
                            (int)rect.getBounds().getWidth(),
                            (int)rect.getBounds().getHeight());
                    break;
                    
                case 'd':
                    System.out.println("d pressed");
                    
                    pencil.getGraphics().drawRect(
                            (int)rect.getBounds().x+movement,
                            (int)rect.getBounds().y,
                            (int)rect.getBounds().width,
                            (int)rect.getBounds().height);
                    break;

            }

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

    }
}
