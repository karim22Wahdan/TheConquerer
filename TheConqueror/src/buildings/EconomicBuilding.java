//Package
package buildings;

abstract public class EconomicBuilding extends Building
{
	//Constructors
	public EconomicBuilding() 
	 {
	 }
    public EconomicBuilding(int cost, int upgradeCost) 
	 {
	  super(cost,upgradeCost);
	 }
}