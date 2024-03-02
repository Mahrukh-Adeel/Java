package Converter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class convertor {
    public static void main(String[] args) {
		JFrame f = new JFrame();
        f.setTitle("Converter");
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        JPanel p1 = new JPanel();
        JLabel l1 = new JLabel("Gallon");
        p1.add(l1);
        JTextField b1 = new JTextField();
        b1.setColumns(15);
        p1.add(b1);
        JPanel p2 = new JPanel();
        JLabel l2 = new JLabel("Litre");
        p2.add(l2);
        JTextField b2 = new JTextField();
        b2.setColumns(15);
        p2.add(b2);
        JPanel p3 = new JPanel();
        JButton b = new JButton("Convert");
        p3.add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    if(b1.getText().isEmpty()&&b2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"No data");
                }
                else if(!b1.getText().isEmpty()){
                    Double c = 3.785412 * Double.parseDouble(b1.getText());
                    b2.setText(Double.toString(c));
                    b1.setText("");
                }
                else{
                    Double c = 0.264172 * Double.parseDouble(b2.getText());
                    b1.setText(Double.toString(c));
                    b2.setText("");
                }
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Invalid input");
                }
            }
        
    });
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));
        p2.setLayout(new FlowLayout(FlowLayout.LEFT));
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.add(p2,BorderLayout.CENTER);
        f.add(p1,BorderLayout.NORTH);
        f.add(p3,BorderLayout.SOUTH);
        f.setVisible(true);
    }
}
