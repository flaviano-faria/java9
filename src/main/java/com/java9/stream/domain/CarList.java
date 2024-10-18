package com.java9.stream.domain;

import java.util.List;

public class CarList {
	
	private List<Car> carList;

	public CarList(List<Car> carList) {
		super();
		this.carList = carList;
	}

	
	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	
}
