package test;

import java.util.LinkedList;
import java.util.Scanner;

public class Test1C {
	public static void main(String[] args) {
	LinkedList<String> x=new LinkedList<String>();
	Scanner y=new Scanner(System.in);
	
	System.out.println("döngü sayı");
	int z=y.nextInt();
	y.nextLine();
	
	while(z>=0) {
		System.out.println("cümle");
		String g=y.nextLine();
		
		
		x.add(g);
		z--;
	}
System.out.println(x);
System.out.println("silmek istediğin cümle");
String f=y.nextLine();

for(int v=0;v<x.size();v++) {
	
	if(f=="ahmet") {
		x.remove(f);
		System.out.println("silindi");
	}else {
		System.out.println(v+". indexte bulunamadı ");
	}
}
}
}
