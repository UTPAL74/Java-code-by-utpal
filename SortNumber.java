package package1;

import java.util.Arrays;

public class SortNumber {
	
	public static int[] sort(int[] arr){
		int temp = 0, length = arr.length; 
		
		while (length >= 0){			
			for(int i = 0; i < arr.length-1; i++){
				temp = arr[i];
				if(arr[i] > arr[i+1]){
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}			
			}
			
			length -= 1;			
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int[] sortedArray = SortNumber.sort(new int[]{9,3,5,6,4,2,1});
		System.out.println(Arrays.toString(sortedArray));
	}

}
