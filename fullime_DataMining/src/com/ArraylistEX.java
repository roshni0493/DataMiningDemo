package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraylistEX {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("kiran");
		al.add("kiran");
		al.add("kiran1");
		al.add("kiran2");
		al.add("kiran1");
		al.add("kiran1");
		System.out.println(al);
		
		HashSet<String>hs=new HashSet<>(al);
		System.out.println(hs);
		
		for (Iterator<String> iterator = hs.iterator(); iterator.hasNext();) 
		{
			String ele = iterator.next();
			
			List<String> uu=al.stream().distinct().collect(Collectors.toList());
			//Collections.frequency(c, o)
			System.out.println(uu);
		}
	}

}
