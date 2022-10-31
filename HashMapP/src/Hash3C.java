import java.util.HashMap;
public class Hash3C {

	public static void main(String[] args) {
		HashMap<String,Integer>	 name=new HashMap<String,Integer>();
		name.put("Fatma",32);
		name.put("Yusuf",56);
		name.put("Hacer",25);
		System.out.println(name);
		for(String k:name.keySet()) {
			System.out.println(k);
		}
		System.out.println("*****************");
		
		for(int i:name.values()) {
			System.out.println(i);
			
		}
		System.out.println("******************");
		for(String f:name.keySet()) {
			System.out.println("key:"+f+" "+"value:"+name.get(f));
		}
		System.out.println("************************");
		for(int d:name.values()) {
			System.out.println("key:"+d+" "+"value:"+name.get(d));
		}
		
		System.out.println(name);
		name.put("Hacer",29 );
		System.out.println(name);
	}

}
