package com.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size Of Array:= ");
		int num=sc.nextInt();
		int a[]=new int [num];
		
		System.out.println("Enter The Array Elements:= ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			h.add(a[i]);
		}
		
		int s[]=new int[h.size()];
		int i=0;
		for(int no:h) {
			s[i++]=no;
		}
		System.out.println(Arrays.toString(s));

	}

}
