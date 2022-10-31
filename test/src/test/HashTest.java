package test;
import java.util.HashMap;
import java.util.Scanner;
public class HashTest {

	public static void main(String[] args) {
		HashMap<String,Integer>	 name=new HashMap<String,Integer>();
		Scanner in=new Scanner(System.in);
		int key=5;
		int keykontrol;
		while(key==5) {
			System.out.println("ekle-1-");
			System.out.println("listele-2-");
			
			System.out.println("güncelleme-3-");
			System.out.println("sil-2-");
			System.out.println("listeyi tamamını sil-5-");
			System.out.println("value göre listele-6-");
			System.out.println("keyset göre listele-7-");
			System.out.println("getir-8-");
			System.out.println("çıkış-9-");
			
			int x=in.nextInt();
			in.nextLine();
			
			switch(x) {
			case 1:
				System.out.println("key");
			String y=in.nextLine();
			System.out.println("value");
			int z=in.nextInt();
			name.put(y, z);
			System.out.println("çıkış 0 menu 5");
			keykontrol=in.nextInt();
			key=keykontrol;
				break;
			case 2:
			
			System.out.println(name);
		
			
				break;
			case 3:
				System.out.println("key");
				String yy=in.nextLine();
				System.out.println("value");
				int zz=in.nextInt();
				name.put(yy, zz);
				break;
			case 4:
				System.out.println("key");
				String yyy=in.nextLine();
				name.remove(yyy);
				break;
			case 5:
				
				name.clear();
				break;
case 6:
				
	for(int i:name.values()) {
		System.out.println(i);
		
	}
				break;
case 7:
	for(String k:name.keySet()) {
		System.out.println(k);
	}
	break;
case 8:
	System.out.println("key");
	String yyyy=in.nextLine();
	System.out.println("aradığınız key :"+yyyy+" "+"değeri:"+name.get(yyyy));
	break;
			}
			
		}
		System.out.println("çıkış yapıldı");
	}

}
