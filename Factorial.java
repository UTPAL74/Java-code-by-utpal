class Factorial 
{

	public static void main(String[] args) 
	{
		System.out.println(new Factorial().factorialByRecusion(Integer.parseInt(args[0])));
		System.out.println(new Factorial().factorialWithoutRecusion(Integer.parseInt(args[0])));
	}

	public int factorialByRecusion(int num) {

		if (num == 0)
			return 1;

		if (num < 0) {
			System.out.println("Only enter only positive integer"); System.exit(0);
		}
		
		return num * factorial(num - 1);
	}

	public int factorialWithoutRecusion(int num) {
		if (num == 0)
			return 1;

		if (num < 0) {
			System.out.println("Only enter only positive integer"); System.exit(0);
		}

		int fact = 1;
		
//      use one variable.		
		while(num >= 1) {
			fact *= num;
			num -= 1;
		}
		
//		Use two variable.
		int i = 1;
		while(i <= num) {
			fact *= i;
			i++;
		}

		return fact;
	}
}
