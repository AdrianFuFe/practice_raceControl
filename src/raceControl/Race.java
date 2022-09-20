package raceControl;

import java.util.ArrayList;
import java.util.List;

public class Race {
	private String name;
	private String type;
	private List<Garage> garageList;
	private List<Car> carList;
	
//CONST
	public Race(String name) {
		this.name = name;
	}
	public Race(String name,String type) {
		this.name = name;
		this.type = type;
	}
	public Race(String name,String type, List<Garage> garageList) {
		this.name = name;
		this.type = type;
		this.garageList = garageList;
	}
	public Race(String name,String type, List<Garage> garageList, List<Car> carList) {
		this.name = name;
		this.type = type;
		this.garageList = garageList;
		this.carList = carList;
	}
	
//GET N SET
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Garage> getGarageList() {
		return garageList;
	}
	public void setGarageList(List<Garage> garageList) {
		this.garageList = garageList;
	}
	public List<Car> getCarList() {
		return carList;
	}
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	
//METHODS
	
	public void createRace(List<Race> totalRacesList) {
		if(!totalRacesList.contains(this)){
			totalRacesList.add(this);
			System.out.println("You have just created a new race: " + this.name);
		}else {
			System.out.println("This race already exists");
		}
	}
	
	public void showRaceDetails(Race race) {
		System.out.println("\nName: " + race.getName() 
			+ "\nType: " + race.getType());	
		if(race instanceof StandardRace) {
			System.out.println("Duration: " +  ((StandardRace)race).getDuration() + "min");
		}		
		if(race instanceof EliminationRace) {
			System.out.println("Warm Up Time: " +  ((EliminationRace)race).getWarmUpTime() + "min");	
		}
	}
	
	public int getRaceTime(Race race) {
		int raceTime=0;
		if(race instanceof StandardRace) {
			raceTime = ((StandardRace)race).getDuration();
		}
		if(race instanceof EliminationRace) {
			raceTime = ((EliminationRace)race).getWarmUpTime();
		}
		return raceTime;
	}
	
	public List<Car> getCarsForRace(Race singleRace) {
		//create the race carList
		singleRace.setCarList(new ArrayList<>());
		//if only one garage is into the race get all cars and add to race car list
		if (singleRace.getGarageList().size() == 1) {
			singleRace.setCarList(singleRace.getGarageList().get(0).getCarList());
		//if more garages are into the race get one random car from each garage and add it to the race car list
		}else if (singleRace.getGarageList().size() > 1) {
			for (Garage g : singleRace.getGarageList()) {
				singleRace.getCarList().add(g.selectRandomCar());
			}
		}else {
			System.out.println("\nERROR: there are no cars in this race");
		}
		return singleRace.getCarList();
	}
	
	public void showCarsInRace(Race singleRace) {
		singleRace.getCarsForRace(singleRace);
		System.out.println("\nThose are the cars into the race");
		for (Car c : singleRace.getCarList()) {
			System.out.println("The car " +  c.getBrand() +" "+ c.getModel() 
				+ " from the garage '" + c.getGarage());			
		}
	}
	public void startRace(Race singleRace) {
		singleRace.getCarsForRace(singleRace);
		//reset distances, speed and points from cars
		for (Car c : singleRace.getCarList()) {
			c.setSpeed(0);
			c.setDistance(0);
			c.setPoints(0);
		}
		if (singleRace.getType().equals("Standard")) {
			((StandardRace) singleRace).startStandardRace(singleRace);
		}
		if (singleRace.getType().equals("Elimination")) {
			((EliminationRace) singleRace).startEliminationRace(singleRace);
		}
	}

	public void startRaceNoPointReset(Race singleRace) {
		//reset distances, speed and points from cars
		for (Car c : singleRace.getCarList()) {
			c.setSpeed(0);
			c.setDistance(0);
		}
		if (singleRace.getType().equals("Standard")) {
			((StandardRace) singleRace).startStandardRace(singleRace);
		}
		if (singleRace.getType().equals("Elimination")) {
			((EliminationRace) singleRace).startEliminationRace(singleRace);
		}
	}
	
}
