package sington;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingtonTwo instance = SingtonTwo.getInstance();
		
		System.out.println(instance == null?"true":"false");
	}

}
