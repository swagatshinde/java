// by extending Thread
public class MultithradingDemo extends Thread 
{
	public void run()
	{
		System.out.println("My thread is running thread");
	}
	public static void main(String[] args) 
	{
		MultithradingDemo obj=new MultithradingDemo();
		obj.start();
	}
}
