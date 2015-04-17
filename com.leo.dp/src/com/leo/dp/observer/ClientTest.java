package com.leo.dp.observer;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new ConcreteSubject();
		subject.addObserver(new ConcreteObserver1());
		subject.addObserver(new ConcreteObserver2());
		subject.change();
	}

}
