package com.leo.dp.factory.factorymethod;

public class BMWCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new BMW();
	}

}
