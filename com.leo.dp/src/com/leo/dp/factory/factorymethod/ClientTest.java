package com.leo.dp.factory.factorymethod;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car benz = new BenzCarFactory().createCar();
		benz.drive();
		
		Car bmw = new BMWCarFactory().createCar();
		bmw.drive();
		
		Car audi = new AudiCarFactory().createCar();
		audi.drive();
	}

}
