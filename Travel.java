package com;

import java.util.ArrayList;
import java.util.List;

public class Travel {
	
	public boolean isCarDriver(Driver driver) {
		
		return driver.getCategory().equalsIgnoreCase("car");
	
	}
	
	public String retrieveByDriverId(List<Driver> drivers, int driverId) {
		
		for(Driver driver : drivers) {
			if(driver.getDriverId()==driverId) {
				return "Driver name is "+driver.getDriverName()+
						" belonging to the category "+
						driver.getCategory()+
						" traveled "+
						driver.getTotalDistance()+
						" KM so far.";
			}
		}
		return "No Driver Id Matched";
	}
	
	public int retrieveCountOfDriver(List<Driver> drivers, String category) {
		
		int count=0;
		for(Driver driver:drivers) {
			if(driver.getCategory().equalsIgnoreCase(category)) {
				count++;
			}
		}
		return count;
	}
	
	public List<Driver> retrieveDriver(List<Driver> drivers, String category){
		List<Driver> resultList = new ArrayList<>();
		for(Driver driver : drivers) {
			if(driver.getCategory().equalsIgnoreCase(category)) {
				resultList.add(driver);
			}
		}
		
		return resultList;
	}
	
	public Driver retrieveMaxDistanceTravelledDriver(List<Driver> drivers) {
		double highest = 0;
		Driver d=null;
		for(Driver driver : drivers) {
			if(driver.getTotalDistance()>highest) {
				highest = driver.getTotalDistance();
				d = driver;
			}
		}
		
		return d;
	}
	
	
	

}
