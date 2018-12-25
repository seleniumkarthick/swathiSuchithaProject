package com.sample.collections;

import java.util.*;

public class CollectionSample {
	
	public static void main(String[] args) {
		
		
		/*
		 * List
		 * 	- ArrayList
		 * 	- LinkedList
		 * Set
		 * Map
		 */
		
		List x=new ArrayList();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		x.remove(2);
		System.out.println(x);
		
		Iterator itr=x.iterator();
		
		//next - it will go to next element
		//hasNext - it will check the value in the list
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		
		
		List y=new LinkedList();
		y.add(10);
		y.add(20);
		y.add(30);
		y.add(40);
		y.add(10);
		y.add(20);
		y.add(30);
		y.add(40);
		y.remove(2);
		System.out.println(y);
		
		
		Set z=new HashSet();
		z.add(10);
		z.add(20);
		z.add(30);
		z.add(40);
		z.add(10);
		z.add(20);
		z.add(30);
		z.add(40);
		System.out.println(z);
		
		//key value
		Map x1=new HashMap();
		x1.put("test1", 100);
		x1.put("test2", 1020);
		x1.put("test3", 102330);
		x1.put("test4", 144400);
		System.out.println(x1);
		System.out.println(x1.get("test2"));
		
	}

}
