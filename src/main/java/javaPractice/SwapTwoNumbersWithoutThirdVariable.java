package javaPractice;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		
		int a=5;
		int b=10;
		
		a=a+b;//a=5+10=15
		b=a-b;// b=15-10=5
		a=a-b;//a=15-5=10
		
		System.out.println("a is: " +a);
		System.out.println("b is: " +b);
	}

}
