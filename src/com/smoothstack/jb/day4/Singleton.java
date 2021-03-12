package com.smoothstack.jb.day4;

public class Singleton {
	volatile static public Singleton instance = null;
	
	private Singleton() {
	}
	
	/**
	 * Checks if the Singleton instance has already been created so
	 * there would be no need to get inside the synchronized block.
	 * Second check is needed in case 1 or more threads are waiting
	 * on the synchronized block on the occasion when the instance
	 * is still being created.
	 * @return Singleton instance
	 */
	static public Singleton getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null ) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
