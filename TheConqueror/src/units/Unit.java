//Package
package units;

abstract public class Unit 
{
    //Instance Variables 
	private int level ; 
    private int maxSoldierCount ;
    private int currentSoldierCount;
    private double idleUpkeep;
    private double marchingUpkeep;
    private double siegeUpkeep;
    
    //Constructors
    public Unit() 
     {    	
     }
    public Unit(int level ,int maxSoldierCount, double idleUpKeep, double marchingUpKeep,double siegeUpkeep)
     {
      this.level=level;
      this.maxSoldierCount= maxSoldierCount;
      this.idleUpkeep = idleUpKeep;
      this.marchingUpkeep = marchingUpKeep;
      this.siegeUpkeep = siegeUpkeep;	
     }
    // Unit Getters 
    public int  getLevel() 
     {
      return this.level;
     }
    public int  getMaxSoldierCount() 
     {
      return this.maxSoldierCount;
     }
    public int  getCurrentSoldierCount() 
     {
      return this.currentSoldierCount;
     }
    public double getIdleUpkeep() 
     {
      return this.idleUpkeep;
     }
    public double getMarchingUpkeep() 
     {
      return this.marchingUpkeep;
     }
    public double getSiegeUpkeep()
     {
      return this.siegeUpkeep;
     }

    // Unit Setters
    public void setCurrentSoldierCount(int currentSoldierCount)
     {
      this.currentSoldierCount = currentSoldierCount ;
     }
}
