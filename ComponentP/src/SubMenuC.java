import javax.swing.*;
import java.awt.*;
public class SubMenuC {

	public static void main(String[] args) {
		JFrame f=new JFrame("Sub Menu app");
		JMenuBar mb=new JMenuBar();
		JMenu m=new JMenu("File");
		JMenu sm=new JMenu("New");
		JMenuItem i1= new JMenuItem("Project");
		JMenuItem i2=new JMenuItem("Class");
		sm.add(i1);
		sm.add(i2);
		m.add(sm);
		mb.add(m);
		f.setJMenuBar(mb);
		f.setSize(600,500);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
