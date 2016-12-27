package org.noodle.domain;

public class RankVO {

	private String name;
	private int year;
	private int rank;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "RankVO [name=" + name + ", year=" + year + ", rank=" + rank + "]";
	}

}
