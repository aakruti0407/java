package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101,"AAkruti");
		hm.put(109,"Malvika");
		hm.put(123,"Riddhi");
		hm.put(145,"Mahek");
		hm.put(179,"Shivani");
		hm.put(178,"Nayana");
		
		System.out.println(hm);
		System.out.println(hm.get(123));
		//System.out.println(hm.get(Mahek));
		System.out.println(hm.isEmpty());
		System.out.println(hm.entrySet());
		
		
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		

	}

}
