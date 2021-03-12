package com.smoothstack.jb.day4;

public class Singleton {
	volatile public static Singleton instance = null;
	
	private Singleton(int i) {
		
	}

	/**
	 * Checks if the Singleton instance has already been created so
	 * there would be no need to get inside the synchronized block.
	 * Second check is needed in case 1 or more threads are waiting
	 * on the synchronized block on the occasion when the instance
	 * is still being created.
	 * 
	 * Made the singleton class synchronized on that code as you get
	 * a null pointer error when synchronizing the instance
	 * @return Singleton instance
	 */
	static public Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null ) {
					instance = new Singleton(1);
				}
			}
		}
		return instance;
	}

}
