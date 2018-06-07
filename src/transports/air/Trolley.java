package transports.air;

public class Trolley extends AirTransport{
	private int numberRopes;
	
	public Trolley(double speed, double cost, String name, double heghtFly, int numberRopes) {
		super(speed, cost, name, heghtFly);
		this.numberRopes = numberRopes;
	}

	public int getNumberRopes() {
		return numberRopes;
	}

	public void setNumberRopes(int numberRopes) {
		this.numberRopes = numberRopes;
	}

	@Override
	public double getCost() {
		return cost * numberRopes/2;
	}
	

}
