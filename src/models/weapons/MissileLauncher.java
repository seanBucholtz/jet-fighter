/**
 * 
 */
package models.weapons;

/**
 * @author seanbucholtz
 *
 */
public interface MissileLauncher extends Launcher<Missile> {
	
	public int getNumMissiles();
	
	public void setNumMissiles();
	
	public Missile[] getMissles();
	
	public void setMissiles(Missile[] missiles);

}
