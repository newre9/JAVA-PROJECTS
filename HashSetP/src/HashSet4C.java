import java.util.*;
public class HashSet4C {

	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		LinkedList<String> iki=new LinkedList<String>();
		int key=6;
		while(key==6) {
			System.out.println("***************");
			System.out.println("-5- ÇIKIŞ");
			System.out.println("-1- SAYI eklemek istiyorum");
			System.out.println("-2- sil  istiyorum");
			System.out.println("-3- liste eklemek istiyorum");
			System.out.println("-4- index son hali");
			System.out.println("********************");
			int secim=i.nextInt();
			i.nextLine();
			switch(secim) {
			case 1:
				System.out.println("eklemek istediğini bir isim girin");
				String ekle=i.nextLine();
			iki.add(ekle);	
				
				break;
			case 2:
				System.out.println("silmek istediğini bir isim girin");
				String sil=i.nextLine();
			iki.remove(sil)	;
				
				break;
			case 3:
				System.out.println(iki);
			
				
				break;
			case 4:
				System.out.println("getir index istediğini bir isim girin");
				int g=i.nextInt();
				//iki.remove(g)	;
				System.out.println(iki.get(g));
				
				break;
			case 5:
				key=0;
				
				break;
				
			}
		}
		System.out.println("çıkış yaptınız ");
	}

}
