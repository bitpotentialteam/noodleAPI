package org.noodle.domain;

public class RecipeVO {

	private int num;
	private int water;
	private int minutes;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	@Override
	public String toString() {
		return "RecipeVO [num=" + num + ", water=" + water + ", minutes=" + minutes + "]";
	}
	
	
}
