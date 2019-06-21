package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
	// VacuumCleaner : POWER_CONSUMPTION=100, FILTER_TYPE=A, BAG_TYPE=A2, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=3000, CLEANING_WIDTH=20
	private int powerConsumption;
	private char filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private int cleaningWidth;
	
	public VacuumCleaner(String name,int powerConsumption,char filterType,String bagType,
			String wandType,int motorSpeedRegulation,int cleaningWidth) {
		super(name);
		this.powerConsumption=powerConsumption;
		this.filterType=filterType;
		this.bagType=bagType;
		this.wandType=wandType;
		this.motorSpeedRegulation=motorSpeedRegulation;
		this.cleaningWidth=cleaningWidth;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public char getFilterType() {
		return filterType;
	}

	public void setFilterType(char filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public int getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public String toString() {
		return "VacuumCleaner [powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}
	
	
}
