package labda.thread;

public class SingleMember extends Thread
{
	public static int number = 0;
	public SingleMember(String str)
	{ 
		super(str); 
	}
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{ 
			try 
			{
				sleep((int)(Math.random() * 2000));
			} 
				catch (InterruptedException e) {}
		}
		number++;
		System.out.println(number+") " +
		getName());
		
	}
}
