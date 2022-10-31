import javax.swing.*;
import java.awt.*;
public class IconC {

	public static void main(String[] args) {
		JFrame f=new JFrame("İcon App");
		Image i=Toolkit.getDefaultToolkit().getImage("C:\\Users\\Master\\Desktop\\image\\icon.jpg");
		f.setIconImage(i);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
