package sington;


/**
 * Double check й╣ож
 * @author Chris
 *
 */
public class SingtonOne {
	
	private static SingtonOne instance = null;
	
	
	private SingtonOne()
	{
		
	}
	
	
	public static SingtonOne getInstance()
	{
		if(instance == null)
		{
			synchronized (SingtonOne.class) {
				if(instance == null)
				{
					instance = new SingtonOne();
				}
			}
		}
		return instance;
	}
	
	

}
