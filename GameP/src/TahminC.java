import java.util.Random;
import javax.swing.*;
public class TahminC {

	public static void main(String[] args) {
		Random r=new Random();
		int r1=r.nextInt(20);
		System.out.println(r1);
		int sayac=1;
		while(true) {
			String tahmin=JOptionPane.showInputDialog("Bir Sayı tahmin edin");
			int t=Integer.parseInt(tahmin);
			if(t==r1) {
				JOptionPane.showMessageDialog(null,"Tebrikler");
				JOptionPane.showMessageDialog(null,"Tebrikler"+sayac+".adımda bildiniz");
				break;
			}//if bitiş
			else if(r1<t) {
				JOptionPane.showMessageDialog(null, "tahmin sayınızı küçültün");
				sayac++;
				
			}//else if bitiş
			else {
				JOptionPane.showMessageDialog(null,"tahmin sayınızı büyütün");
				sayac++;
			}
			
		}//while bitiş 

	}

}
