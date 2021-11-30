package org.prac;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {
	public static void main(String[] args) {
		
		Set a = new HashSet();
		a.add(70);
		a.add("Sgr");
		a.add(true);
		a.add(80);
		a.add(123.321);
		a.add(null);
		a.add(70);
		
		Set b = new HashSet();
		b.add(50);
		b.add("Ram");
		b.add(false);
		b.add(80);
		b.add(123.321);
		b.add(null);
		
		//a.removeAll(b);
		//System.out.println(a);
		
		a.retainAll(b);
		System.out.println(a);
		
		for (Object x : b) {
			System.out.println(x);
			
		}
		
}
}
