package models.weapons;

public interface Projectile {

public int getcoordX();
	
	public void setcoordX(int coordX);
	
	public int getcoordY();
	
	public void setcoordY(int coordY);
	
	public double getMaxVelocity();
	
	public void setMaxVelocity();
	
	public double getDamage();
	
	public void setDamage(double damage);
}
