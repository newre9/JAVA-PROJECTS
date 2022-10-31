import java.util.LinkedList;
public class App1C {

	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<String>();
		LinkedList<String> x=new LinkedList<String>();
		name.add("Mehmet");
		name.add("Asya");
		name.add("AZRA");
		name.add("Metin");
		name.add("Ahmet");
		name.addFirst("Fatma");
		name.addLast("Civan");
		name.add(3,"Mina");
		x.add("merhaba");
		x.add("Hello");
		name.addAll(2,x);
		System.out.println(name);
		name.remove("Civan");
		name.remove(2);
		System.out.println(name);
		name.removeLast();
		System.out.println(name);
		name.removeFirst();
		System.out.println(name);
		name.removeAll(x);
		System.out.println(name);
		System.out.println(name.get(3));
		System.out.println(name.getFirst());
		System.out.println(name.getLast());
	}

}
