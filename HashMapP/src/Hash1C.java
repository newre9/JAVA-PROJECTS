import java.util.HashMap;
public class Hash1C {

	public static void main(String[] args) {
		HashMap<String,String> sehir=new HashMap<String,String>();
		
		sehir.put("İstanbul","Avcılar");
		sehir.put("Karabük","Safranbolu");
		sehir.put("Şırnak", "Cizre");
		
		System.out.println(sehir.get("İstanbul"));
		System.out.println(sehir.get("Şırnak"));
		System.out.println(sehir);
		
		sehir.remove("İstanbul");
		System.out.println(sehir);
		System.out.println("Liste Data durumu:"+sehir.size());
		sehir.clear();
		System.out.println(sehir);
	}

}
