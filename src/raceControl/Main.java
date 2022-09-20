package raceControl;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//create garages
		Garage rfk = new Garage("RFK Racing");
		Garage hm = new Garage("Hendrinck Motorsports");
		Garage tp = new Garage("Team Penske");
		Garage jgr = new Garage("Joe Gibbs Racing");
		Garage kr = new Garage("Kaulig Racing");
		Garage wbr = new Garage("Wood Brothers Racing");
		List<Garage> totalGaragesList = new ArrayList<>();
		totalGaragesList.add(rfk);
		totalGaragesList.add(hm);
		totalGaragesList.add(tp);
		totalGaragesList.add(jgr);
		totalGaragesList.add(kr);
		totalGaragesList.add(wbr);
	
//create cars
		//cars garage1
		Car c1_1 = new Car("Ford", "Mustang", rfk.getName());
		Car c1_2 = new Car("Chevrolet", "Camaro", rfk.getName());
		Car c1_3 = new Car("Chevrolet", "Malibu", rfk.getName());
		Car c1_4 = new Car("Chevrolet", "Cruze", rfk.getName());
		Car c1_5 = new Car("Citroen", "C5", rfk.getName());
		//cars garage2
		Car c2_1 = new Car("Ford", "Mondeo", hm.getName());
		Car c2_2 = new Car("Ford", "Fiesta", hm.getName());
		Car c2_3 = new Car("Toyota", "Corolla", hm.getName());
		Car c2_4 = new Car("Ford", "Focus", hm.getName());		
		Car c2_5 = new Car("Toyota", "Yaris", hm.getName());		
		//cars garage3
		Car c3_1 = new Car("Citroen", "Jumpy", tp.getName());
		Car c3_2 = new Car("Citroen", "C4", tp.getName());
		Car c3_3 = new Car("Citroen", "C1", tp.getName());
		Car c3_4 = new Car("Toyota", "Auris", tp.getName());
		Car c3_5 = new Car("Toyota", "Camry", tp.getName());
		//cars garage4
		Car c4_1 = new Car("Suzuki", "Ignis", jgr.getName());
		Car c4_2 = new Car("Suzuki", "Vitara", jgr.getName());
		Car c4_3 = new Car("Toyota", "Avensis", jgr.getName());
		Car c4_4 = new Car("Toyota", "Supra", jgr.getName());
		Car c4_5 = new Car("Toyota", "Verso", jgr.getName());
		//cars garage5
		Car c5_1 = new Car("Suzuki", "Swift", kr.getName());
		Car c5_2 = new Car("Suzuki", "Splash", kr.getName());
		Car c5_3 = new Car("Suzuki", "Kizashi", kr.getName());
		Car c5_4 = new Car("Suzuki", "Celerio", kr.getName());
		Car c5_5 = new Car("Toyota", "Verso", kr.getName());
		//cars garage6
		Car c6_1 = new Car("BMW", "Serie3", wbr.getName());
		Car c6_2 = new Car("BMW", "Serie7", wbr.getName());
		Car c6_3 = new Car("BMW", "Serie5", wbr.getName());
		Car c6_4 = new Car("Opel", "Astra", wbr.getName());
		Car c6_5 = new Car("Opel", "Corsa", wbr.getName());

		
