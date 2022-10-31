import java.util.Scanner;
import java.util.LinkedList;
public class App3C {

	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		LinkedList<String> name= new LinkedList<String>();
		System.out.println("Döngü kaç defa dönsün");
		int s=i.nextInt();
		i.nextLine();//RAM bellek durumundan dolayı ekledik 
		while(s>=0) {
			System.out.println("girmek istediğiniz datayı girin");
			String c=i.nextLine();
			name.add(c);
		s--;	
		}
		System.out.println("Girilen data bilgiler:"+name);

	}

}
