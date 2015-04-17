package com.leo.dp.observer;

import java.util.Vector;

public abstract class Subject {

	private Vector<Observer> obs = new Vector<Observer>();

	public void addObserver(Observer ob) {
		this.obs.add(ob);
	}

	public void removeObserver(Observer ob) {
		this.obs.remove(ob);
	}

	public void notifyObservers() {
		for (Observer ob : obs) {
			ob.update();
		}
	}

	public abstract void change();

}
