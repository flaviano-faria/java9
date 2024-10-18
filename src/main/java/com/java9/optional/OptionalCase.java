package com.java9.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalCase {
	
	public static void main(String[] args) {
		String name = null;
		Optional<String> optName = Optional.ofNullable(name);
		if(optName.isEmpty()) {
			System.out.println("name is blank");
		} else {
			System.out.println("name is not present");
		}
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(5);
		Optional<List<Integer>> optList = Optional.ofNullable(list);
		
		if(optList.isEmpty()) {
			System.out.println("optList is null");
		} else {
			System.out.println("optList is not null");
		}
		
		list = null;
		
		optList = Optional.ofNullable(list);
		if(optList.isEmpty()) {
			System.out.println("optList is null");
		} else {
			System.out.println("optList is not null");
		}
		
	}

}
