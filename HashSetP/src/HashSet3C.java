import java.util.*;
public class HashSet3C {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		HashSet<Integer> number=new HashSet<Integer>();
		System.out.println("kaç tane eleman eklemek istersiniz");
		int say=x.nextInt();
		for(int i=1;i<=say;i++) {
			System.out.println(i+". elemanı ekleyin lütfen");
			int deger=x.nextInt();
			number.add(deger);
		}//for bitiş 
		System.out.println("Oluşan Liste :"+number);
		System.out.println("Liste eleman sayısı:"+number.size());
		//burdaki say değeri kullanıcının for kaç defa çalıştığını belirlemiş oluyor
		System.out.println("Liste eleman sayısı 2. yöntem:"+say);
		
	}

}
