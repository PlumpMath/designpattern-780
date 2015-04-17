package com.leo.dp.factory.simplefactory;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car benz = CarFactory.createCar("Benz");
		benz.drive();
		
		Car bmw = CarFactory.createCar("BMW");
		bmw.drive();
		
		Car audi = CarFactory.createCar("AudI");
		audi.drive();
	}

}
