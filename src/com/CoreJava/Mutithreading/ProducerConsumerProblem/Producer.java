package com.CoreJava.Mutithreading.ProducerConsumerProblem;

public class Producer extends Thread {

	Quene a;

	public Producer(Quene a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		int i = 1;
		for(;;){
			a.store(i++);
			}
	}
	
	

}
