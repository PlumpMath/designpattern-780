package com.leo.dp.factory.simplefactory;

public class CarFactory {

	public static Car createCar(String type) {
		if (type.equalsIgnoreCase("Benz")) {
			return new Benz();
		} else if (type.equalsIgnoreCase("BMW")) {
			return new BMW();
		} else if (type.equalsIgnoreCase("Audi")) {
			return new Audi();
		}
		return null;
	}

}
