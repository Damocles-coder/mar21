/**
 * 
 */
package com.smoothstack.jb.day4;

/**
 * @author dyltr
 * creates a deadlock on two threads both requiring the same
 * volatile characters (wrapper classes)
 */
public class Deadlock {
	volatile Character r1 = 'H';
	volatile Character r2 = 'W';

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deadlock d = new Deadlock();

		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					synchronized (d.r1) {
						Thread.sleep(100);
						synchronized (d.r2){
							d.r1 = ' ';
							d.r2 = '!';
							System.out.println(d.r1+d.r2);
						}
					}
				}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		
		Runnable t2 = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					synchronized (d.r2) {
						Thread.sleep(100);
						synchronized (d.r1){
							d.r1 = 'G';
							d.r2 = '?';
							System.out.println(d.r1+d.r2);
						}
					}
				}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
		System.out.println("Printing two messages.");
	}

}
