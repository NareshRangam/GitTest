package com.ss;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "User1");
		map.put(21, "User2");
		map.put(3, "User3");
		
		Set<Integer> collect = map.entrySet().stream().filter(obj -> obj.getKey()>2).map(Map.Entry::getKey).collect(Collectors.toSet());
		 //map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		 map.entrySet().stream().forEach(System.out::println);
		
System.out.println(collect);
	}

}
