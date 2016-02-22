/**
 * 
 */
package weapons;

/**
 * @author seanbucholtz
 *
 */
public interface Bullet extends Projectile {

	public int[] getStaticPath();
	
	public void setStaticPath(int[] staticPath);
}
