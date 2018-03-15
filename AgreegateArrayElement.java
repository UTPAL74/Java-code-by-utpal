package package1;

import java.util.Arrays;

public class AgreegateArrayElement {
	
	/*
	 * Combine two array elements of any length and return a new array.
	 */
	
	public int[] plusTwo(int[] a, int[] b) {
		  int[] result = new int[a.length + b.length];
		  
		  if (a.length == 0)
			  return b;
		  
		  if (b.length == 0)
			  return a;
		  
		  if (a.length != 0 && b.length != 0) {
		    int i = 0;
		    
		    while(i < a.length){
		      result[i] = a[i];
		      i++;
		    }
		    
		    for(int j = 0;j < b.length; i++,j++) {
		      result[i] = b[j];
		    }
		  }
		  
		  return result;
		}


	public static void main(String[] args) {
		int[] result = new AgreegateArrayElement().
				plusTwo(new int[]{}, new int[]{});
		System.out.println(Arrays.toString(result));
	}

}
