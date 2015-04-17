package com.leo.dp.observer.jdk;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecialRepoter repoter = new SpecialRepoter();
		GlobalTimes n1 = new GlobalTimes(repoter);
		PeopleDaily n2 = new PeopleDaily(repoter);
		XinhuaDaily n3 = new XinhuaDaily(repoter);

		repoter.getNews("new news!");
		System.out.println();
		n2.remove();
		repoter.getNews("another new news!");
	}

}