//add cars to garages lists
		List<Car> rfkGarageList = new ArrayList<>();		
		rfk.setCarList(rfkGarageList);
		rfk.getCarList().add(c1_1);
		rfk.getCarList().add(c1_2);
		rfk.getCarList().add(c1_3);
		rfk.getCarList().add(c1_4);
		rfk.getCarList().add(c1_5);
		List<Car> hmGarageList = new ArrayList<>();
		hm.setCarList(hmGarageList);
		hm.getCarList().add(c2_1);
		hm.getCarList().add(c2_2);
		hm.getCarList().add(c2_3);
		hm.getCarList().add(c2_4);
		hm.getCarList().add(c2_5);
		List<Car> tpGarageList = new ArrayList<>();
		tp.setCarList(tpGarageList);
		tp.getCarList().add(c3_1);
		tp.getCarList().add(c3_2);
		tp.getCarList().add(c3_3);
		tp.getCarList().add(c3_4);
		tp.getCarList().add(c3_5);
		List<Car> jgrGarageList = new ArrayList<>();
		jgr.setCarList(jgrGarageList);
		jgr.getCarList().add(c4_1);
		jgr.getCarList().add(c4_2);
		jgr.getCarList().add(c4_3);
		jgr.getCarList().add(c4_4);
		jgr.getCarList().add(c4_5);
		List<Car> krGarageList = new ArrayList<>();
		kr.setCarList(krGarageList);
		kr.getCarList().add(c5_1);
		kr.getCarList().add(c5_2);
		kr.getCarList().add(c5_3);
		kr.getCarList().add(c5_4);
		kr.getCarList().add(c5_5);
		List<Car> wbrGarageList = new ArrayList<>();
		wbr.setCarList(wbrGarageList);
		wbr.getCarList().add(c6_1);
		wbr.getCarList().add(c6_2);
		wbr.getCarList().add(c6_3);
		wbr.getCarList().add(c6_4);
		wbr.getCarList().add(c6_5);
		

//create races
		StandardRace ams = new StandardRace("Atlanta Motor Speedway", "Standard", 180);
		StandardRace acs = new StandardRace("Auto Club Speedway", "Standard", 180);
		StandardRace bms = new StandardRace("Bristol Motor Speedway", "Standard", 210);
		StandardRace mcs = new StandardRace("Charlotte Motor Speedway", "Standard", 150);
		EliminationRace ca = new EliminationRace("Circuit of the Americas", "Elimination", 210);
		EliminationRace dr = new EliminationRace("Darlington Raceway", "Elimination", 150);
		StandardRace dis = new StandardRace("Daytona International Speedway", "Standard", 240);
		StandardRace dms = new StandardRace("Dover Motor Speedway", "Standard", 210);
		StandardRace hms = new StandardRace("Homestead Miami Speedway", "Standard", 120);
		StandardRace ims = new StandardRace("Indianapolis Motor Speedway", "Standard", 180);
		StandardRace ks = new StandardRace("Kansas Speedway", "Standard", 180);
		StandardRace lvms = new StandardRace("Las Vegas Motor Speedway", "Standard", 210);
		EliminationRace  lamc = new EliminationRace("Los Angeles Memorial Coliseum", "Elimination", 180);
		StandardRace ms = new StandardRace ("Martinsville Speedway", "Standard", 180);
		StandardRace mis = new StandardRace ("Michigan International Speedway", "Standard", 300);
		EliminationRace irp = new EliminationRace ("Indianapolis Race Park","Elimination",200);
		EliminationRace ra = new EliminationRace ("Road Atlanta","Elimination",120);
		EliminationRace cgv = new EliminationRace ("Circuito Gilles Villenueve","Elimination",240);
		
		List<Race> totalRacesList = new ArrayList<>();
		totalRacesList.add(ams);
		totalRacesList.add(acs);
		totalRacesList.add(bms);
		totalRacesList.add(mcs);
		totalRacesList.add(ca);
		totalRacesList.add(dr);
		totalRacesList.add(dis);
		totalRacesList.add(dms);
		totalRacesList.add(hms);
		totalRacesList.add(ims);
		totalRacesList.add(ks);
		totalRacesList.add(lvms);
		totalRacesList.add(lamc);
		totalRacesList.add(ms);
		totalRacesList.add(mis);
		totalRacesList.add(irp);
		totalRacesList.add(ra);
		totalRacesList.add(cgv);

		
