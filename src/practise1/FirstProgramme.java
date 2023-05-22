package practise1;

public class FirstProgramme {
	
	
	
	//Static method
	public static void Sum()
	{
		
		System.out.println("SUM OF NUMBERS");
		
	}
	//non static method
	public void Sub()
	{
		System.out.println("SUB OF NUMBERS");
	}

	
	
	public static void main(String[]args)
	{ FirstProgramme obj=new FirstProgramme();
	     obj.Sub();
		Sum();
		
		System.out.println("Hello");
	}
	

}
