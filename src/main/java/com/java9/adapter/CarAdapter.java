package com.java9.adapter;

import java.util.List;

import com.java9.interfaces.ICarAdapter;

public class CarAdapter implements ICarAdapter{

	private CarAdapterImpl carAdapterImpl;
	
	public CarAdapter(CarAdapterImpl carAdapterImpl) {
		this.carAdapterImpl = carAdapterImpl;
	}
	
	@Override
	public List getCarList() {
		
		return carAdapterImpl.getCarList();
	}

}
