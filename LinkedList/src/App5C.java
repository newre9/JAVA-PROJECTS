import java.util.Scanner;
import java.util.LinkedList;
public class App5C {

	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		LinkedList<Integer> iki=new LinkedList<Integer>();
		LinkedList<Integer> uc=new LinkedList<Integer>();
		LinkedList<Integer> dort=new LinkedList<Integer>();
		int key=6;
		while(key==6) {
			System.out.println("***************");
			System.out.println("-0- ÇIKIŞ");
			System.out.println("-1- SAYI eklemek istiyorum");
			System.out.println("-2- LISTE son hali");
			System.out.println("********************");
			int secim=i.nextInt();
			switch(secim) {
			case 0:
				key=0;
				break;
			case 1:
				System.out.println("eklemek istediğini bir tamsayı girin");
				int ekle=i.nextInt();
				if(ekle>9 && ekle<100) {
					iki.add(ekle);
				}else if(ekle>99 && ekle<1000) {
					uc.add(ekle);
				}else if(ekle>999 && ekle<10000) {
					dort.add(ekle);
				}else {
					System.out.println("farklı bir sayı girdiniz üzgünüm ekleyemiyoruz");
				}	
				
				break;
			case 2:
				System.out.println("İKİ basamaklı:"+iki);
				System.out.println("ÜÇ basamaklı"+uc);
				System.out.println("DÖRT basamaklı"+dort);
				break;
			default :
				System.out.println("yanlış bir seçim yaptınız");
				break ;
			}//switch bitiş 
			
		}//while bitiş 
		System.out.println("tekrardan görüşmek dileğiyle");
	}

}
