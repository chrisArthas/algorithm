package sington;

/**
 * 静态内部类实现
 * @author chris
 *
 * 当第一次引用getInstance()方法的时候，
 * 访问静态内部类中的静态成员变量，此时该内部类需要调用static代码块(因为首次访问该类)。
 * 而后再次访问getInstance()方法会直接返回instance引用。
 * 
 * 线程安全由jvm控制
 */
public class SingtonTwo {
	
	private SingtonTwo instance;
	
	
	private SingtonTwo()
	{
		
	}
	
	public static SingtonTwo getInstance()
	{
		return Nest.instance;
	}
	
	
	private static class Nest
	{
		private static SingtonTwo instance;
		static
		{
			instance = new SingtonTwo();
		}
	}

}
