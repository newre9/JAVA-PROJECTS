import java.util.HashMap;
public class Hash2C {

	public static void main(String[] args) {
		HashMap<String,String> sehir=new HashMap<String,String>();
		
		sehir.put("Ankara","Polatlı");
		sehir.put("İstanbul","Esenyurt");
		sehir.put("Batman", "Hasankeyf");
		
		for(String i:sehir.keySet()) {
			System.out.println(i);
		}
		System.out.println("*****************");
		for(String k:sehir.values()) {
			System.out.println(k);
		}
		
		System.out.println("*************************");
		for(String g:sehir.keySet()) {
			System.out.println("Key:"+g+"value:"+sehir.get(g));
		}
		
		

	}

}
