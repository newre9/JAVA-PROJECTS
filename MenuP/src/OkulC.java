import javax.swing.*;
import java.awt.*;
public class OkulC {

	public static void main(String[] args) {
		JFrame f=new JFrame("Okul App");
		JFrame f1=new JFrame("Kayıt Pencere");//yeni bir pencere
		JLabel title=new JLabel("Mehmet Bey İlk Okulu");
		JButton b1=new JButton("Öğrenci Kayıt");
		JButton b2=new JButton("Öğretmen Giriş ");
		JButton b3=new JButton("Yetkili");
		JButton b4=new JButton ("çıkış");
		title.setBounds(100,50,200,30);
		b1.setBounds(100,75,150,30);
		b2.setBounds(100,100,150,30);
		b3.setBounds(100,125,150,30);
		b4.setBounds(100,150,150,30);
		f.add(title);f.add(b1);f.add(b2);f.add(b3);f.add(b4);
		
		f1.add(b4);
		f1.setSize(500,500);
		f1.setLayout(null);
		f1.setVisible(true);
		
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
	
		
	}

}
