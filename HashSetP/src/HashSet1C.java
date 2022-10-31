import java.util.*;

public class HashSet1C {

	public static void main(String[] args) {
		HashSet<String> name=new HashSet<String>();
		name.add("Uğur");
		name.add("Ayşe");
		name.add("Mehmet");
		name.add("Azra");
		//Hashset her öğenin benzersiz olduğunu gösteren bir öğeler topluluğudur .
		name.add("Ayşe");
		System.out.println(name);
		System.out.println(name.contains("Uğur"));
		System.out.println(name.contains("Fatma"));
		System.out.println("liste son hali:"+name);
		name.remove("Azra");
		System.out.println("liste yeni hali :"+name);
		System.out.println("liste size:"+name.size());
		name.clear();
		System.out.println(name);
	}

}
