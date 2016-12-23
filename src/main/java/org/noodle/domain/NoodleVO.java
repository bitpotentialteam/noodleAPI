package org.noodle.domain;

import java.util.Date;

public class NoodleVO {

	// tbl_noodle
	private String name;
	private String brand;
	private String thumbnail;
	private int weight;
	private String soupColor;
	private Date regdate;
	private int releaseDate;
	private String noodleType;
	private String type;
	private Date updatedate;
	
	// tbl_nutrition
	private int calories;
	private int carbohydrate;
	private int protein;
	private int fat;
	private int saturatedFat;
	private int transFat;
	private int cholesterol;
	private int natrium;
	
	//tbl_material
	private String material_noodle;
	private String material_powder;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getSoupColor() {
		return soupColor;
	}
	public void setSoupColor(String soupColor) {
		this.soupColor = soupColor;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getNoodleType() {
		return noodleType;
	}
	public void setNoodleType(String noodleType) {
		this.noodleType = noodleType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getCarbohydrate() {
		return carbohydrate;
	}
	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	public int getProtein() {
		return protein;
	}
	public void setProtein(int protein) {
		this.protein = protein;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getSaturatedFat() {
		return saturatedFat;
	}
	public void setSaturatedFat(int saturatedFat) {
		this.saturatedFat = saturatedFat;
	}
	public int getTransFat() {
		return transFat;
	}
	public void setTransFat(int transFat) {
		this.transFat = transFat;
	}
	public int getCholesterol() {
		return cholesterol;
	}
	public void setCholesterol(int cholesterol) {
		this.cholesterol = cholesterol;
	}
	public int getNatrium() {
		return natrium;
	}
	public void setNatrium(int natrium) {
		this.natrium = natrium;
	}
	public String getMaterial_noodle() {
		return material_noodle;
	}
	public void setMaterial_noodle(String material_noodle) {
		this.material_noodle = material_noodle;
	}
	public String getMaterial_powder() {
		return material_powder;
	}
	public void setMaterial_powder(String material_powder) {
		this.material_powder = material_powder;
	}
	@Override
	public String toString() {
		return "NoodleVO [name=" + name + ", brand=" + brand + ", thumbnail=" + thumbnail + ", weight=" + weight
				+ ", soupColor=" + soupColor + ", regdate=" + regdate + ", releaseDate=" + releaseDate + ", noodleType="
				+ noodleType + ", type=" + type + ", updatedate=" + updatedate + ", calories=" + calories
				+ ", carbohydrate=" + carbohydrate + ", protein=" + protein + ", fat=" + fat + ", saturatedFat="
				+ saturatedFat + ", transFat=" + transFat + ", cholesterol=" + cholesterol + ", natrium=" + natrium
				+ ", material_noodle=" + material_noodle + ", material_powder=" + material_powder + "]";
	}

	

	
	   
	  
	
}
