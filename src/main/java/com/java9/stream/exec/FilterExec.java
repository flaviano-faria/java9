package com.java9.stream.exec;

import java.util.function.Predicate;
import java.util.stream.Stream;

import com.java9.stream.filter.CarService;

public class FilterExec {

	public static void main(String[] args) {
		
		CarService service = new CarService();
		
		service.getAboveYear(1990);
		
		service.getAllCars();
		service.getYearByModel();
		service.getDistinctCar();
		
		
		//Demonstrate the Stream.iterate
		Predicate<Integer> hasNext = n -> n < 100;
	       Stream.iterate(1, hasNext, n -> n * 2)
	             .forEach(System.out::println);
	}
}
