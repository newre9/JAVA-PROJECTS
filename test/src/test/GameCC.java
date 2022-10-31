package test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class GameCC {
	static JButton l,l2,l3;
	static JButton b0,b1;
	static int r1,r2,r3;
	static int result;
	static JTextField tf;
	public static void main(String[] args) {
		JFrame f=new JFrame("APP");
		Random r=new Random();
		
		b0=new JButton("test et ");
		b0.setVisible(false);
		b1=new JButton("Başla");
		l=new JButton();
		l2=new JButton();
		l3=new JButton();
		tf=new JTextField(16);
        l.setVisible(false);
		l2.setVisible(false);
		l3.setVisible(false);
		tf.setVisible(false);
		
		JPanel p=new JPanel();
		p.add(b0);
		p.add(b1);
		p.add(l);
		p.add(l3);
		p.add(l2);
		
		p.add(tf);
		f.add(p);
		
		
	
	
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(tf.getText())==result) {
					tf.setText("doğru");
				}else {
					tf.setText("yanlış");
				}
			}
		});
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l.setVisible(true);
				l2.setVisible(true);
				l3.setVisible(true);
				tf.setVisible(true);
				b0.setVisible(true);
				b1.setText("Yeni Soru");
				 r1=r.nextInt(20);
					r2=r.nextInt(300);
					 r3=r.nextInt(4);
					 l.setText(Integer.toString(r1));
					 l2.setText(Integer.toString(r2));
						switch(r3) {
						case 0:
							result=r1+r2;
							l3.setText("+");
							break;
						case 1:
							result=r1-r2;
							l3.setText("-");
							break;
						case 2:
							result=r1*r2;
							l3.setText("*");
							break;
						case 3:
							result=r1/r2;
							l3.setText("/");
							break;
						}
			}
		});
		System.out.println(r1+".."+r2+".."+r3);
		f.setResizable(false);
		f.setSize(200,240);
		f.setLocation(300, 200);
		f.setVisible(true);
	}

}
