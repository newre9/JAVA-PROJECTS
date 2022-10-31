import java.util.Random;
import javax.swing.JOptionPane; 
public class GUI1C {

	
	
  public static void main(String[] args) {
	   Random r=new Random();
	   int a1=r.nextInt(20);
	   System.out.println(a1);
	   int sayac=1;
	   
		while(true) {
			
			String tahmin=JOptionPane.showInputDialog("Tahmininizi giriniz:");
			int a2=Integer.parseInt(tahmin);
			
			
		if(a1==a2){
			JOptionPane.showMessageDialog(null,"Tahmininiz doğru");
			JOptionPane.showMessageDialog(null,"Tebrikler! "+sayac+". adımda bildiniz.");
			
			 break;
			
		}
		else {
			
			if(a1<a2){
				JOptionPane.showMessageDialog(null,"Tahmininiz sayidan büyük!");
				sayac++;
			}
		
		
			else{
				JOptionPane.showMessageDialog(null,"Tahmininiz sayidan küçük!");
				sayac++;
			}
			
				
			
	}
		
	}
		
}
	
}