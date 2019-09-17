
public class RecursiveMathLib extends MathLib
{
	//GCD Method
	@Override
	public int GCD(int x,int y)
	{
		if(y==0)
		{
			return x;
		}
		if(x >= y && x != 0)
		{
			return GCD(y,x % y);
		}
		return 0;
		
	}
	
	//Ack method
	@Override
	public int Ack(int x, int y)
	{
		if(x == 0)
		{
			return y+1;
		}
		if(y == 0)
		{
			return Ack(x-1, 1);
		}
		if(x != 0 && y != 0)
		{
			return Ack(x-1, Ack(x, y-1));
		}
		return 0;
			
	}
	
	//Fib Method
	@Override
	public int Fib(int x)
	{
		if(x==0)
		{
			return 0;
		}
		if(x==1)
		{
			return 1;
		}
		if(x>1)
		{
			return Fib(x-1)+Fib(x-2);
		}
		return 0;
	}
	
	//hanoi method
	@Override
	public int hanoi(int n)
	{
		if(n==1)
		{
			return 1;
		}
		if (n>1)
		{
			return 2*hanoi(n-1)+1;
		}
		return 0;
	}

}

