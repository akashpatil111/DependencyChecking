package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumNumber {

	public static void main(String[] args) {
		List<Integer> i = Arrays.asList(10, 20, 50, 100);

		Optional<Integer> o = i.stream().max(Integer::compare);
		System.out.println("Maximum Number is:= " + o);

	}

}
