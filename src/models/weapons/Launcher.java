package models.weapons;

public interface Launcher<E> {
	
	public int getRateOfFire();
	
	public void setRateOfFire(int rateOfFire);
	
	public int getCapacity();
	
	public void setCapacity(int capacity);
}
