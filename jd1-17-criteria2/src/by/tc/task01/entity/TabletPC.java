package by.tc.task01.entity;

public class TabletPC extends Appliance{
	// TabletPC : BATTERY_CAPACITY=3, DISPLAY_INCHES=14, MEMORY_ROM=8000, FLASH_MEMORY_CAPACITY=2, COLOR=blue
	private int batteryCapacity;
	private int displayInches;
	private int memoryRom;
	private int flashMemoryCapacity;
	private String color;
	
	public TabletPC(String name,int batteryCapacity,int displayInches,int memoryRom,int flashMemoryCapacity,
					String color) {
		super(name);
		this.batteryCapacity=batteryCapacity;
		this.displayInches=displayInches;
		this.memoryRom=memoryRom;
		this.flashMemoryCapacity=flashMemoryCapacity;
		this.color=color;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryRom="
				+ memoryRom + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}
	
	
}
