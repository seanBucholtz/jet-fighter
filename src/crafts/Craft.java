/**
 * 
 */
package crafts;

/**
 * @author seanbucholtz
 *
 */
public interface Craft {
	
	public int getcoordX();
	
	public void setcoordX(int coordX);
	
	public int getcoordY();
	
	public void setcoordY(int coordY);
	
	public int getDirection();
	
	public void setDirection(int direction);
	
	public double getMaxVelocity();
	
	public void setMaxVelocity();
	
	public double getVelocity();
	
	public void setVelocity(double velocity);
	
	public double getInitHealth();
	
	public void setInitHealth(double maxHealth);
	
	public double getHealth();
	
	public void setHealth(double health);

}
