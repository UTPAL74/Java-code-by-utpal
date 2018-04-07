package package1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FindNthBiggerElementInArray {
	
	/*
	 * Finds nth largest number in an array.
	 * 
	 * Ex- [9,8,1,3,6,2], find 2nd largest no.
	 * 
	 * ans is 8.
	 */

	public static int nthBiggerElement(int[] arr, int ele) {
		int nthMax = 0;
		
		for(int i = 0 ; i < arr.length; i++) {
			int counter = 0;
			for(int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					counter++;
					nthMax = arr[i];
				}
			}
			
			if (counter == arr.length-ele) {
				break;
			}
		}		
		
		return nthMax;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element of the array :");
		int[] arr;
		try{
			int count = sc.nextInt(), i = 0;			
			arr = new int[count];
			
			while(count > 0){
				arr[i] = sc.nextInt();
				count--; i++;
			}
			
			System.out.println("origninal array is "+Arrays.toString(arr));
			System.out.println("Enter nth bigger element you want to find : ");
			int ele = sc.nextInt();
			int result = FindNthBiggerElementInArray.nthBiggerElement(arr, ele);			
			System.out.println(ele + giveNumberSuffix(ele)+" largest element in an array is "+result);
		} catch(InputMismatchException nfe){
			System.err.println("Please provide valid number only.");
			nfe.printStackTrace();
		}		
		sc.close();
	}

	private static String giveNumberSuffix(int e) {
		String namespace = "";
		String r = e + "";
		if (r.endsWith("1"))
			namespace = "st";
		else if (r.endsWith("2"))
			namespace = "nd";
		else if (r.endsWith("3"))
			namespace = "rd";
		else
			namespace = "th";
		return namespace;
	}

}
