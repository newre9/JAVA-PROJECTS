import javax.swing.*;
import java.awt.*;
public class RadioButtonC {

	public static void main(String[] args) {
		JFrame f=new JFrame("Radio Button");
		JLabel x=new JLabel("YAŞAM HASTANE");
		JButton r1=new JButton("A)Apex");
		JButton r2=new JButton("B)Java");
		x.setBounds(75,50,100,30);
		r1.setBounds(75,100,100,30);
		r2.setBounds(75,150,100,30);
		f.add(r1); f.add(r2);f.add(x);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
