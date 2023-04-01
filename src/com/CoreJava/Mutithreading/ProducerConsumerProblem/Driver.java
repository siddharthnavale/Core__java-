package com.CoreJava.Mutithreading.ProducerConsumerProblem;

public class Driver {
	
public static void main(String[] args) {
	Quene q=new Quene();
	Consumer c= new Consumer(q);
	Producer p=new Producer(q);
	c.start();
	p.start();
	
}
}
