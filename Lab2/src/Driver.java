
public class Driver {

	public static void main(String[] args) 
	{
		
		IterationMathLib iterationLibrary = 
				new IterationMathLib();
		RecursiveMathLib recursionLibrary = 
				new RecursiveMathLib();
		System.out.println("---- Recursion -----");
		runTestCode(recursionLibrary);
		System.out.println("---- Iteration -----");
		runTestCode(iterationLibrary);

	}
	
	public static void runTestCode(MathLib library) 
	{
		System.out.println("GCD (4,2) = "+library.GCD(4, 2));
		System.out.println("Ack (4,0) = "+library.Ack(4,0));
		System.out.println("Fib (8) = "+library.Fib(8));
		System.out.println("hanoi (8) = "+library.hanoi(8));
	}
		
	}


