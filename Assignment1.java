package week3.day2_Assignments;

public class Assignment1 {
	public static void main(String[] args) 
	{
			String name = "Madam";
			String reverse = "";
			for (int i = name.length() - 1; i >= 0; i--) {
				reverse = reverse + name.charAt(i);
			}
			if (name.equalsIgnoreCase(reverse)) 
			{
				System.out.println(name.toUpperCase() + " is a Palindrome");
			}
			else 
			{
				System.out.println(name.toUpperCase() + " is not a Palindrome");
	}
}
}