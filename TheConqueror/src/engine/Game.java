//Package 
package  engine;
//Libraries
import java.io.IOException; 
import java.util.*;
import java.io.*;
import units.*;
public class Game 
{   
	//instance Variables 
	private Player player;
	private ArrayList<City> availableCities;
	private ArrayList<Distance> distances ;
	private final int maxTurnCount =30;
	private int currentTurnCount=1;
	
	//Constructor
	public Game(String playerName,String playerCity) throws IOException
	 {
      player = new Player(playerName);
      availableCities = new ArrayList<City>();
      distances = new ArrayList<Distance>();  
      this.loadCitiesAndDistances();
      // Initializing the defending cities armies and adding the player city to his controlled cities 
      for(City c : availableCities )
        {
    	  if((c.getName().equals(playerCity))) 
    	   {
    	    player.getControlledCities().add(c);
    	   }
    	  else 
    	   {
    	    String s = c.getName().toLowerCase()+"_army.csv";
    		this.loadArmy(c.getName(), s);
    	   }
       } 
	  } 
    
	// Game Getters 
	public Player getPlayer() 
	 {
	  return player;
	 }
	public int getCurrentTurnCount() 
	 {
	  return currentTurnCount;
	 }
	public ArrayList<City> getAvailableCities()
	 {
	  return availableCities;
	 }
	public ArrayList<Distance> getDistances() 
     {
	  return distances;
	 }
	public int getMaxTurnCount() 
	 {
	  return maxTurnCount;
	 }
	// Game Setters
	public void setPlayer(Player player)
     {
	  this.player = player;
	 }	
	public void setCurrentTurnCount(int currentTurnCount) 
     {
	  this.currentTurnCount = currentTurnCount;
	 }
	//reading methods
	
	//Loader Methods
	private void loadCitiesAndDistances() throws IOException 
	 {
		String currentLine = "";
		FileReader fileReader= new FileReader("distances.csv");
		BufferedReader br = new BufferedReader(fileReader);
		//looping through the CSV file
		while ((currentLine = br.readLine()) != null) 
		 {  
		   //Filing the distances array
		   String s [] = currentLine.split(",");
	       this.distances.add(new Distance(s[0],s[1],Integer.parseInt(s[2])));
	       //finding if a city exist in the availableCities ArrayList 
	       boolean found1 =false;
	       boolean found2 = false;
	       for (City c : availableCities) {
	    	   if (s[0].equals(c.getName())) {
	    		   found1=true;
	    	   }
	    	   if (s[1].equals(c.getName())) {
	    		   found2 = true;
	    	   }   
	       }
	       //Adding  the non Existing cities to the avaliableCities arrayList
	       if(!found1)
	       {
	    	   this.availableCities.add(new City(s[0]));
	       }
	      if (!found2 && !(s[0].equals(s[1])))
	      {
	    	  availableCities.add(new City(s[1])); 
	      }
	     }
		br.close();
		}	
	public void loadArmy(String cityName,String path) throws IOException
	{
		String currentLine = "";
		FileReader fileReader= new FileReader(path);
		BufferedReader br = new BufferedReader(fileReader);
		City city = null ;
		//Getting the desired city with the name value inside cityName
		for (City c : this.availableCities) {
			if(c.getName().equals(cityName)) 
			{
				city= c;
				break;
			}	
		}
		// defensive programming against invalid cityName input
		if(city == null) {
			System.out.print("Invalid cityName entered");
			br.close();
			return;
		}
		// creating an empty army to fill with the desired units from the CSV file required
		Army army = new Army(cityName);
		//looping through the CSV file
		while ((currentLine = br.readLine()) != null) {
			String s [] = currentLine.split(",");
			army.addUnit(s[0],Integer.parseInt(s[1]));
			
		}
		city.setDefendingArmy(army);
	br.close();	
	}
	
 	
}