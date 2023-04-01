package com.CoreJava.Mutithreading.ProducerConsumerProblem;

public class Consumer extends Thread{
	
	Quene a;

	public Consumer(Quene a) {
		this.a = a;
	}
	
	@Override
	public void run() {

		for(;;){
			a.retrive();
			}
	}
}
