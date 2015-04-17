package com.leo.dp.factory.abstractfactory;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory benzFactory = new BenzCarFactory();
		benzFactory.createEconomicCar().drive();
		benzFactory.createSportsCar().drive();

		CarFactory bmwFactory = new BMWCarFactory();
		bmwFactory.createEconomicCar().drive();
		bmwFactory.createSportsCar().drive();

		CarFactory cheryFactory = new CheryCarFactory();
		cheryFactory.createEconomicCar().drive();
		cheryFactory.createSportsCar().drive();

	}

}
