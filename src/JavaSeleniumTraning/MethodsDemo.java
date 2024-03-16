package JavaSeleniumTraning;


public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// how to create method and how to access the methods from the class
		
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getuserData();		
		getData2();
		
		// how to call another class methods
		// can change access modifiers by keeping private and public 
		
	}
	 //why method
 	public String getData()
	{
		System.out.println("hello world");
		// return anything
		return "rahul shetty";
	}
	
	public static String getData2()
	{
		System.out.println("hello world");
		return "rahul shetty";
	}
		
}
	
	
	