//create test tournament
		//create its race list and add races
		List<Race> atRaces = new ArrayList<>();
		atRaces.add(ams);
		atRaces.add(ks);
		atRaces.add(mcs);
		atRaces.add(lamc);
		atRaces.add(dr);
		Tournament at = new Tournament("American Tour", atRaces);	
		
		List<Race> standardRaces1 = new ArrayList<>();
		standardRaces1.add(ams);
		standardRaces1.add(acs);
		standardRaces1.add(bms);
		standardRaces1.add(mcs);
		standardRaces1.add(dis);
		standardRaces1.add(dms);
		Tournament st1 = new Tournament("Standard Tour 1", standardRaces1);	
		
		List<Race> standardRaces2 = new ArrayList<>();
		standardRaces2.add(hms);
		standardRaces2.add(ims);
		standardRaces2.add(ks);
		standardRaces2.add(lvms);
		standardRaces2.add(ms);
		standardRaces2.add(mis);
		Tournament st2 = new Tournament("Standard Tour 2", standardRaces2);	
		
		List<Race> elimRaces = new ArrayList<>();
		elimRaces.add(ca);
		elimRaces.add(dr);
		elimRaces.add(lamc);
		elimRaces.add(irp);
		elimRaces.add(ra);
		elimRaces.add(cgv);
		Tournament et = new Tournament("Elimionation Tour", elimRaces);	
			
		List<Tournament> totalToursList = new ArrayList<>();
		totalToursList.add(at);
		totalToursList.add(st1);
		totalToursList.add(st2);
		totalToursList.add(et);
		
		
//class with all garages, races and tournaments		
		RaceControl rc = new RaceControl (totalGaragesList, totalRacesList, totalToursList);
		
		
//_____________________________________________________MENU VARIABLES		
		int option=0; 	/*main menu option*/
		int optionG=0;	/*garage menu option*/	
		int optionC=0;	/*cars menu option*/
		int optionR=0;	/*races menu option*/
		int optionSR=0;	/*start single race menu option*/
		int optionT=0;	/*tournament menu option*/
		int optionST=0;	/*start tournament menu option*/
		
