package transports.undeground;

public class Undeground extends UndegraundTransport {
	private int numberCarriage;

	public Undeground(double speed, double cost, String name, double depthBelowGraund, int numberCarriage) {
		super(speed, cost, name, depthBelowGraund);
		this.numberCarriage = numberCarriage;
	}

	public int getNumberCarriage() {
		return numberCarriage;
	}

	public void setNumberCarriage(int numberCarriage) {
		this.numberCarriage = numberCarriage;
	}

	@Override
	public double getCost() {
		return cost * 100 / numberCarriage ;
	}

}
