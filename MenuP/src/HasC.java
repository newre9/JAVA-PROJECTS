import javax.swing.*;
import java.awt.*;
public class HasC {

	public static void main(String[] args) {
		JFrame f=new JFrame("Hastane App");
		JLabel title=new JLabel("YAŞAM HASTANE");
		JButton b1=new JButton("Hasta Kayıt");
		JButton b2=new JButton("Doktor Giriş için");
		JButton b3=new JButton("Başhekim Sayfa");
		JButton b4=new JButton("Çıkış");
		JLabel slogan=new JLabel("Sağlığınızı Önemsiyoruz");
		
		title.setBounds(100,50,200,30);
		b1.setBounds(75,75,150,30);
		b2.setBounds(75,100,150,30);
		b3.setBounds(75,125,150,30);
		b4.setBounds(75,150,150,30);
		slogan.setBounds(75,175,200,30);
		
		f.add(title); f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(slogan); 
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
