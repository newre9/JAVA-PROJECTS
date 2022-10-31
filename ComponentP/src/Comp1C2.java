import javax.swing.*;
import java.awt.*;

public class Comp1C2 {
	
	public static void main(String[] args) {
		JFrame f=new JFrame("Radio Button");
		JLabel x=new JLabel("Login");
		JLabel r1=new JLabel("EMAİL");
		JTextField r2=new JTextField (10);
		JLabel r3=new JLabel("Password");
		JPasswordField r4=new JPasswordField();
		x.setBounds(75,50,100,30);
		r1.setBounds(75,100,100,30);
		r2.setBounds(150,100,100,30);
		r3.setBounds(75,150,100,30);
		r4.setBounds(150,150,100,30);
		f.add(r1); f.add(r2);f.add(x);f.add(r3);f.add(r4);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);  
		   
	
	}

}
