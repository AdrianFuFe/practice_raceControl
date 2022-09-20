package raceControl;

import java.util.List;

public class Car {
	private static final int MAX_SPEED = 250;
	private static final int MIN_SPEED = 100;
	private int speed;
	private double distance;
	private int points;

	private String brand;
	private String model;
	private String garage;

//CONST
	public Car(String brand, String model, String garage) {
		this.brand = brand;
		this.model = model;
		this.garage = garage;
	}

//GET N SET

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getGarage() {
		return garage;
	}
	public void setGarage(String garage) {
		this.garage = garage;
	}

//METHODS
	public void createCar(List<Car> carList) {
		if (!carList.contains(this)) {
			carList.add(this);
			System.out.println("You have just created a new car: " + this.brand + " " + this.model);
		} else {
			System.out.println("This car already exists");
		}
	}

	public void changeSpeed() {
		//increase the speed to the limit MIN_SPEED
		if( this.getSpeed() <= MIN_SPEED ) {
			this.setSpeed(this.getSpeed()+20);
		}else {			
			//when the cars reach the MIN_SPEED get random number to decide if the car go faster or slower and change the speed
			double randomNum = Math.random();
			if (randomNum < 0.5) {
				if (this.speed >= MIN_SPEED) {
					this.setSpeed(this.getSpeed()-10);					
				}
			} else {
				if (this.speed < MAX_SPEED) {
					this.setSpeed(this.getSpeed()+10);
				}
			}
		}
	}

	public void getDistancePerMinute() {
		double nextDistance = this.getDistance() + this.getSpeed() / 60.00;
		this.setDistance(nextDistance);
	}
}
