package canvas;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author brandonedwards
 */
public class Window extends JFrame {

    private int scoreInt = 0;
    Drawer pencil;
    private JLabel score;

    public Window() {
        this.score = new JLabel();
        score.setText("Score: " + String.valueOf(scoreInt));

        pencil = new Drawer();

        this.setSize(500, 500);
        this.setTitle("Drawing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(pencil = new Drawer(), BorderLayout.CENTER);
        this.addKeyListener(new moveListener());
        this.add(score, BorderLayout.NORTH);
        this.setVisible(true);
        

    }

    private class moveListener implements KeyListener {

        int movement = 10;
        boolean pressed = true;

        public moveListener() {
        }

        @Override
        public void keyTyped(KeyEvent e) {

            switch (e.getKeyChar()) {
                case 'w':
                    System.out.println("w pressed");

                    if ((pencil.getBoxPosY()- movement) < (e.getComponent().getHeight() - 10)
                            && (pencil.getBoxPosY()- movement) > 0) {

                        pencil.SetBoxPosY(pencil.getBoxPosY()- movement);
                    }

                    pencil.repaint();

                    break;
                case 's':
                    System.out.println("s pressed");

                    if ((pencil.getBoxPosY()+ movement) < (e.getComponent().getHeight() - 20)
                            && (pencil.getBoxPosY()+ movement) > 0) {

                        pencil.SetBoxPosY(pencil.getBoxPosY()+ movement);
                    }

                    pencil.repaint();

                    break;

                case 'a':
                    System.out.println("a pressed");

                    if ((pencil.getBoxPosX()- movement) < (e.getComponent().getWidth() - 10)
                            && (pencil.getBoxPosX()- movement) > 0) {

                        pencil.setBoxPosX(pencil.getBoxPosX()- movement);
                    }

                    pencil.repaint();

                    break;

                case 'd':
                    System.out.println("d pressed");

                    if ((pencil.getBoxPosX()+ movement) < (e.getComponent().getWidth() - 10)
                            && (pencil.getBoxPosX()+ movement) > 0) {

                        pencil.setBoxPosX(pencil.getBoxPosX()+ movement);
                    }

                    pencil.repaint();

                    break;

            }

            if(pencil.getRect().intersects(pencil.getHitbox().getBounds2D())){
            pencil.setPelletPosX(pencil.getRandNumber().nextInt(490));
            pencil.setPelletPosY(pencil.getRandNumber().nextInt(490));
            
                setScoreInt(getScoreInt() + 1);
                getScore().setText("Score: " + String.valueOf(getScoreInt()));
            
            
            pencil.repaint();
        }
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

    }

    /**
     * @return the scoreInt
     */
    public int getScoreInt() {
        return scoreInt;
    }

    /**
     * @param scoreInt the scoreInt to set
     */
    public void setScoreInt(int scoreInt) {
        this.scoreInt = scoreInt;
    }

    /**
     * @return the score
     */
    public JLabel getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(JLabel score) {
        this.score = score;
    }
}
