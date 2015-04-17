package com.leo.dp.factory.factorymethod;

public class AudiCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}
