/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author jose
 */
public class Ventana {
     JFrame marco;
    JPanel panel;
    JButton bPrimero, bLimpiar;
    JTextField txBox, txBox2;
    JTextArea txArea;
    JLabel label,label2;
    JTextArea JTextArea1;
    public Ventana(){
                
        marco = new JFrame(" EVENTO ");
        panel = new JPanel();
        txArea = new JTextArea("texto");
        JLabel label = new JLabel();		
        JLabel label_2 = new JLabel();		
	label.setText("Enter Name :");
        label_2.setText("Enter Name :");
        label.setBounds(10, 10, 100, 100);
        label_2.setBounds(10, 10, 100, 100);
        
        
        txBox = new JTextField("text");
        txBox.setBounds(10, 10, 100, 100);        
        bPrimero= new JButton(" VERDE ");
        bLimpiar= new JButton(" AZUL ");
        marco.setSize(800, 500);
        panel.setSize(800,500);
        
        bLimpiar.setLayout(null);
        bLimpiar.setLocation(500,900);
        panel.add(bPrimero);
        
        panel.add(bLimpiar);
        panel.add(label);
        
        panel.add(txBox);
      
        panel.add(label_2);
        panel.add(txArea);
           panel.add(JTextArea1);
        
        
        marco.add(panel);
        
        
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
