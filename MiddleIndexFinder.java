package package1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * This class finds the index of an array at which left hand side elements
 * gets equal to sum of right hand side elements.
 * 
 * Ex. for Array ar = [1,2,3]
 * 
 *  for this output will be 1 since at index 1 , sum of ar[0] and ar[1]
 *  is equals to ar[2]. 
 */

public class MiddleIndexFinder {
	
	static int index,leftHandSum,rightHandSum;
	
	public static int findMiddleIndex(int[] ar){
		
		for(int i = 0; i < ar.length; i++){
			int x = i;
			if(i == 0 && ArrayElementSum.sumOfArrayElement(ar) - ar[0] == ar[0]){
				index = i; break;
			} else{
				leftHandSum = 0; rightHandSum = 0;
				
				while(i >= 0){
					leftHandSum += ar[i];
					i--;
				}
				
				for(int j = x+1; j < ar.length; j++){
					rightHandSum += ar[j];
				}
				
				if(leftHandSum == rightHandSum){
					index = x; break;
				}														
			}
			i = x;
		}
		return index;
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
			index = MiddleIndexFinder.findMiddleIndex(arr);
		} catch(InputMismatchException nfe){
			System.err.println("Please provide valid number only.");
			nfe.printStackTrace();
		}
		System.out.println("Resultant index at which sum of "
				+ "left elements are equal to sum of right elements is : "+ index);
		sc.close();
	}
}
