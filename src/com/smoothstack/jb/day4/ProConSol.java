/**
 * 
 */
package com.smoothstack.jb.day4;

/**
 * @author dyltr
 * Producer Consumer Solution on an integer array
 */
public class ProConSol {
	int capacity;
	volatile int[] dataBuffer;
	int index;

	/**
	 * Created two threads that produce and consumes at different paces.
	 * Had the consumer thread start first to show that it waits for the
	 * producer thread to produce the resources.
	 * @param args not utilized
	 */
	public static void main(String[] args) {
		ProConSol m = new ProConSol();
		m.capacity = 10;
		m.index = 0;
		m.dataBuffer = new int[10];
		Runnable producer = new Runnable() {

			//replaces 0s in data buffer with random numbers
			@Override
			public void run() {
				try {
					for (int i=0;i<50;i++) {
						synchronized(m.dataBuffer) {
							if(m.capacity==m.index) {
								m.dataBuffer.wait();
							}
							m.dataBuffer[m.index++] = m.produce();
							m.dataBuffer.notify();
						}
						Thread.sleep(10);
					}
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		};
		
		//removes number from data buffer and replace with 0
		Runnable consumer = new Runnable() {

			@Override
			public void run() {
				for (int i=0;i<50;i++) {
					try {
						synchronized(m.dataBuffer) {
							if(m.index==0) {
								m.dataBuffer.wait();
							}
							m.consume(m.dataBuffer[--m.index]);
							m.dataBuffer[m.index] = 0;
							m.dataBuffer.notify();
						}
						Thread.sleep(50);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		};
		
		new Thread(consumer).start();
		new Thread(producer).start();
	}
	
	//generates numbers from 1-100
	public int produce() {
		int x = (char) (Math.random()*100+1);
		System.out.println("Producing resource:" + x);
		return x;
	}
	
	//prints out number
	public void consume(int x) {
		System.out.println("Consuming resource: " + x);
	}

}
