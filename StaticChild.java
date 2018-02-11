package package1;

class StaticParent{
	
	static int i = 9;
	int j = 10;
	static{
		System.out.println("Static block in parent");
	}
	{
		System.out.println("Instance block in parent");
	}
	public StaticParent() {
		System.out.println("This is Parent constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("This is Parent Main");
		new StaticParent();
	}
	
}

public class StaticChild extends StaticParent{

	static int i = 9;
	int j = 10;
	static{
		System.out.println("Static block in child");
	}
	{
		System.out.println("Instance block in child");
	}
	public StaticChild() {
		System.out.println("This is child constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("This is child main");
		new StaticChild();
	}	
}
