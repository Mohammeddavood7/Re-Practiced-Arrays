package com.string.test;

public class Test
{
	public static void main(String[] args)
	{
		String str = "jaazAzaavvaba";
		char[] c = str.toCharArray();
		
		for(int i = 0 ; i < str.length(); i++)
		{
			for(int j = i+1 ; j < str.length(); j++)
			{
				if(c[i]== c[j])
				{
					c[i] = 'x';
					
					
				}
			}
		}
		
		for(char c1: c)
		{
		  System.out.print(c1);
	    }
		
	}

	
}



















