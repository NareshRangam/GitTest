package com.ss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {1, 2,3,4,5,6,7,8,9,10};
		List<Integer> list = Arrays.asList(arr);
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

}
