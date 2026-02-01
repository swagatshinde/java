package Slip1;

import java.awt.*;
import javax.swing.*;

public class Slip18_1
{
JFrame frame;
Slip18_1()
{

frame=new JFrame();
JButton btn1=new JButton("NORTH");
JButton btn2=new JButton("SOUTH");
JButton btn3=new JButton("EAST");
JButton btn4=new JButton("WEST");
JButton btn5=new JButton("CENTER");
frame.add(btn1,BorderLayout.NORTH);
frame.add(btn2,BorderLayout.SOUTH);
frame.add(btn3,BorderLayout.EAST);
frame.add(btn4,BorderLayout.WEST);
frame.add(btn5,BorderLayout.CENTER);
frame.setTitle("BorderLayout");
frame.setSize(400,400);
frame.setVisible(true);

}
public static void main(String[] args)
{
new Slip18_1();
}
}