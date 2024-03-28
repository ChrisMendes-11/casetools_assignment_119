
package four;

public class CountDigits_119 {
	int num;
	CountDigits_119(int num)
	{
		this.num=num;
	}
	
	int count()
	{
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	
	
	
}
