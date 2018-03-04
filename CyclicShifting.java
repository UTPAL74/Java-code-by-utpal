package package1;

public class CyclicShifting {
	
	public static String cyclicLeftShift(String s, int k){
	    k = k % s.length();
	    System.out.println("k = "+k);
	    return s.substring(k) + s.substring(0, k);
	}

	public static void main(String[] args) {
		String test = "Hello World";
		System.out.println(cyclicLeftShift(test, 12));
	    for(int i = 0; i < test.length(); i++)
	        System.out.println(cyclicLeftShift(test, i));
	}

}
