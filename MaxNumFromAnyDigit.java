package com.ut.code;

import java.util.Arrays;

public class MaxNumFromAnyDigit {

	public static void main(String[] args) {
		getMaxNum(54673823);
	}
	
	static void getMaxNum(int num){
		String s = num + "";
		
		int[] arr = new int[s.length()];
		int i = 0;
		
		while(num > 10 && i < arr.length) {
			int rem = num % 10;			
			arr[i] = rem;	
			i++;
			num = num / 10;
		}
		
		arr[i] = num;
		Arrays.sort(arr);
		
		int largestNum = 0;
		
		for(int k = 1, j = 0; j < arr.length ; j++,k *= 10){
			largestNum += arr[j]*k;
		}
		
		System.out.println(largestNum);
	}
}
