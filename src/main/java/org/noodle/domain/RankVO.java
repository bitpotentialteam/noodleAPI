package org.noodle.domain;

public class RankVO {

	private int year;
	private int rank;
	
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
		return "RankVO [year=" + year + ", rank=" + rank + "]";
	}
	
	
}
