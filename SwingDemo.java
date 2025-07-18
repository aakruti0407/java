package com.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingDemo  implements ActionListener{
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4;
	public SwingDemo() {
		f=new JFrame("My Swing CRUD Example");
		f.setVisible(true);
		f.setSize(360, 420);
		f.setResizable(false);
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout(7,2));
		f.setLayout(null);
		
		
		l1=new JLabel("ID");
		l2=new JLabel("Fname");
		l3=new JLabel("Lname");
		l4=new JLabel("Email");
		l5=new JLabel("Mobile");
		
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		
		b1=new JButton("INSERT");
		b2=new JButton("SEARCH");
		b3=new JButton("UPDATE");
		b4=new JButton("DELETE");
		

		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(l5);
		f.add(t5);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		

		l1.setBounds(50, 50, 120, 20);
		l2.setBounds(50, 50, 120, 20);
		l3.setBounds(50, 150, 120, 20);
		l4.setBounds(50, 200, 120, 20);
		l5.setBounds(50, 250, 120, 20);
		
		
		
		t1.setBounds(150, 50, 150, 20);
		t2.setBounds(150, 50, 150, 20);
		t3.setBounds(150, 150, 150, 20);
		t4.setBounds(150, 200, 150, 20);
		t5.setBounds(150, 250, 150, 20);
		
		
		b1.setBounds(50, 300, 120, 20);
		b2.setBounds(175, 300, 120, 20);
		b3.setBounds(50, 330, 120, 20);
		b4.setBounds(175, 330, 120, 20);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

}
	public static void main(String[] args) {
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			if(t2.getText().equals("")|| t3.getText().equals("")|| t4.getText().equals("")|| t5.getText().equals(""))
			{
				JOptionPane.showMessageDialog(f, "All Fileds are Mandatroy");
			}
			else
			{
			    try {
				     Class.forName("com.mysql.jdbc.Driver");
				     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_swing_10","root","");
				     String sql="insert into student(fname,lname,email,mobile) values(?,?,?,?)";
				     PreparedStatement pst=conn.prepareStatement(sql);
				     pst.setString(1,t2.getText());
				     pst.setString(2,t3.getText());
				     pst.setString(3,t4.getText());
				     pst.setLong(4,Long.parseLong(t5.getText()));
				     pst.executeUpdate();
				     JOptionPane.showMessageDialog(f, "Data Inserted Succesfully");
				     
			         } catch (Exception e2) {
				       e2.printStackTrace();
			         }
			}
				
			}
		else if(e.getSource()==b1)
		{
			System.out.println("Search Button Clicked");
		}
		else if(e.getSource()==b1)	
		{
			System.out.println("Update Button Clicked");
		}
		else if(e.getSource()==b1)
		{
			System.out.println("Delete BuStton Clicked");
		}


		
		
	}
}


