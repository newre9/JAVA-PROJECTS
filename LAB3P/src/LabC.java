import java.util.*;
public class LabC {

	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		LinkedList<String> student=new LinkedList<String>();
		int k=100;
		int keykontrol;
		while(k==100) {
			System.out.println("************************");
			System.out.println("-1-Öğrenci İsim EKLE");
			System.out.println("-2-Öğrenci SİL");
			System.out.println("-3- Öğrenci LİSTESİ");
			System.out.println("-4- INDEX ile Öğrenci bilgi Getir");
			System.out.println("-5- ÇIKIŞ");
			
			System.out.println("************************");
			int secim=i.nextInt();
			i.nextLine();
			switch(secim) {
			case 1:
				System.out.println("Eklemek istediğiniz Öğrenci bilgisini girin");
				String isim=i.nextLine();
				student.add(isim);
				System.out.println("ÇIKIŞ için 5'e MENU için 6'ya basabilirsiniz ");
				keykontrol=i.nextInt();
				k=keykontrol;
				break;
			case 2:
				System.out.println("Silmek istediğiniz Öğrencinin ismini giriniz");
				String os=i.nextLine();
				student.remove(os);
				System.out.println("ÇIKIŞ için 5'e MENU için 6'ya basabilirsiniz");
				keykontrol=i.nextInt();
				k=keykontrol;
				break;
			case 3:
				System.out.println("LISTE SON HALİ");
				System.out.println("************************");
				System.out.println(student);
				System.out.println("ÇIKIŞ için 5'e MENU için 6'ya basabilirsiniz");
				keykontrol=i.nextInt();
				k=keykontrol;
				break;
			case 4:
				System.out.println("Silmek istediğiniz INDEX sayısını giriniz");
				int in=i.nextInt();
				System.out.println("İstediğiniz INDEX sayısına ait Değer:"+student.get(in));
				System.out.println("ÇIKIŞ için 5'e MENU için 6'ya basabilirsiniz");
				keykontrol=i.nextInt();
				k=keykontrol;
				break;
			case 5:
				k=7;
				break;
			default:
				System.out.println("Geçersiz bir Seçim");
				break;
			
			}//switch case bitiş 
			
		}//while bitiş 
System.out.println("Çıkış Yaptınız");
	}

}
