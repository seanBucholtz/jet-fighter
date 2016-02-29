/**
 * 
 */
package models.weapons;

/**
 * @author seanbucholtz
 *
 */
public interface Missile extends Projectile {

	public int[] getDynamicPath();
	
	public void setDynamicPath(int[] dynamicPath);
}
