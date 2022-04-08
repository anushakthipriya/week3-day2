package week3.day2_Assignments;

import java.util.Arrays;

public class Assignment2 
{

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";

		text1.toLowerCase();
		text2.toLowerCase();
		
		if(text1.length() == text2.length())
		{
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result = Arrays.equals(charArray1, charArray2);

		      if(result) {
		        System.out.println(text1 + " and " + text2 + " are anagram.");
		      }
		      else {
		        System.out.println(text1 + " and " + text2 + " are not anagram.");
		      }
		    }
		    else {
		      System.out.println(text1 + " and " + text2 + " are not anagram.");
		    }
			
		}
			
	}


