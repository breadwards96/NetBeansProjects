package TempConverter;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Brandon Edwards
 * @since 2/11/18
 *
 **/
/**
 * honorCode I pledge that this submission is solely my work, and that I have
 * neither given to nor received help from anyone other than the instructor or
 * TAs.
 *
 */
public class Window extends JFrame {

    //fields
    private double temp;
    private String scale;
    private JPanel panel;
    private JLabel tempLabel;
    private JLabel scaleLabel;
    private JTextField tempInput;
    private JTextField scaleInput;
    private JButton convertButton;
    private String convertion;
    private String invertScale = "";

    //constructor
    public Window() {

        //initializing each part of the window
        setName("C/F Converter");
        panel = new JPanel();
        tempLabel = new JLabel("Temperature");
        scaleLabel = new JLabel("Scale");
        tempInput = new JTextField();
        scaleInput = new JTextField();
        convertButton = new JButton("Convert");

        //setting properties of the main window
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //resizing the textfields
        tempInput.setPreferredSize(new Dimension(100, 20));
        scaleInput.setPreferredSize(new Dimension(100, 20));

        //adding the panel to the window
        add(panel);

        //adding all the other components to the panel
        panel.add(tempLabel);
        panel.add(tempInput);
        panel.add(scaleLabel);
        panel.add(scaleInput);
        panel.add(convertButton);
        panel.setVisible(true);

        //making an action listener for the button
        convertButton.addActionListener(new ButtonListener());

        //displaying the completed window to the user
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {

        //constructor for the ActionListener
        public ButtonListener() {
        }

        //the inherited abstract method from ActionListener
        //to allow for button operation
        @Override
        public void actionPerformed(ActionEvent e) {

            //putting the TextFields into their respective variables for use later
            temp = Double.parseDouble(tempInput.getText());
            scale = scaleInput.getText();

            //invoking the conversion method and passing in the fields
            //containing temperature and the scale
            convertion = conversion(temp, scale);

            //displaying a OptionPane window with the results
            JOptionPane.showMessageDialog(panel,"the conversion of " + temp
                    + " degrees " + scale
                    + " to " + invertScale
                    + " is " + convertion);

        }

        public String conversion(double temp, String scale) {

            //fields
            invertScale = "Celsius";
            String conversion = "";
            double calc;

            //an if that converts celsius temperatures to fahrenheit
            if (scale.toLowerCase().equals("celsius")) {
                invertScale = "Fahrenheit";
                calc = ((temp * (9.0 / 5.0)) + 32.0);
                conversion = String.valueOf(calc);
            }
            //an if that converts fahrenheit temperatures to celsius
            if (scale.toLowerCase().equals("fahrenheit")) {
                calc = ((temp - 32.0) * (5.0 / 9.0));
                conversion = String.valueOf(calc);
            }

            return conversion;
        }

    }

}
