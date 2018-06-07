package transports.air;

public class FlyingTaxi extends AirTransport {
	private int koefCost;

	public FlyingTaxi(double speed, double cost, String name, double heghtFly, int koefCost) {
		super(speed, cost, name, heghtFly);
		this.koefCost = koefCost;
	}


	public int getKoefCost() {
		return koefCost;
	}

	public void setKoefCost(int namberLicensia) {
		this.koefCost = koefCost;
	}

	@Override
	public double getCost() {
		return cost * koefCost;
	}

}
