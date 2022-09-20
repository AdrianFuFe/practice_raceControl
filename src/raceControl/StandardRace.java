package raceControl;

import java.util.List;

public class StandardRace extends Race {
	private int duration = 3;

//CONST
	public StandardRace(String name, String type, int duration) {
		super(name, type);
		this.duration=duration;
	}
	
	public StandardRace(String name, String type, List<Garage> garageList, List<Car> carList, int duration) {
		super(name, type, garageList, carList);
		super.setType("Standard");
		this.duration = duration;
	}
	
	
//GET N SET
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
//METHODS
	public void startStandardRace(Race singleRace) {
		//start the race
		for (int i = 0; i < singleRace.getRaceTime(singleRace); i++) {
			for (Car c : singleRace.getCarList()) {
				c.changeSpeed();
				c.getDistancePerMinute();			
			}
		}

		//sort list with lambda expression and print the final distances
		super.getCarList().sort((o1, o2) -> Double.compare(o2.getDistance(), o1.getDistance()));
		System.out.println("\nRace '" + singleRace.getName() + "' ends");
		int i = 0;
		for (Car c : singleRace.getCarList()) {
			i++;
			System.out.println(i + "º place -The car " + c.getBrand() 
			+" "+ c.getModel() + " reach " + c.getDistance() + "Km");	
		}

	}
	
	public void standardRacePoints() {
		if (super.getCarList().size() >= 3) {
			super.getCarList().get(0).setPoints(super.getCarList().get(0).getPoints() + 3);
			super.getCarList().get(1).setPoints(super.getCarList().get(1).getPoints() + 2);
			super.getCarList().get(2).setPoints(super.getCarList().get(2).getPoints() + 1);
		}else if (super.getCarList().size() < 3) {
			super.getCarList().get(0).setPoints(super.getCarList().get(0).getPoints() + 3);
			super.getCarList().get(1).setPoints(super.getCarList().get(1).getPoints() + 2);
		}else {
			System.out.println("You can't get points in this race");
		}
	}

}
