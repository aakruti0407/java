package com.collection;

import java.util.Stack;

public class Stackdemo {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(10.10);
		s.push("tops");
		s.push('t');
		s.push(null);
		s.push(true);
		s.push(10);
		
		
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
		
		
	}

}
