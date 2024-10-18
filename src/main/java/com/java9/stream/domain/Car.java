package com.java9.stream.domain;

import java.util.Objects;

public class Car implements Comparable<Car>{
	
	private String model;
	private int year;
	
	public Car(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}
	
	public Car() {
		super();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(Car o) {
		if(this.getModel().equalsIgnoreCase(o.getModel())) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(model, other.model);
	}

}
