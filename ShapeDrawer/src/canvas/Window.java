package canvas;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
//        Shape rect = new Rectangle2D.Double(50,50,10,10);

        public moveListener() {
        }

        @Override
        public void keyTyped(KeyEvent e) {
            
            pencil.getGraphics().clearRect(
                    0,
                    0,
                    e.getComponent().getWidth(),
                    e.getComponent().getHeight()
            );
            
            switch (e.getKeyChar()) {
                case 'w':
                    System.out.println("w pressed");
                    
                    pencil.setY(pencil.getY() - movement);
                    
                    pencil.repaint();
                    
                    break;
                case 's':
                    System.out.println("s pressed");
                    
                    pencil.setY(pencil.getY()+movement);
                    
                    pencil.repaint();
                    
                    break;
                    
                case 'a':
                    System.out.println("a pressed");
                    
                    pencil.setX(pencil.getX()-movement);
                    
                    pencil.repaint();
                    
                    break;
                    
                case 'd':
                    System.out.println("d pressed");
                    
                    pencil.setX(pencil.getX()+movement);
                    
                    pencil.repaint();
                    
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
