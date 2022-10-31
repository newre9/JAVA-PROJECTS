import java.util.*;
public class HashSet2C {

	public static void main(String[] args) {
		HashSet<Integer> number=new HashSet<Integer>();
		number.add(85);
		number.add(74);
		number.add(56);
		number.add(35);
		number.add(74);
		
		HashSet cl=new HashSet();
		System.out.println("ilk cl değişken:"+cl);
		cl=(HashSet)number.clone();
		System.out.println("cl son değerleri:"+cl);
		
		
	}

}
