package raceControl;

import java.util.List;
import java.util.Random;

public class Garage {
	private String name;
	private List<Car> carList;

//CONST
	public Garage(String name) {
		this.name = name;
	}
	
	public Garage(String name, List<Car> carList) {
		this.name = name;
		this.carList = carList;
	}
	
//GET N SET
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Car> getCarList() {
		return carList;
	}
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
	
	
//METHODS
	public Car selectRandomCar() {	       
	    int carIndex = new Random().nextInt(this.carList.size());
		Car randomCar = this.carList.get(carIndex);   
		return randomCar;
	}
	
	public void showCars() {
		if (this.getCarList() == null) {
			System.out.println("This garage has no cars yet");
		}else {
			System.out.println("\n"+this.name+" Garage");
			int num = 1;
			for (Car c : this.getCarList()) {
				System.out.println(num + "." + c.getBrand() + " " + c.getModel());
				num++;			
			}
		}
	}
	
	public void createGarage(List<Garage> totalGaragesList ) {
		if(!totalGaragesList.contains(this)){
			totalGaragesList.add(this);
			System.out.println("You have just created a new garage: " + this.name);
		}else {
			System.out.println("This garage already exists");
		}
	}
	
	public Car findCarByModel ( String model) {
		Car carFind = null;
		for (Car car : this.getCarList()) {
			if (car.getModel().equals(model)) {
				carFind = car;
			}
		}
		return carFind;
	}
}
