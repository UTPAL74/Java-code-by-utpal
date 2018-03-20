package package1;

public class BinaryConverter {
	
	/*
	 * Convert any decimal number to binary number.
	 * 
	 * Ex : for decimal 13
	 * 
	 * output is 1101
	 */
	
	public static String convertBinary(int num){
		String binaryResult = "";
		
		while(num/2 != 0 || num/2 != 1){
			int rem = num % 2;
			binaryResult += Integer.valueOf(rem).toString();
			num = num / 2;
			if (num <= 0) break;
		}
			
		return new StringBuffer(binaryResult).reverse().toString();		
	}

	public static void main(String[] args) {
		String output = BinaryConverter.convertBinary(13);
		System.out.println(output);
	}

}
