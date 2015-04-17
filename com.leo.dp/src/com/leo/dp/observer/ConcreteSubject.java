package com.leo.dp.observer;

public class ConcreteSubject extends Subject {

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("被观察者状态改变");
		this.notifyObservers();
	}

}
