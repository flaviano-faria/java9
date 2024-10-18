package com.java9.stream.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.java9.adapter.CarAdapter;
import com.java9.adapter.CarAdapterImpl;
import com.java9.interfaces.ICarAdapter;
import com.java9.stream.domain.Car;

public class CarService {
	
	public void getAboveYear(int year){
		
		CarAdapterImpl carAdapterImpl = new CarAdapterImpl();
		ICarAdapter carAdapter = new CarAdapter(carAdapterImpl);
		
		ArrayList filteredList = (ArrayList) carAdapter.getCarList().stream().takeWhile(e -> 
				((Car) e).getYear()> year).collect(Collectors.toList());
	
		filteredList.stream().forEach(e -> System.out.println(((Car) e).getYear() + " "+((Car) e).getModel()));
	}
	
	
	public void getAllCars() {
		CarAdapterImpl carAdapterImpl = new CarAdapterImpl();
		ICarAdapter carAdapter = new CarAdapter(carAdapterImpl);
		
		carAdapter.getCarList().stream().forEach(e -> System.out.println(((Car) e).getModel()));
	}
	
	public void getYearByModel() {
		
		CarAdapterImpl carAdapterImpl = new CarAdapterImpl();
		ICarAdapter carAdapter = new CarAdapter(carAdapterImpl);
		String model = "ferrari F40";
		ArrayList filteredList = (ArrayList) carAdapter.getCarList().stream().takeWhile(e -> ((Car) e).getModel().equals(model)).collect(Collectors.toList());
		filteredList.stream().forEach(e -> System.out.println(((Car) e).getYear()));
	}
	
	public void getDistinctCar() {
		CarAdapterImpl carAdapterImpl = new CarAdapterImpl();
		ICarAdapter carAdapter = new CarAdapter(carAdapterImpl);
		HashSet filteredList = (HashSet) carAdapter.getCarList().stream().distinct().collect(Collectors.toSet());
		filteredList.stream().forEach(e -> System.out.println("distinct:\n"+((Car)e).getModel()+" "+((Car) e).getYear()));
	}
	
	public boolean isOverthan(String x, String y) {
		return x.length() > y.length();
	}
	
	public boolean isGreatherThan() {
		String x = "abcd";
		String y = "ab";
		return isOverthan(x, y);
	}
	
	
}
