package mypack;

public class Start
{
	public void print()
	{
		System.out.println("This is print() in Start");
	}

	public static void main(String args[])
	{
		System.out.println("This is main() of Start");
		
		Start first= new Start();
		first.print();
	}

}