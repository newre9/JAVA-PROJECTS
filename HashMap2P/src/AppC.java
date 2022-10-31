import java.util.HashMap;
import java.util.Scanner;
public class AppC {

	public static void main(String[] args) {
		HashMap<String ,Integer> name=new HashMap<String ,Integer> ();
		Scanner input=new Scanner(System.in);
		int key=-1;
		int keykontrol;
		while(key==-1) {
			System.out.println("--------------------");
			System.out.println("-1- EKLE");
			System.out.println("-2- SİL");
			System.out.println("-3- GÜNCELLE");
			System.out.println("-4- LİSTE getir");
			System.out.println("-5- KEY list");
			System.out.println("-6- VALUE list");
			System.out.println("-7- Özel değeri GETIR");
			System.out.println("-8- Liste tamamını SIL");
			System.out.println("-9- ÇIKIŞ");
			System.out.println("--------------------");
			int secim=input.nextInt();
			input.nextLine();
			switch(secim) {
			case 1:
				System.out.println("Eklemek istediğiniz datanın KEY i girebilirsiniz ");
				String k=input.nextLine();
				System.out.println("Girdeğiniz KEY'e ait VALUE girin");
				int v=input.nextInt();
				name.put(k, v);
				System.out.println("Girdiğiniz bilgiler başarı bir şekilde EKLENDI");
				System.out.println("MENU için -1 ÇIKIŞ için 9");
				keykontrol=input.nextInt();
				key=keykontrol;
				break;
			case 2:
				System.out.println("Silmek istediğiniz datanın KEY i girebilirsiniz ");
				String s=input.nextLine();
				name.remove(s);
				System.out.println("Silmek istediğiniz bilgiler başarı bir şekilde silindi ");
				System.out.println("MENU için -1 ÇIKIŞ için 9");
				keykontrol=input.nextInt();
				key=keykontrol;
				break;
			case 3:
				System.out.println("Güncellemek istediğiniz datanın KEY i girebilirsiniz ");
				String g=input.nextLine();
				System.out.println("Güncellemek istediğiniz datanın VALUE  girebilirsiniz ");
				int vg=input.nextInt();
				name.put(g,vg);
				System.out.println("bilgiler başarı bir şekilde güncellendi");
				System.out.println("MENU için -1 ÇIKIŞ için 9");
				keykontrol=input.nextInt();
				key=keykontrol;
				break;
			case 4:
				System.out.println(name);
				break;
			case 5:
				System.out.println("eklenilen KEY datalar");
				for(String ky:name.keySet()) {
					System.out.println(ky);
				}
				System.out.println("MENU için -1 ÇIKIŞ için 9");
				keykontrol=input.nextInt();
				key=keykontrol;
				break;
			case 6:
				System.out.println("eklenilen VALUE datalar");
				for(int vl:name.values()) {
					System.out.println(vl);
				}
				System.out.println("MENU için -1 ÇIKIŞ için 9");
				keykontrol=input.nextInt();
				key=keykontrol;
				break;
			case 7:
				System.out.println("istediğiniz KEY i bilgilerini girin");
				String getir=input.nextLine();
				System.out.println("istediğiniz key:"+getir+" "+"Value:"+name.get(getir));
				System.out.println("MENU için -1 ÇIKIŞ için 9");
				keykontrol=input.nextInt();
				key=keykontrol;
				break;
			case 8:
				name.clear();
				System.out.println(name);
				System.out.println("Liste tamamı silindi");
				System.out.println("MENU için -1 ÇIKIŞ için 9");
				keykontrol=input.nextInt();
				key=keykontrol;
				break;
			case 9:
				key=3;
				break;
			default:
				System.out.println("geçersiz bir seçim");
				break;
			}
			
		}
		System.out.println("Çıkış Yapıldı");
	}

}
