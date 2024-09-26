package com.string.test;

public class HighestOccurring
{
	public static char higestOccurance(String str)
    {
        int[] cc = new int[256]; 
        //System.out.println(str);
        for (int i = 0; i < str.length(); i++)
        {
            cc[str.charAt(i)]++;
        }
        
        
        char highestChar = str.charAt(0);
        int maxCount = cc[str.charAt(0)];
       
        
        for (int i = 1; i < str.length(); i++) 
        {
            if (cc[str.charAt(i)] > maxCount) 
            {
                highestChar = str.charAt(i);
                maxCount = cc[str.charAt(i)];
           
            }
        }
     
        return highestChar;
    }
	
    public static void main(String[] args)
    {
        String str = "aabbbbbbc";
        System.out.println("Output: " + higestOccurance(str));
    }
    
    
}




















































