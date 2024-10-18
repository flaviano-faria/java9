package com.java9.adapter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java9.stream.domain.Car;


public class CarAdapterImpl{

	public List getCarList() {
		List<Car> list = getCarListFromFile();
		return list;
	}
	
	public List<Car> getCarListFromFile() {
		Car[] car = null;
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			String userDir = System.getProperty("user.dir");
			car =  objectMapper.readValue(new File(userDir+"/car/car.json"), Car[].class);
		} catch (StreamReadException e) {
			e.printStackTrace();
		} catch (DatabindException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Arrays.asList(car);
	}

}
