package raceControl;

import java.util.ArrayList;
import java.util.List;

public class EliminationRace extends Race {
	private int warmUpTime;

//CONST
	
	public EliminationRace(String name,String type, int warmUpTime) {
		super(name,type);
		this.warmUpTime=warmUpTime;
	}
	
	public EliminationRace(String name, String type, List<Garage> garageList, List<Car> carList, int warmUpTime) {
		super(name, type, garageList, carList);
		super.setType("Elimination");
		this.warmUpTime = warmUpTime;
	}
	
	
//GET N SET
	public int getWarmUpTime() {
		return warmUpTime;
	}
	public void setWarmUpTime(int warmUpTime) {
		this.warmUpTime = warmUpTime;
	}

	//METHODS
	public void startEliminationRace(Race singleRace) {
		//make a copy of the carList to work with, this way don't remove car from the original list at the end
		List<Car> carListCopy = new ArrayList<>(singleRace.getCarList());
		//start the race
		//WarmUpTime -- we only get the change speed to get the new speed when the WUtime ends
		for (int i = 0; i < singleRace.getRaceTime(singleRace); i++) {
			for (Car c : carListCopy) {
				c.changeSpeed();		
			}
		}
		System.out.println("\nRace '" + singleRace.getName() + "' ends");
		int j = singleRace.getCarList().size();
		//elimination time, each minute the last car is eliminated 
		while (carListCopy.size() > 0) {
			for (int i = 0; i < carListCopy.size(); i+=0) {				
				for (Car c : carListCopy) {
					c.changeSpeed();
					c.getDistancePerMinute();
				}
				carListCopy.sort((o1, o2) -> Double.compare(o2.getDistance(), o1.getDistance()));
				//print eliminated car
				System.out.println(j + "º place - " +  carListCopy.get(carListCopy.size()-1).getBrand() 
						+ " " + carListCopy.get(carListCopy.size()-1).getModel() 
						+ " from garage '" + carListCopy.get(carListCopy.size()-1).getGarage()
						+ "\nhas been eliminated with "
						+ carListCopy.get(carListCopy.size()-1).getDistance() + "Km reached"); 
				//remove last car
				this.eliminationRacePoints(carListCopy);
				carListCopy.remove(carListCopy.size()-1);
				j--;
			}
		}
	}
	
	public void eliminationRacePoints (List<Car> carList) {
		if (carList.size() == 1) {
			carList.get(0).setPoints(carList.get(0).getPoints() + 3);
		}else if (carList.size() == 2) {
			carList.get(1).setPoints(carList.get(1).getPoints() + 2);
		}else if(carList.size() == 3){
			carList.get(2).setPoints(carList.get(2).getPoints() + 1);
		}
	}
	
}
