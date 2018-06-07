package transports.air;

import transports.AbstractTransport;

public abstract class AirTransport extends AbstractTransport {
	protected double heghtFly;
	
	public AirTransport(double speed, double cost, String name, double heghtFly) {
		super(speed, cost, name);
		this.heghtFly = heghtFly;
	}

	public double getHeghtFly() {
		return heghtFly;
	}

	public void setHeghtFly(double heghtFly) {
		this.heghtFly = heghtFly;
	}
	
	public abstract double getCost();

}
