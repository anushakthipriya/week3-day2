package week3.day2_Assignments;

public class MultipleLanguage implements TestTool,Language
{
	void python() 
	{
		System.out.println("Implemented Method");
	}
	void Ruby() {
	}
	
	public static void main(String[] args) 
	{
		MultipleLanguage mul =new MultipleLanguage();
		mul.python();
		mul.Selenium();
		mul.Java();
		
	}
	public void Java() 
	{
		System.out.println("Language : Java Abstract Class");
		
	}

	public void Selenium() 
	{
		System.out.println("Testtool : Selenium WebDriver");
		
	}

}
