package package1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MinAndMaxElementInArray {
	
	/*
	 * This method find max element in array.
	 */
	
	public static int findMaxElement(int[] arr) {
		int big = arr[0];
		for (int i = 0; i < arr.length; i++) {			
			if (big < arr[i]) {
				big = arr[i];
			}
		}
		return big;
	}
	
	/*
	 * This method find min element in array.
	 */
	public static int findMinElement(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {			
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
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
			int maxEle = findMaxElement(arr);
			int minEle = findMinElement(arr);
			
			System.out.println("min element in array is "+ minEle 
					+" and max element in array is "+maxEle);
		} catch(InputMismatchException nfe){
			System.err.println("Please provide valid number only.");
			nfe.printStackTrace();
		}		
		sc.close();

	}

}
