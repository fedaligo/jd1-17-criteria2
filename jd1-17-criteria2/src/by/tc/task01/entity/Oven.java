package by.tc.task01.entity;

public class Oven extends Appliance{
	// Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5;
	private int powerConsumption;
	private int weight;
	private int capacity;
	private int depth;
	private double height;
	private double width;
	
	public Oven(String name,int powerConsumption,int weight,int capacity,int depth,double height,double width) {
		super(name);
		this.powerConsumption=powerConsumption;
		this.weight=weight;
		this.capacity=capacity;
		this.depth=depth;
		this.height=height;
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Oven [powerConsumption=" + powerConsumption + ", weight=" + weight + ", capacity=" + capacity
				+ ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
	}
	
	
}
