package com.string.test;


public class FirstNonRepeatedCharacter 
{
    
    public static char nonRepeated(String input)
    {
        input = input.toLowerCase();
        int[] cc = new int[256]; 
        
        for (int i = 0; i < input.length(); i++)
        {
            cc[input.charAt(i)]++;
        }
        
        for (int i = 0; i < input.length(); i++)
        {
            if (cc[input.charAt(i)] == 1)
            {
                return input.charAt(i);
            }
        }
        
        return ' ';
    }
   
    public static void main(String[] args) 
    {
        String example1 = "Naresh it";
        char result = nonRepeated(example1);
        System.out.println("non-repeated in :"+ result  );
    }
}


















