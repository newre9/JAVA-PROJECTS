import javax.swing.*;
import java.awt.*;
public class ComboBoxC {

	public static void main(String[] args) {
		JFrame f=new JFrame("Combo Box App");
		String sehir[]= {"İstanbul","Şırnak","Konya","Ankara","Batman"};
		JComboBox cb=new JComboBox(sehir);
		cb.setBounds(50,50,90,20);
		f.add(cb);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);

	}

}
