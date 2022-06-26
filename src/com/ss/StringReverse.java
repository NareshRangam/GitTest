package com.ss;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Naresh";
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1;i >= 0;i--)
		{
			sb.append(str.charAt(i));
		}
		System.out.println(sb);

	}

}
