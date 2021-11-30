package org.prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Practice3 {
	public static void main(String[] args) {
		Set<Integer> a = new TreeSet();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(90);
		System.out.println(a);
		
		int size = a.size();
		System.out.println(size);
		a.remove(50);
		System.out.println(a);
		boolean contains = a.contains(70);
		System.out.println(contains);
		for (Integer x : a) {
			System.out.println(x);
		}
		List<Integer> b = new ArrayList();
		System.out.println(b);
		b.addAll(a);
	System.out.println(b);
	b.add(45);
	System.out.println(b);
	//b.removeAll(a);
	//System.out.println(b);
	b.retainAll(a);
	System.out.println(b);
		
		
	}
}
