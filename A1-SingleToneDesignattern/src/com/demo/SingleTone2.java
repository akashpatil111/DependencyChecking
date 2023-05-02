package com.demo;

public class SingleTone2 implements Cloneable{
	
	private static SingleTone2 n=new SingleTone2();
	
	private SingleTone2() {
		
	}
	
	public static SingleTone2 getSingle() {
		if(n==null) {
			new SingleTone2();
		}
		else {
			return n;
		}
		return n;
	}
	
	protected Object clone() {
		return n;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		SingleTone2  s=SingleTone2.getSingle();
		System.out.println(s.hashCode());
		
		SingleTone2  s1=SingleTone2.getSingle();
		System.out.println(s1.hashCode());
		
		SingleTone2 a1=(SingleTone2) s.clone();
		System.out.println(a1.hashCode());
		
		SingleTone2 a2=(SingleTone2) s.clone();
		System.out.println(a2.hashCode());
		
		
		
		

	}

}
