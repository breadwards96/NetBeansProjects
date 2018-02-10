
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonedwards
 */
public class TempConverter extends JFrame implements ActionListener {
    
    double temp;
    String scale;
    
    public static void main(String[] args) {
        
        
        JFrame window = new JFrame("C/F Converter");
        JTextField tempInput = new JTextField("Temperature");
        JTextField scaleInput = new JTextField("Temperature Scale");
        JButton convertButton = new JButton("Convert");
        
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
   public static String conversion(double temp, String scale){
        
       
       
       return null;
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String conversion = conversion(temp, scale);
        
    }
}