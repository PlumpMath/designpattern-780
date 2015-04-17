package com.leo.dp.factory.abstractfactory;

public class CheryCarFactory implements CarFactory {

	@Override
	public EconomicCar createEconomicCar() {
		// TODO Auto-generated method stub
		return new CheryEconomicCar();
	}

	@Override
	public SportsCar createSportsCar() {
		// TODO Auto-generated method stub
		return new CherySportsCar();
	}

}
