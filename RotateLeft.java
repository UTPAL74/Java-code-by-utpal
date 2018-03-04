package package1;

import java.util.Arrays;

public class RotateLeft {
	
	public int[] rotateLeft3(int[] nums) {
		  int i = 0, first = nums[0];
		  
		  while(i < nums.length){
		    int next = i + 1;
		    
		    if(next >= nums.length){
		      nums[i] = first;
		      break;
		    }
		    
		    nums[i] = nums[next];
		    i++;
		  }
		  
		  return nums;
		}


	public static void main(String[] args) {
		int[] result = new RotateLeft().rotateLeft3(new int[]{1,2,3});
		System.out.println(Arrays.toString(result));
	}

}
