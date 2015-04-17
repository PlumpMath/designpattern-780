package com.leo.dp.factory.abstractfactory;

public class BMWCarFactory implements CarFactory {

	@Override
	public EconomicCar createEconomicCar() {
		// TODO Auto-generated method stub
		return new BMWEcnomicCar();
	}

	@Override
	public SportsCar createSportsCar() {
		// TODO Auto-generated method stub
		return new BMWSportsCar();
	}

}
