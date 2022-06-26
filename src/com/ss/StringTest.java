package com.ss;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "aasjjikkk";
		String input="Welcome to Java Session Session Session";
		 Character key = string.chars()  // creates an IntStream
		    .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
		    .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
		    .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
		System.out.println(key);
		
		String[] arr = input.split(" ");
		List<String> listString = Arrays.asList(arr);
		System.out.println(listString);
	 String max = listString.stream().collect(Collectors.groupingBy(s -> s,Collectors.counting()))
	 .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
	 
	 
	 listString.stream().collect(Collectors.groupingBy(s ->s,Collectors.counting())).entrySet().stream()
	 .max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
	 string.chars().mapToObj(c->c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
				
	 System.out.println(max);
	
		
		
	}

}
