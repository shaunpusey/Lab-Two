
public class IterationMathLib extends MathLib
{

	@Override
	public int GCD(int x, int y) 
	{
		int n = x, num= y;
		while(n>0)
		{
			num *=n;
			n--;
		}
		
		return num;
	}

	@Override
	public  int Ack(int x, int y) {
		int n = x, num= y;
		while(n>0)
		{
			num *=n;
			n--;
		}
		
		return num;
	}

	@Override
	public int Fib(int x) 
	{
		int num = x;
		while(num>0)
		{
			
			num--;
		}
		
		return num;
	}

	@Override
	public int hanoi(int n) 
	{
		int num = n;
		while(num>0)
		{
			
			num--;
		}
		
		return num;
	}

}
