package day1016;
//make object only one time
public class Singleton {
	//what is the singleton pattern (kind of the design pattern)
	private Singleton() {
		
	}
	//Case 3: best one
	private static Singleton sInstance = new Singleton();
	//no need to make a constructor which has parameter
	
	public static Singleton getInstance() {
		/* Case 1: not safe in multi-thread circumstance
		if (sInstance == null) {
			sInstance = new Singleton();
		} 
		//but non-safe thread
		//not atomic ---> do synchronize
		*/
		/* Case 2: do synchronize
		if (sInstance == null) {
			synchronized(sInstance) {
				if (sInstance == null) {
					sInstance = new Singleton();
				}
			}
		}
		*/
		return sInstance;
	
	}

}