//___________________________________________________________________________________________________MAIN MENU		
		do {
			option = Input.integer( "\nRACE CONTROL:\n"
					+   " '1' - Garages\n"
					+   " '2' - Races\n"
					+   " '3' - Tournaments\n"
					+   " '9' - Exit\n");
			switch(option) {
				case 1:
//_________________________________________________________________________________________________GARAGE MENU
					do {
						optionG = Input.integer( "\nGARAGES:\n"
								+   " '1' - Show all garages\n"
								+   " '2' - Create new garage\n"
								+   " '3' - Remove a garage\n"
								+   " '9' - Go back\n");
						switch(optionG) {
							case 1:
								//show all garages
								System.out.println("\nThese are all the garages");
								rc.showGarages();
//____________________________________________________________________________________________________CAR MENU
								do {
									optionC = Input.integer( "\nINSIDE GARAGE:\n"
											+   " '1' - Show all cars in garage\n"
											+   " '2' - Create new car\n"
											+   " '3' - Remove a car\n"
											+   " '9' - Go back\n");
									switch (optionC) {
										case 1:
											//select a garage by their number in list and show the cars inside
											int garageChoosen = Input.integer("\nSelect one garage by his number in the list\n");
											if (garageChoosen > 0 && garageChoosen <= rc.getTotalGaragesList().size()) {
												rc.getTotalGaragesList().get(garageChoosen-1).showCars();												
											}else {
												System.out.println("\nERROR: Invalid value option");
											}
											break;
										case 2:	
											//get the name for a new garage and look for the name in the global list to check if exists
											String newCarGarageName = Input.string("\nInsert the new car's garage:\n");
											Garage newCarGarage = rc.findGarageByName(newCarGarageName);
											if (newCarGarage==null) {
												System.out.println("\nThis garage doesn't exist");
											}else {	
												//if the name is not repeated get the brand and the model and look for other cars with same model
												String newCarBrand = Input.string("\nInsert the new car's brand:\n");
												String newCarModel = Input.string("\nInsert the new car's model:\n");
												if(newCarGarage.findCarByModel(newCarModel) != null) {	//------->can do a double check by brand and model
													System.out.println("\nOther car with the same model already exists in this garage");
												}else {													
													Car car = new Car(newCarBrand,newCarModel,newCarGarageName);
													car.createCar(newCarGarage.getCarList());
												}
											}
											break;
										case 3:
											//pick the garage you want to delete a car from by its number in the list
											int garChoosen = Input.integer("\nSelect one garage by his number in the list\n");
											if (garChoosen > 0 && garChoosen <= rc.getTotalGaragesList().size()) {
												rc.getTotalGaragesList().get(garChoosen-1).showCars();
												//pick the car you want to delete by its model and check if exists
												String delCarModel = Input.string("\nInsert the car's model you want to delete:\n");
												if(rc.getTotalGaragesList().get(garChoosen-1).findCarByModel(delCarModel) == null) {
													System.out.println("This model car doesn't figure into this garage");
												}else {
													rc.getTotalGaragesList().get(garChoosen-1).getCarList()
														.remove(rc.getTotalGaragesList().get(garChoosen-1).findCarByModel(delCarModel));
													System.out.println("\nThe car with model " + delCarModel + "  has been removed");
												}
											}else {
												System.out.println("\nERROR: Invalid value option");
											}
											break;
										case 9:
											optionG = 0;
											break;
										default:
											System.out.println("\nERROR: Invalid value option");
									}
								}while(optionC != 9);
								break;
							case 2:
								//look for garages in the global list by his name and if it doesn't exist create a new one
								String newGarageName = Input.string("\nInsert the new garage's name:\n");
								if(rc.findGarageByName(newGarageName) != null) {
									System.out.println("\nOther garage with the same name already exists");
								}else {									
									Garage ng = new Garage(newGarageName);
									ng.createGarage(rc.getTotalGaragesList());
									ng.setCarList(new ArrayList<>());
								}
								break;
							case 3:
								//show all garages to pick one by its name to remove  
								System.out.println("\nThese are all the garages");
								rc.showGarages();
								String delGarageName = Input.string("\nInsert the garage's name you want to delete:\n");
								Garage delGarage = rc.findGarageByName(delGarageName);
								if(delGarage!=null) {
									rc.getTotalGaragesList().remove(delGarage);
									System.out.println("\n" + delGarageName + "'s garage has been removed");
								}else {
									System.out.println("\nThere are no garages with this name");
								}
								break;
							case 9:
								//go back to menu
								option = 0;
								break;
							default:
								System.out.println("\nERROR " + " Invalid value option");
						}
					}while(optionG != 9);
					break;
				case 2:
//___________________________________________________________________________________________________RACE MENU
					do {
						optionR = Input.integer( "\nRACES:\n"
								+   " '1' - Show all races\n"
								+   " '2' - Show race details\n"
								+   " '3' - Create a new race\n"
								+   " '4' - Remove a race\n"
								+	" '5' - Start a single race\n"
								+   " '9' - Go back\n");
						switch (optionR) {
						case 1:
							//show all races
							System.out.println("\nThese are all the races");
							rc.showRaces();
							break;
						case 2:
							//select a race by its position into the list to see more data about it
							int raceNum = Input.integer("\nInsert the number of the race you want to check\n");
							if (raceNum > 0 && raceNum <= rc.getTotalRacesList().size()) {
								rc.getTotalRacesList().get(raceNum-1).showRaceDetails(rc.getTotalRacesList().get(raceNum-1));
							}else {
								System.out.println("\nThere are no races with this number");
							}
							break;							
						case 3:
							//create new race checking if exists by its name first
							String raceName = Input.string("\nInsert the name of the new race\n");
							if(rc.findRaceByName(raceName) != null) {
								System.out.println("\nOther race with this name already exists");
							}else {
								//insert specific race data (as duration time) doing a filter by its type
								String raceType = Input.string("\nInsert the type\n" + "1.Standard\n" + "2.Elimination\n");
								if(raceType.equals("Standard")) {
									int durationTime = Input.integer("\nInsert the duration in minutes for the new race\n");
									StandardRace standardRace = new StandardRace(raceName, raceType, durationTime);
									rc.getTotalRacesList().add(standardRace);
									System.out.println("\nNew race " + standardRace.getName() + " created");
								}else if (raceType.equals("Elimination")) {
									int warmUpTime = Input.integer("\nInsert the warm up time in minutes for the new race\n");
									EliminationRace elimRace = new EliminationRace(raceName, raceType, warmUpTime);
									rc.getTotalRacesList().add(elimRace);
									System.out.println("\nNew race '" + elimRace.getName() + "' created");
								}else {
									System.out.println("\nERROR: This type of race doesn't exist");
								}
							}
							break;
						case 4:
							//show all races to pick one by its name, look for it into the list and remove it 
							System.out.println("\nThese are all the races");
							rc.showRaces();
							String delRaceName = Input.string("\nInsert the race's name you want to delete:\n");
							Race delRace = rc.findRaceByName(delRaceName);
							if(delRace!=null) {
								rc.getTotalRacesList().remove(delRace);
								System.out.println("\nThe race '" + delRaceName + "' has been removed");
							}else {
								System.out.println("\nThere are no races with this name");
							}
							break;
						case 5:				
							//show all races
							System.out.println("\nThese are all the races");
							rc.showRaces();
							//ask for race's name and check if exists
							String startRaceName = Input.string("\nInsert the race's name you want to start:\n");
							Race actualRace = rc.findRaceByName(startRaceName);
							if (rc.findRaceByName(startRaceName) == null) {
								System.out.println("This race doesn't exist");
							}else {
								actualRace.setGarageList(new ArrayList<>());								
								//show garages, select them as a list separated by ',' 
								System.out.println("\nThese are all the garages");
								rc.showGarages();
								String addGarageNames = Input.string("\nInsert the garage's name you want to add to the race:\n"
										+ "*separate them by ','\n"
										+ "if only one garage go into the race all its cars compite\n"
										+ "if more garages compite, one random car go racing\n");
								String[] items = addGarageNames.split(",");
								//check if the garages exist to add it to the list or not
								for (String i : items) {
									boolean garageError = false;
									if(rc.findGarageByName(i) == null) {
										garageError = true;
										if (garageError) {
											System.out.println("\nERROR:One or more garages you have just inserted doesn't exist\n");											
										}
									}else {
										actualRace.getGarageList().add(rc.findGarageByName(i));
									}								
								}
								//print garages in race list to check
								System.out.println("These are the garages in the race");
								for (Garage g : actualRace.getGarageList()) {
									System.out.println("-"+g.getName());
								}
								//get options to add more garages or start the race
								do {
//_____________________________________________________________________________________________START RACE MENU
									optionSR = Input.integer( "\nSTARTING RACES:\n"
											+   " '1' - Add more garages\n"
											+   " '2' - Start the race\n"
											+   " '9' - Go back\n");
									switch (optionSR) {
									case 1:
										//show garages, select them as a list separated by ',' 
										System.out.println("\nThese are all the garages into the race");
										rc.showGarages();
										String addMoreGarageNames = Input.string("\nInsert more garages:\n"
												+ "* remember separate them by ','\n");
										String[] moreGarages = addMoreGarageNames.split(",");
										//check if the garages exist to add it to the list or not
										for (String mg : moreGarages) {
											boolean garageError = false;
											if(rc.findGarageByName(mg) == null || actualRace.getGarageList().contains(rc.findGarageByName(mg))) {
												garageError = true;
												if (garageError) {
													System.out.println("\nERROR:One or more garages you have just inserted\n" 
															+"doesn't exist or are already into the race\n");											
												}
											}else {
												actualRace.getGarageList().add(rc.findGarageByName(mg));
											}								
										}
										//print garages in race list to check
										System.out.println("These are the garages in the race");
										for (Garage g : actualRace.getGarageList()) {
											System.out.println("-"+g.getName());
										}
										break;
									case 2:
										//check if there are garages into the race to start
										if (actualRace.getGarageList().size() < 1) {
											System.out.println("There are no garages to compite\n"
													+"add at least one garage to start\n");
										}else {	
											actualRace.showCarsInRace(actualRace);
											actualRace.startRace(actualRace);									
										}
										//go back to race menu
										optionSR=9;
										break;
									case 9:
										//go back to race menu
										optionR=0;
										break;
									default:
										System.out.println("\nERROR " + " Invalid value option");
										break;
									}
								}while(optionSR != 9);
								break;
							}
						case 9:
							//go back to menu
							option = 0;
							break;
						default:
							System.out.println("\nERROR " + " Invalid value option");
						}
					}while(optionR != 9);
					break;
				case 3:
//____________________________________________________________________________________________TOURNAMENTS MENU
					do {
						optionT = Input.integer( "\nTOURNAMENTS:\n"
								+   " '1' - Show all tournaments\n"
								+	" '2' - Show tournament details\n"
								+   " '3' - Create new tournament\n"
								+   " '4' - Remove a tournament\n"
								+   " '5' - Start a tournament\n"
								+   " '9' - Go back\n");
						switch (optionT) {
							case 1:
								//show all tournaments
								System.out.println("\nThese are all the tournaments");
								rc.showTours();
								break;
							case 2:
								System.out.println("\nThese are all the tournaments");
								rc.showTours();
								//select a tour by their number in list and show the details
								int tourChoosen = Input.integer("\nSelect one tournament by his number in the list\n");
								if (tourChoosen > 0 && tourChoosen <= rc.getTotalToursList().size()) {
									rc.getTotalToursList().get(tourChoosen-1).showTourDetails();												
								}else {
									System.out.println("\nERROR: Invalid value option");
								}
								break;
							case 3:
								//create new tournament checking if exists by its name first
								String tourName = Input.string("\nInsert the name of the new tournament\n");
								if(rc.findTourByName(tourName) != null) {
									System.out.println("\nOther tournament with this name already exists");
								}else {
									//create the tournament
									List<Race> tourRaceList = new ArrayList<>();
									Tournament actualTour = new Tournament(tourName, tourRaceList);
									//show all races and select them to add to the tournament
									System.out.println("\nThese are all the races" 
											+ "\ninsert the name of the races to add");
									rc.showRaces();
									//add races to the tournament
									String addRacesNames = Input.string("\nInsert the races' names you want to add to the tournament:\n"
											+ "*separate them by ','\n");
									String[] items = addRacesNames.split(",");
									//check if the garages exist to add it to the list or not
									for (String i : items) {
										boolean racesError = false;
										if(rc.findRaceByName(i) == null) {
											racesError = true;
											if (racesError) {
												System.out.println("\nERROR:One or more races you have just inserted doesn't exist\n");											
											}
										}else {
											actualTour.getRacesInTourList().add(rc.findRaceByName(i));
										}								
									}
									rc.getTotalToursList().add(actualTour);
									System.out.println("Tournament successfully created");									
								}
								
								break;
							case 4:
								//show all tournaments to pick one by its name, look for it into the list and remove it 
								System.out.println("\nThese are all the tournaments");
								rc.showTours();
								String delTourName = Input.string("\nInsert the tournament's name you want to delete:\n");
								Tournament delTour = rc.findTourByName(delTourName);
								if(delTour!=null) {
									rc.getTotalToursList().remove(delTour);
									System.out.println("\nThe tournament '" + delTourName + "' has been removed");
								}else {
									System.out.println("\nThere are no tournaments with this name");
								}
								break;
							case 5:
								//show all tournaments
								System.out.println("\nThese are all the tournaments");
								rc.showTours();
								//select a tournament by their number in list and show the cars inside
								int tourSelected = Input.integer("\nSelect one tournament by his number in the list\n");
								if (tourSelected < 0 && tourSelected >= rc.getTotalToursList().size()) {
									System.out.println("\nERROR: Invalid value option");
								}else {
									Tournament actualTour = rc.getTotalToursList().get(tourSelected-1);												
									actualTour.setGaragesInTourList(new ArrayList<>());								
									//show garages, select them as a list separated by ',' 
									System.out.println("\nThese are all the garages");
									rc.showGarages();
									actualTour.setGaragesInTourList(new ArrayList<>());								
									String addGarageNames = Input.string("\nInsert the garage's name you want to add to the race:\n"
											+ "*separate them by ','\n"
											+ "if only one garage go into the race all its cars compite\n"
											+ "if more garages compite, one random car go racing\n");
									String[] items = addGarageNames.split(",");
									//check if the garages exist to add it to the list or not
									for (String i : items) {
										boolean garageError = false;
										if(rc.findGarageByName(i) == null) {
											garageError = true;
											if (garageError) {
												System.out.println("\nERROR:One or more garages you have just inserted doesn't exist\n");											
											}
										}else {
											actualTour.getGaragesInTourList().add(rc.findGarageByName(i));
										}								
									}
									//print garages in race list to check
									System.out.println("These are the garages in the race");
									for (Garage g : actualTour.getGaragesInTourList()) {
										System.out.println("-"+g.getName());
									}
									//get options to add more garages or start the race
									do {
//_____________________________________________________________________________________________START RACE MENU
										optionST = Input.integer( "\nSTARTING RACES:\n"
												+   " '1' - Add more garages\n"
												+   " '2' - Start the tournament\n"
												+   " '9' - Go back\n");
										switch (optionST) {
										case 1:
											//show garages, select them as a list separated by ',' 
											System.out.println("\nThese are all the garages into the race");
											rc.showGarages();
											String addMoreGarageNames = Input.string("\nInsert more garages:\n"
													+ "* remember separate them by ','\n");
											String[] moreGarages = addMoreGarageNames.split(",");
											//check if the garages exist to add it to the list or not
											for (String mg : moreGarages) {
												boolean garageError = false;
												if(rc.findGarageByName(mg) == null || actualTour.getGaragesInTourList().contains(rc.findGarageByName(mg))) {
													garageError = true;
													if (garageError) {
														System.out.println("\nERROR:One or more garages you have just inserted\n" 
																+"doesn't exist or are already into the race\n");											
													}
												}else {
													actualTour.getGaragesInTourList().add(rc.findGarageByName(mg));
												}								
											}
											//print garages in race list to check
											System.out.println("These are the garages in the race");
											for (Garage g : actualTour.getGaragesInTourList()) {
												System.out.println("-"+g.getName());
											}
											break;
										case 2:
											//check if there are garages into the race to start
											if (actualTour.getGaragesInTourList().isEmpty()) {
												System.out.println("There are no garages to compite\n"
														+"add at least one garage to start\n");
											}else {	
												System.out.println("EMPIEZA EL TORNEO");
												actualTour.startTournament(actualTour.getGaragesInTourList());									
											}
											//go back to race menu
											optionST=9;
											break;
										case 9:
											//go back to race menu
											optionT=0;
											break;
										default:
											System.out.println("\nERROR " + " Invalid value option");
											break;
										}
									}while(optionST != 9);
									break;
								}
								break;
							case 9:
								//go back to menu
								option = 0;
								break;
							default:
								System.out.println("\nERROR " + " Invalid value option");
							}
					}while(optionT !=9 );
					break;
				case 9:
					break;
				default:
					System.out.println("ERROR\n" + "Invalid value option");
			}
		}while(option != 9);
	}
}
