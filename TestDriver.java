package com;

import java.util.ArrayList;
import java.util.List;

public class TestDriver {
	
	public static void main(String[] args) {
		List<Driver> drivers = new ArrayList<>();
		
		Driver driver1 = new Driver("lorry", 1, "abc", 10.3);
		Driver driver2 = new Driver("car", 2, "xyz", 100.13);
		Driver driver3 = new Driver("Auto", 3, "fgy", 89.3);
		Driver driver4 = new Driver("Car", 4, "jhy", 97.0);
		Travel t = new Travel();
		
		boolean res = t.isCarDriver(driver1);
		System.out.println(res);
		
		drivers.add(driver1);
		drivers.add(driver2);
		drivers.add(driver3);
		drivers.add(driver4);
		
		String res2 = t.retrieveByDriverId(drivers, 5);
		System.out.println(res2);
		
		int res3 = t.retrieveCountOfDriver(drivers, "car");
		System.out.println(res3);
		
		List<Driver> res4 = t.retrieveDriver(drivers, "lorry");
		System.out.println(res4);
		
		Driver res5 = t.retrieveMaxDistanceTravelledDriver(drivers);
		System.out.println(res5);
	}

}
