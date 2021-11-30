package org.prac;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Practice {
	public static void main(String[] args) {
		
	Set a = new HashSet();
	a.add(70);
	a.add("Sgr");
	a.add(true);
	a.add(80);
	a.add(123.321);
	a.add(null);
	a.add(70);
	
	System.out.println(a);
	
	int size = a.size();
	System.out.println(size);
	
	Set b = new LinkedHashSet();
	b.addAll(a);
	System.out.println(b);

	System.out.println("perf to master");

	System.out.println("Dev to master");

}
}
