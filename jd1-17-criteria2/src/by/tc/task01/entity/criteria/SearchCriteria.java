package by.tc.task01.entity.criteria;

public final class SearchCriteria {
	private Oven oven;
	private Laptop laptop;
	private Refrigerator refrigerator;
	private VacuumCleaner vacuumCleaner;
	private TabletPC tabletPC;
	private Speakers speakers;

	public static enum Oven{
		POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
		//public Oven
	}
	
	public static enum Laptop{
		BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS
	}
	
	public static enum Refrigerator{
		POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
	}
	
	public static enum VacuumCleaner{
		
		
		POWER_CONSUMPTION("POWER_CONSUMPTION"), FILTER_TYPE("FILTER_TYPE"), BAG_TYPE("BAG_TYPE"), 
		WAND_TYPE("WAND_TYPE"), MOTOR_SPEED_REGULATION("MOTOR_SPEED_REGULATION"), CLEANING_WIDTH("v");
		final String string;
		VacuumCleaner(String string){
			this.string = string;
		}
		public String getString() {
			return string;
		}
		
	}
	
	public static enum TabletPC{
		BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR		
	}
	
	public static enum Speakers{
		POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
	}
	
	private SearchCriteria() {}

	public Oven getOven() {
		return oven;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public Refrigerator getRefrigerator() {
		return refrigerator;
	}

	public VacuumCleaner getVacuumCleaner() {
		return vacuumCleaner;
	}

	public TabletPC getTabletPC() {
		return tabletPC;
	}

	public Speakers getSpeakers() {
		return speakers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((laptop == null) ? 0 : laptop.hashCode());
		result = prime * result + ((oven == null) ? 0 : oven.hashCode());
		result = prime * result
				+ ((refrigerator == null) ? 0 : refrigerator.hashCode());
		result = prime * result
				+ ((speakers == null) ? 0 : speakers.hashCode());
		result = prime * result
				+ ((tabletPC == null) ? 0 : tabletPC.hashCode());
		result = prime * result
				+ ((vacuumCleaner == null) ? 0 : vacuumCleaner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SearchCriteria other = (SearchCriteria) obj;
		if (laptop != other.laptop)
			return false;
		if (oven != other.oven)
			return false;
		if (refrigerator != other.refrigerator)
			return false;
		if (speakers != other.speakers)
			return false;
		if (tabletPC != other.tabletPC)
			return false;
		if (vacuumCleaner != other.vacuumCleaner)
			return false;
		return true;
	}
	
	
}

