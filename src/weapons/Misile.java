/**
 * 
 */
package weapons;

/**
 * @author seanbucholtz
 *
 */
public interface Misile extends Projectile {

	public int[] getDynamicPath();
	
	public void setDynamicPath(int[] dynamicPath);
}
