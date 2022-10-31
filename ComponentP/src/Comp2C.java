import javax.swing.*;
import java.awt.*;
public class Comp2C {

	public static void main(String[] args) {
		 JFrame f= new JFrame("CheckBox Example");  
		 JCheckBox checkBox1 = new JCheckBox("C++");  
	        checkBox1.setBounds(100,100, 50,50);  
	        JCheckBox checkBox2 = new JCheckBox("Java");  
	        checkBox2.setBounds(100,150, 80,50);  
	        f.add(checkBox1);  
	        f.add(checkBox2);  
	        f.setSize(400,400);  
	        f.setLayout(null);  
	        f.setVisible(true);  
		

	}

}
