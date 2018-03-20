package package1;

public class Fabonacci {
	
	/*
	 * Fabonacci series is nothing but sum of first two number is third number.
	 * 
	 * Ex :
	 * 0 1 1 2 3 5 8 13 21 34 55 89 144...
	 *  
	 */
	public void fabonacci(){
		int first = 0, second = 1;
		int sum = 0;
		
		System.out.print(first + " " + second);
		
		for(int i = 2; i < 20; i++){
			sum = first + second;
			first = second;
			second = sum;
			System.out.print(" "+sum);
		}
	}
	
	public void fabonacciOne(){
		int first = 0, second = 1, sum = 0;
		
		for(int i = 0; i < 20; i++){
			System.out.print(first + " ");
			sum = first + second;
			first = second;
			second = sum;
		}
	}
	
	public void fabonacciWhile(){
		int first = 0, second = 1, sum = 0, i = 0;
		
		while (i < 20){
			System.out.print(first + " ");
			sum = first + second;
			first = second;
			second = sum;
			i++;
		}
	}

	public static void main(String[] args) {		
		new Fabonacci().fabonacci(); System.out.println();
		new Fabonacci().fabonacciOne();System.out.println();
		new Fabonacci().fabonacciWhile();
	}

}
