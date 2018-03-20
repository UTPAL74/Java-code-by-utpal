package package1;

public class LambdaExpression {

	public static void main(String[] args) {
		LambdaExpression lbd=new LambdaExpression();
		
		MathOperation addition = (int a, int b) -> (a+b);
		
		MathOperation subtraction = (a, b) -> (a-b);
		
		MathOperation multiplication = (a, b) -> {return (a*b);};
		
		System.out.println("5 + 5 : "+lbd.operate(5, 5, addition));
		System.out.println("5 - 5 : "+lbd.operate(5, 5, subtraction));
		System.out.println("5 * 5 : "+lbd.operate(5, 5, multiplication));
		
		GreetingService grserv1 = message ->
		System.out.println("hello "+message);
		
		grserv1.sayMessage("Utpal");

	}
	
	private int operate(int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a, b);
	}

}

interface MathOperation {
	int operation(int a, int b);
}
	
interface GreetingService {
	void sayMessage(String message);
}
