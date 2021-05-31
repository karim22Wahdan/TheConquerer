//Package
package engine;
//Libraries 
import java.util.*;
import buildings.*;
import units.*;
//Class
public class City 
{
	//Instance variables
    private String name ;
    private ArrayList<EconomicBuilding> economicalBuildings;
    private ArrayList<MilitaryBuilding> militaryBuildings;
    private Army defendingArmy;
    private int turnsUnderSiege;
    private boolean underSiege=false;	
    //Constructors
    public City(String name) 
     {
	  this.name=name; 
	  economicalBuildings = new ArrayList<EconomicBuilding>();
      militaryBuildings = new ArrayList<MilitaryBuilding>();
	 // defendingArmy = null; 
	 }
	//City getters
	public String getName()
	 {
	  return this.name;
	 }

	public ArrayList<EconomicBuilding> getEconomicalBuildings() 
	 {
	  return this.economicalBuildings ;
	 }
	public ArrayList<MilitaryBuilding> getMilitaryBuilding() 
	 {
	  return this.militaryBuildings ;
	 }
	public Army getDefendingArmy() 
	 {
	  return this.defendingArmy;
	 }
	public int getTurnsUnderSiege() 
	 {
	  return this.turnsUnderSiege;
	 } 
	public boolean isUnderSiege() 
	 {
	  return this.underSiege;
	 }
	//City Setters
	public void setDefendingArmy(Army defendingArmy) 
	 {
	  this.defendingArmy =defendingArmy;
	 }
	public void setTurnsUnderSiege(int turnsUnderSiege) 
	 {
	  this.turnsUnderSiege =turnsUnderSiege;
	 }
	public void setUnderSiege(boolean underSiege) 
	 {
	  this.underSiege =underSiege;
	 }
}