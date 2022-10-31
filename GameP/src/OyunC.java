import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
public class OyunC {
static JButton b1,bo,b2,bt,bs;
static JTextField tf;
static JLabel l;
static int r1,r2,r3,result;
	public static void main(String[] args) {
		JFrame f=new JFrame("Sayı Oyun");
		Random r=new Random();
		//Bileşenleri oluşturma 
		b1=new JButton();
		bo=new JButton();
		b2=new JButton();
		bt=new JButton();
		bs=new JButton("BAŞLA");
		tf=new JTextField(16);
		l=new JLabel();
		b1.setVisible(false);
		bo.setVisible(false);
		b2.setVisible(false);
		bt.setVisible(false);
		tf.setVisible(false);
		l.setVisible(false);
		 JPanel p=new JPanel();
		p.add(b1);
		p.add(bo);
		p.add(b2);
		p.add(tf);
		p.add(bt);
		p.add(bs);
		p.add(l);
		f.add(p);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(tf.getText())==result) {
					l.setText("Sonuc Doğru");
				}else {
					l.setText("Yanlış Cevap ");
				}
				tf.setText(" ");
			}
		});
		bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r1=r.nextInt(1000);
				r2=r.nextInt(2000);
				r3=r.nextInt(4);
				b1.setVisible(true);
				bo.setVisible(true);
				b2.setVisible(true);
				bt.setVisible(true);
				tf.setVisible(true);
				l.setVisible(true);
				bt.setText("Test Et");
				bs.setText("Yeni Soru");
				b1.setText(Integer.toString(r1));
				b2.setText(Integer.toString(r2));
				switch(r3) {
				case 0:
					result=r1+r2;
					bo.setText("+");
					break;
				case 1:
					result=r1-r2;
					bo.setText("-");
					break;
				case 2:
					result=r1*r2;
					bo.setText("*");
					break;
				case 3:
					result=r1/r2;
					bo.setText("/");
					break;
				
				}
				
			}
		});
		//pencere Özelikleri 
		f.setResizable(false);
		f.setSize(200,240);
		f.setLocation(300, 200);
		f.setVisible(true);

	}

}
