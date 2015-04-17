package com.leo.dp.factory.abstractfactory;

public class BenzCarFactory implements CarFactory {

	@Override
	public EconomicCar createEconomicCar() {
		// TODO Auto-generated method stub
		return new BenzEconomicCar();
	}

	@Override
	public SportsCar createSportsCar() {
		// TODO Auto-generated method stub
		return new BenzSportsCar();
	}

}
