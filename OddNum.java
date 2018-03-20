package package1;

import java.util.ArrayList;
import java.util.Arrays;

public class OddNum {
	
	/*
	 * Returns odd number between the given range(inclusive).
	 */
	
	static int[] oddNumbers(int l, int r) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        while(l <= r){        	
        	if(l % 2 != 0)
        		ar.add(l);        	
        	l += 1;
        }
        
        int[] intarr = new int[ar.size()];
        
        for(int i = 0; i < intarr.length; i++){
        	intarr[i] = ar.get(i);
        }
        
        return intarr;
    }

	public static void main(String[] args) {
		int[] ar = OddNum.oddNumbers(9, 50);
		System.out.println(Arrays.toString(ar));
	}

}
