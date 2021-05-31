//Package
package units;
//Libraries  
import java.util.*;

public class Army 
{
    // Instance variables 
	private Status currentStatus = Status.IDLE;
    private ArrayList <Unit> units;
    private int distancetoTarget = -1;
    private String target = "";
    private String currentLocation;
    private final int maxToHold = 10 ;
    
    //Constructors 
    public Army(String currentLocation) 
    {
    	this.currentLocation= currentLocation;
    	units = new ArrayList<Unit>();
    }
    
    //Army Getters
    public Status  getCurrentStatus()
     {
      return this.currentStatus;
     }
    public ArrayList<Unit> getUnits()
     {
      return this.units;
     }
    public int  getDistancetoTarget() 
     {
      return this.distancetoTarget;
     }
	public String getTarget() 
	 {
	  return this.target;
	 }
	public String getCurrentLocation() 
	 {
	  return this.currentLocation;
	 }
    public int getMaxToHold()
     {
      return this.maxToHold;
     }
    
    //Army setters
    public void setCurrentStatus (Status currentStatus) 
     {
      this.currentStatus= currentStatus;
     }
    public void setUnits (ArrayList<Unit> units) 
     {
      this.units =units;
     }
    public void setDistancetoTarge (int distancetoTarget)
     {
      this.distancetoTarget = distancetoTarget;
     }
    public void setTarget(String target)
     {
      this.target = target;
     }
    public void setCurrentLocation(String currentLocation)
     {
      this.currentLocation = currentLocation;
     }
    //Additional methods
    public void addUnit(String type, int level) 
    {
    Unit unit_specs = null;
	switch(type) 
	 {
		case "Archer":
			switch(level)
			{
				case 1: unit_specs = new Archer(1,60,0.4,0.5,0.6);break;
				case 2: unit_specs = new Archer(2,60,0.4,0.5,0.6);break;
				case 3: unit_specs = new Archer(3,70,0.5,0.6,0.7);break;
				default: System.out.print("Invalid unit level entered");break;
			}
			break;
	
		case "Infantry":
			switch(level)
			{
				case 1: unit_specs = new Infantry(1,50,0.5,0.6,0.7);break;
				case 2: unit_specs = new Infantry(2,50,0.5,0.6,0.7);break;
				case 3: unit_specs = new Infantry(3,60,0.6,0.7,0.8);break;
				default: System.out.print("Invalid unit level entered");break;
			}
			break;
		
		case "Cavalry":
			switch(level) 
			{
				case 1: unit_specs = new Cavalry(1,40,0.6,0.7,0.75);break;
				case 2: unit_specs = new Cavalry(2,40,0.6,0.7,0.75);break;
				case 3: unit_specs = new Cavalry(3,60,0.7,0.8,0.9);break;
				default: System.out.print("Invalid unit level entered");break;
			} 
			break;
		default: System.out.print("Invalid unit type entered");break;	
	 }
		units.add(unit_specs);
	}    
}