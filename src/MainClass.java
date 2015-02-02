
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jisheng
 */
public class MainClass {
        public static void main(String[] args){  										
        ExpandingPanels test = new ExpandingPanels();  
        JFrame f = new JFrame();  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.getContentPane().add(new JScrollPane(test.getComponent()));
        f.setSize(360,500);  
        f.setLocation(200,100);  
        f.setVisible(true);  
    }  
}  
