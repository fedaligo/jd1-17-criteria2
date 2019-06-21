package by.tc.task01.entity;

import java.util.Arrays;

public class Speakers extends Appliance{
	// Speakers : POWER_CONSUMPTION=15, NUMBER_OF_SPEAKERS=2, FREQUENCY_RANGE=2-4, CORD_LENGTH=2
	private int powerConsumption;
	private int numberOfSpeakers;
	private int[]freauencyRange;
	private int cordLength;
	
	public Speakers(String name,int powerConsumption,int numberOfSpeakers,int[]freauencyRange,int cordLength) {
		super(name);
		this.powerConsumption=powerConsumption;
		this.numberOfSpeakers=numberOfSpeakers;
		this.freauencyRange=freauencyRange;
		this.cordLength=cordLength;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public int[] getFreauencyRange() {
		return freauencyRange;
	}

	public void setFreauencyRange(int[] freauencyRange) {
		this.freauencyRange = freauencyRange;
	}

	public int getCordLength() {
		return cordLength;
	}

	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", freauencyRange=" + Arrays.toString(freauencyRange) + ", cordLength=" + cordLength + "]";
	}
	
	
}
