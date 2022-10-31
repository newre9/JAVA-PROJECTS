import java.util.LinkedList;
import java.util.Scanner;

public class App2C {

	public static void main(String[] args) {
		LinkedList<Integer> x=new LinkedList<Integer>();
		Scanner y=new Scanner(System.in);
		x.add(25);
		x.add(36);
		x.add(85);
		x.add(74);
		x.add(96);
		System.out.println("Aradığınız sayı girebilirsiniz");
		int f=y.nextInt();
		for(int i=0;i<x.size();i++) {
			
			if(f==x.get(i)) {
				System.out.println("Aradığınız kelime listede bulunmaktadır"+i+".düğümde yer alıyor");
				break;
			}else {
				System.out.println(i+". düğümde yok");
			}
			
			
		}//for bitiş
		

	}

}
