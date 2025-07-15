package com.collection;

import java.util.HashSet;

public class HashSetdemo {
	public static void main(String[] args) {
		HashSet hs=new HashSet();

		hs.add(10);
		hs.add(10.10);
		hs.add("tops");
		hs.add('t');
		hs.add(null);
		hs.add(true);
		hs.add(10);
		
		System.out.println(hs);
		}

}
