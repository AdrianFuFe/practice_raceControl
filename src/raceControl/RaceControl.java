package raceControl;


import java.util.List;


public class RaceControl {
	private List<Garage> totalGaragesList;
	private List<Race> totalRacesList;
	private List<Tournament>totalToursList;
	
//CONST	
	public RaceControl(List<Garage> totalGaragesList, List<Race> totalRacesList, List<Tournament>totalToursList) {
		this.totalGaragesList = totalGaragesList;
		this.totalRacesList = totalRacesList;
		this.totalToursList = totalToursList;
		
	}	

//GET N SET
	public List<Race> getTotalRacesList() {
		return totalRacesList;
	}
	public List<Garage> getTotalGaragesList() {
		return totalGaragesList;
	}
	public List<Tournament> getTotalToursList() {
		return totalToursList;
	}	

//METHODS
	public void showTours() {
		int num = 1;
		for (Tournament t : this.getTotalToursList()) {
			System.out.println(num + "." + t.getName());
			num++;
		}
	}
	public void showGarages() {
		int num = 1;
		for (Garage g : this.getTotalGaragesList()) {
			System.out.println(num + "." + g.getName());
			num++;
		}
	}
	public void showRaces() {
		int num = 1;
		for (Race r : this.getTotalRacesList()) {
			System.out.println(num + "." + r.getName());
			num++;
		}
	}  
	 
	public Tournament findTourByName(String name) {
		Tournament tourFind = null;
		for (Tournament t : this.getTotalToursList()) {
			if (t.getName().equals(name)) {
				tourFind = t;
			}
		}
		return tourFind;
	}	
	public Garage findGarageByName ( String name) {
		Garage garageFind = null;
		for (Garage g : this.getTotalGaragesList()) {
			if (g.getName().equals(name)) {
				garageFind =g;
			}
		}
		return garageFind;
	}
	public Race findRaceByName ( String name) {
		Race raceFind = null;
		for (Race r : this.getTotalRacesList()) {
			if (r.getName().equals(name)) {
				raceFind = r;
			}
		}
		return raceFind;
	}
	
}
