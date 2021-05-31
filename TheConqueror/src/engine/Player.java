//Package
package engine;
//Libraries 
import java.util.*;
import units.*;
public class Player 
{
    //instance variables 
	private String name;
	private ArrayList<City> controlledCities;
	private ArrayList<Army> controlledArmies;
	private double treasury;
	private double food;
	
	// constructor
	public Player(String name){ 
		this.name = name;
		controlledCities = new ArrayList<City>();
		controlledArmies = new ArrayList<Army>();
		treasury = 0.0;
		food = 0.0;
		
	}
	
	//player getters
	public String getName() {
		return this.name;
	}
	public ArrayList<City> getControlledCities() {
		return this.controlledCities;
	}
	public ArrayList<Army> getControlledArmies() {
		return this.controlledArmies;
	}
	public double getTreasury() {
		return this.treasury;
	}
	public double getFood() {
		return this.food;
	}
	
	//Player Setters
	public void setTreasury(double treasury) {
		this.treasury = treasury;
	}
	public void setFood(double food) {
		this.food = food;
	}
}