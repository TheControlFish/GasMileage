public class Automobile {
	private int mpg;
	private double gallons;
	public Automobile(int m){
		mpg = m;
		gallons = 0;
	}
	public void fillUp(double amount){
		gallons += amount;
	}
	public void takeTrip(double distance){
		gallons -= distance / mpg;
	}
	public double reportFuel(){
		return gallons;
	}
}
