package com.ss;

import java.util.Arrays;
import java.util.List;

public class TestingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listArray = Arrays.asList(1,4,6,3,7,23,56,34,2,4);
		Integer reduce = listArray.stream().map(i ->i *i).filter(i -> i % 2==0).reduce(0,Integer::sum);
		System.out.println(reduce);
		


	}

}
