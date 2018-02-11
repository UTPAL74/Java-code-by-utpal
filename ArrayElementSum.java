package package1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * This class finds the sum of element of an array.
 */

public class ArrayElementSum {
	
	static int sum = 0;
	
	public static int sumOfArrayElement(int[] a){
		int sum = a[0] + a[1];
		for(int i = 2; i < a.length; i++){
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of input data :");
		int[] arr;
		try{
			int count = sc.nextInt(), i = 0;			
			arr = new int[count];
			
			while(i < count){
				arr[i] = sc.nextInt();
				i++;
			}
			
			System.out.println("origninal array is "+Arrays.toString(arr));
			sum = ArrayElementSum.sumOfArrayElement(arr);
		} catch(InputMismatchException nfe){
			System.err.println("Please provide valid number only.");
			nfe.printStackTrace();
		}
		System.out.println("Sum of element of the array is : "+sum);
		sc.close();
	}

}
