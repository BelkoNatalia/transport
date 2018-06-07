package transports.groun;

public class SunnyBus extends GroundTransport{
	private int numberSolarBattery;

	public SunnyBus(double speed, double cost, String name, String typeRoad, int numberSolarBattery) {
		super(speed, cost, name, typeRoad);
		this.numberSolarBattery = numberSolarBattery;
	}

	public int getNumberSolarBattery() {
		return numberSolarBattery;
	}

	public void setNumberSolarBattery(int numberSolarBattery) {
		this.numberSolarBattery = numberSolarBattery;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cost * 0.1 * numberSolarBattery;
	}
	
	
	

}
