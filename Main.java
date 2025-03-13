import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Student Registration Form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(850,1000);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setLayout(null);
		
		ImageIcon icon = new ImageIcon("Image/Adobe_Express_-_file-removebg-preview (1).png");
		JLabel label3 = new JLabel(icon);
		label3.setBounds(0, 0, 850, 175);
		frame.add(label3);
		
		JLabel label2 = new JLabel();
		label2.setText("Student Registration Form");
		label2.setBounds(245, 190, 500, 30);
		label2.setForeground(Color.LIGHT_GRAY);
		Font font1 = new Font("Arial", Font.PLAIN, 30);
		label2.setFont(font1);
		frame.add(label2);
		
		JLabel label4 = new JLabel();
		label4.setText("Name: ");
		label4.setForeground(Color.white);
		label4.setBounds(5, 240, 50, 20);
		frame.add(label4);
		
		JTextField field1 = new JTextField();
		field1.setBounds(110, 240, 300, 20);
		frame.add(field1);
		
		JLabel label5 = new JLabel();
		label5.setText("Father's Name: ");
		label5.setForeground(Color.white);
		label5.setBounds(5, 270, 100, 20);
		frame.add(label5);
		
		JTextField field2 = new JTextField();
		field2.setBounds(110, 270, 300, 20);
		frame.add(field2);
		
		JLabel label6 = new JLabel();
		label6.setText("Mother's Name: ");
		label6.setForeground(Color.white);
		label6.setBounds(5, 300, 100, 20);
		frame.add(label6);
		
		JTextField field3 = new JTextField();
		field3.setBounds(110, 300, 300, 20);
		frame.add(field3);
		
		JLabel label7 = new JLabel();
		label7.setText("Sex: ");
		label7.setBounds(5, 330, 50, 20);
		label7.setForeground(Color.WHITE);
		frame.add(label7);
		
		JRadioButton radio1 = new JRadioButton();
		radio1.setText("Male");
		radio1.setBounds(110, 330, 70, 20);
		frame.add(radio1);
		
		JRadioButton radio2 = new JRadioButton();
		radio2.setText("Female");
		radio2.setBounds(200, 330, 70, 20);
		frame.add(radio2);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(radio1);
		group1.add(radio2);
		
		JLabel label8 = new JLabel();
		label8.setText("Email: ");
		label8.setBounds(5, 360, 60, 20);
		label8.setForeground(Color.WHITE);
		frame.add(label8);
		
		JTextField field4 = new JTextField();
		field4.setBounds(110, 360, 300, 20);
		frame.add(field4);
		
		
		
		
	
		frame.setVisible(true);
		

	}

}
