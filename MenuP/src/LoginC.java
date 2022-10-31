import javax.swing.*;
import java.awt.*;
public class LoginC {

	public static void main(String[] args) {
		JFrame f=new JFrame("Login Page");
		JLabel bas=new JLabel("LOGIN SAYFASI");
		JLabel e=new JLabel("E-Mail");
		JTextField tf=new JTextField(15);
		JLabel pL=new JLabel("Şifre");
		JPasswordField ps=new JPasswordField();	
		JButton bt=new JButton("Giriş Yap");
		
		bas.setBounds(75,50,100,30);
		e.setBounds(50,100,100,30);
		tf.setBounds(100,100,100,30);
		pL.setBounds(50,150,100,30);
		ps.setBounds(100,150,100,30);
		bt.setBounds(100,200,100,30);
		
		f.add(bas); f.add(e); f.add(tf); f.add(pL); f.add(ps); f.add(bt);
		
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);

	}

}
