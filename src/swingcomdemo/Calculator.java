/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingcomdemo;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Tsede
 */
public class Calculator extends JFrame{
    
Calculator(){

JTextField tt=new JTextField();
add(tt);
JButton b1 =new JButton("ADD");
JButton b2=new JButton("SUB");
b1.setBackground(Color.red);
add(b1);   
b2.setBackground(Color.yellow);
add(b2); 


    
}    
    
public static void main(String[] args){

Calculator cal=new Calculator();
cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
cal.setSize(400,400);
cal.setVisible(true);   
    
    
    
}    
    
    
    
    
    
    
    
}
