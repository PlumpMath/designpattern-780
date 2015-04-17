package com.leo.dp.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class GlobalTimes extends NewspaperOffice implements Observer {

	private Observable observable;

	public GlobalTimes(SpecialRepoter repoter) {
		this.observable = repoter;
		repoter.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof SpecialRepoter) {
			System.out.println("Global Timse brings you the latest news!");
		}
	}

}
