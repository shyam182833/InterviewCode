package interviewProgram;

import java.util.ArrayList;
//Java program to print prime numbers in a given range
public class PrimeNosInaGivenRange
{

	public static void primeNumberList(int start, int end)
	{
		try
		{

		ArrayList<Integer> l=new ArrayList<Integer>();
		int count;

		if(start<0 || end<0)
		{
			System.out.println("Provided inputs for starting or ending number is less than Zero (0). Kindly provide positive Integer numbers");
			 System.out.println("*************************************");
		}
		//loop for finding and printing all prime numbers between given range
		else
		{
		for(int i = start ; i <= end ; i++)
		{
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}
		}
	}
	
	catch(Exception ex)
	{
		System.out.println("Invalid data has been provided for either start or end numbers");
	}
	}
}