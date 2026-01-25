package Slip1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Slip19_2 extends JFrame implements ActionListener
{
JComboBox cb;
JTextField t;
public Slip19_2()
{
setTitle(" TYBCS Subject" );
// Subject list
String subjects[] = {
" Operating Systems" ,
" Computer Networks" ,
" TCS" ,
" Java" ,
" Python" ,
" Web Technology" ,
" Data Science" ,
" Block Chain" 
};
JLabel l1=new JLabel(" Select Subject:" );
cb = new JComboBox(subjects);
cb.addActionListener(this);

JLabel l2=new JLabel(" Selected Subject:" );
t = new JTextField(20);

// Layout setup

setLayout(new FlowLayout());
add(l1);
add(cb);
add(l2);
add(t);

setSize(300, 150);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
String selected = (String) cb.getSelectedItem();
t.setText(selected);
}
// Main method
public static void main(String[] args)
{
new Slip19_2();
}
}