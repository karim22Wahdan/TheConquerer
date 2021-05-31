//Package
package buildings;

abstract public class Building 
{
    //instance variables  
	private int cost;
    private int level;
	private int upgradeCost;
    private boolean coolDown;
 
    //constructors
    public Building() 
     {	
     }
    public Building (int cost , int upgradeCost )
     {
      this.cost = cost;
      this.upgradeCost = upgradeCost;
      level =1;
      coolDown=true;
     } 

    // Building Getters
    public int getCost() 
    {
     return this.cost;
    }
    public int getLevel()
     {
      return this.level;
     }
    public int getUpgradeCost()
     {
      return this.upgradeCost;
     }
    public boolean isCoolDown() 
     {
      return this.coolDown;
     }
    
    // Building Setters 
    public void setLevel(int level) 
     {
      this.level = level;
     }
    public void setUpgradeLevel(int upgradeCost) 
     {
      this.upgradeCost = upgradeCost;
     }
    public void setCoolDown(boolean coolDown) 
     {
      this.coolDown =coolDown;
     }
    }