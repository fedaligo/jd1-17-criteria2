package by.tc.task01.entity;

public class Refrigerator extends Appliance{
	// Refrigerator : POWER_CONSUMPTION=100, WEIGHT=20, FREEZER_CAPACITY=10, OVERALL_CAPACITY=300, HEIGHT=200, WIDTH=70
	private int powerConsumption;
	private int weight;
	private int freezerCapacity;
	private int overallCapacity;
	private int hight;
	private int width;
	
	public Refrigerator(String name,int powerConsumption,int weight,int freezerCapacity,int overallCapacity,
						int hight,int width) {
		super(name);
		this.powerConsumption=powerConsumption;
		this.weight=weight;
		this.freezerCapacity=freezerCapacity;
		this.overallCapacity=overallCapacity;
		this.hight=hight;
		this.width=width;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public int getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(int overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", hight=" + hight + ", width=" + width
				+ "]";
	}
	
	
}
