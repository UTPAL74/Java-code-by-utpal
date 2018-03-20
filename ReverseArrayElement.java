package package1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayElement {
	
	/*
	 * Reverse the array element. 
	 */
	
	public static int[] reverseArray(int[] nums) {
		  int len = nums.length;
		  int i = 0;
		  int[] revArr = nums.clone();
		  
		  while(i < nums.length){
		    nums[i] = revArr[len-1];
		    len--;
		    i++;
		  }
		  return nums;
		}

	public static void main(String[] args) {
		//using arrays
		int[] result = ReverseArrayElement.reverseArray(new int[]{4,1,8,2,9,2,3,4,5,6});
		System.out.println(Arrays.toString(result));
		
		//Using list
//		List<Integer> list = Arrays.asList(4,1,8,2,9,2,3,4,5,6);
//		Collections.reverse(list);
//		System.out.println(list);
	}

}
