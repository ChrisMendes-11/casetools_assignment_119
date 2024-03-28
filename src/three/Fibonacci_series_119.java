package three;
import java.lang.*;
public class Fibonacci_series_119 {
int num;
	
	Fibonacci_series_119(int num)
	{
		this.num=num;
	}
	
	String print_series() {
		StringBuilder values = new StringBuilder(""); 
		int f1=0,f2=1,f3=0;
		values.append(Integer.toString(f1)+" "+Integer.toString(f2));
		for(int i=3;i<=num;i++)
		{
			f3=f1+f2;
			values.append(" "+Integer.toString(f3));
			f1=f2;
			f2=f3;
		}
		return values.toString();
		
	}
}


