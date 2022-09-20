package raceControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tournament {
	private String name;
	private List<Race> racesInTourList;
	private List<Garage> garagesInTourList;
	private List<Car> carsInTourList;
	private List<Car> podiumList;

	
//CONST
	public Tournament(String name, List<Race> racesInTourList) {
		this.name = name;
		this.racesInTourList = racesInTourList;
	}
	public Tournament(String name, List<Race> racesInTourList, List<Garage> garagesInTourList) {
		this.name = name;
		this.racesInTourList = racesInTourList;
		this.garagesInTourList = garagesInTourList;
	}

		

	//GET N SET
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Race> getRacesInTourList() {
		return racesInTourList;
	}
	public void setRacesInTourList(List<Race> racesInTourList) {
		this.racesInTourList = racesInTourList;
	}
	public List<Garage> getGaragesInTourList() {
		return garagesInTourList;
	}
	public void setGaragesInTourList(List<Garage> garagesInTourList) {
		this.garagesInTourList = garagesInTourList;
	}
	public List<Car> getCarsInTourList() {
		return carsInTourList;
	}
	public void setCarsInTourList(List<Car> carsInTourList) {
		this.carsInTourList = carsInTourList;
	}
	public List<Car> getPodiumList() {
		return podiumList;
	}
	public void setPodiumList(List<Car> podiumList) {
		this.podiumList = podiumList;
	}
	
//METHODS
	public void createTournament(String name,List<Race> raceList, List<Garage> garagesList) {
		this.setName(name);
		//choose randomly the kind of tournament -- 1 garage or multiple garages
		double randomNum = Math.random();
		if (randomNum < 0.5) {
			int garageIndex = new Random().nextInt(garagesList.size());
			this.garagesInTourList.add(garagesList.get(garageIndex));
			System.out.println("En el torneo " + this.name + " solo participa el garage " 
						+ this.getGaragesInTourList().get(0).getName());
		} else {
			System.out.println("Varios garages");
		}
		
		//list of races
		System.out.println("Those are the races in this tournament");
		int raceNum = 1;
		for (Race r : raceList) {
			System.out.println(raceNum + ". " + r.getName());
			raceNum++;
		}
		
	}

	public void showTourDetails() {
		int i = 0;
		System.out.println("\nThese are the races in the tournament");
		for (Race r : this.getRacesInTourList()) {
			i++;
			System.out.println(i + ". " + r.getName()
					+ "\n    Type:" + r.getType());
			if (r.getType().equals("Standard")) {
				System.out.println("    Duration:" + ((StandardRace) r).getDuration() + "min");
			}
			if (r.getType().equals("Elimination")) {
				System.out.println("    Warm up:" + ((EliminationRace) r).getWarmUpTime() + "min");			
			}
		}
		
	}
	
	public void getCarsForTournament(List<Garage> garagesInTour) {
		//create the race carList
		this.setCarsInTourList(new ArrayList<>());
		//if only one garage is into the race get all cars and add to race car list
		if (garagesInTour.size() == 1) {
			this.setCarsInTourList(garagesInTour.get(0).getCarList());
		//if more garages are into the race get one random car from each garage and add it to the race car list
		}else if (garagesInTour.size() > 1) {
			for (Garage g : garagesInTour) {
				this.getCarsInTourList().add(g.selectRandomCar());
			}
		}else {
			System.out.println("\nERROR: there are no cars in this race");
		}
	}
	
	public void startTournament (List<Garage> garagesInTour) {	
		this.getCarsForTournament(garagesInTour);
		for (int i=0 ; i< this.getRacesInTourList().size() ; i++) {
			//set race lists
			Race actualRace = this.getRacesInTourList().get(i);
			actualRace.setCarList(this.getCarsInTourList());
			//start the race
			actualRace.startRaceNoPointReset(actualRace);				
			//get and print points in race
			if(actualRace instanceof StandardRace) {
				((StandardRace) actualRace).standardRacePoints();
			}		
			if(actualRace instanceof EliminationRace) {
				((EliminationRace) actualRace).eliminationRacePoints(actualRace.getCarList());
			}		
		}
		
		//add cars to podiumList and sort them by their points
		this.podiumList = new ArrayList<>(this.getCarsInTourList());
		this.getPodiumList().sort((o1, o2) -> Integer.compare(o2.getPoints(), o1.getPoints()));
				
		//tournament points recount
		System.out.println("\nTOURNAMENT '" + this.getName() + "' SCORE");
		int i = 0;
		for (Car c : this.getPodiumList()) {
			i++;
			System.out.println(i + "ª The " + c.getBrand() + " " + c.getModel() + " gets " + c.getPoints() + "points");
		}
	}

}
