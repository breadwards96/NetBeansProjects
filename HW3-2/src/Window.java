
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonedwards
 */
public class Window {
    private double temp;
    private String scale;
    JFrame window;
    JTextField tempInput;
    JTextField scaleInput;
    JButton convertButton;
        
    public Window(){
        
        window = new JFrame("C/F Converter");
        tempInput = new JTextField("Temperature");
        scaleInput = new JTextField("Temperature Scale");
        convertButton = new JButton("Convert");
         
        
    }

    /**
     * @return the temp
     */
    public double getTemp() {
        return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }

    /**
     * @return the scale
     */
    public String getScale() {
        return scale;
    }

    /**
     * @param scale the scale to set
     */
    public void setScale(String scale) {
        this.scale = scale;
    }
    
    
}
