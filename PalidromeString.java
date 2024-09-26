package com.string.test;

public class PalidromeString
{
	public static void main(String[] args)
	{
		String str = "madamm";
		boolean isPalidrome = true;
		for(int i = 0 ; i < str.length(); i++)
        {
        	if(str.charAt(i) != str.charAt(str.length() - 1 - i))
        	{
        		isPalidrome = false;
        	}
        }
		
		
		if(isPalidrome)
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");
		}
	}

}
