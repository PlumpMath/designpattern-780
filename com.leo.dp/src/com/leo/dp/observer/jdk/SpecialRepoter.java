package com.leo.dp.observer.jdk;

import java.util.Observable;

public class SpecialRepoter extends Observable {
	
	public void getNews(String msg) {
		this.setChanged();
		this.notifyObservers(msg);
	}
	
}
