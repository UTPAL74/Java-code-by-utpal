package package1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author ukumar
 * 
 * This class finds the duplicate numbers in an integer type array.
 *
 */

public class DuplicateFinder {
	
	public static void findDuplicate(int[] a){
		String dup = "";
		l1:for(int i = 0; i < a.length; i++){
			for(int j = i+1; j < a.length; j++){
				if(a[i] == a[j]){
					if(dup.contains(""+a[i]))
						continue l1;
					dup = ""+a[i];
					System.out.print(" "+a[i]);
					break;
				}					
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of input data :");
		int[] arr;
		try{
			int count = sc.nextInt();			
			arr = new int[count];
			
			while(count > 0){
				arr[count-1] = sc.nextInt();
				count--;
			}
			
			System.out.println("origninal array is "+Arrays.toString(arr));
			DuplicateFinder.findDuplicate(arr);
		} catch(InputMismatchException nfe){
			System.err.println("Please provide valid number only.");
			nfe.printStackTrace();
		}		
		sc.close();
	}

}
