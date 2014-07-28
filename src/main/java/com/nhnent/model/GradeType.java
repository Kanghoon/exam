package com.nhnent.model;

public enum GradeType {
	A("A학점", 90, 100),
	B("B학점", 80, 89),
	C("C학점", 70, 79),
	D("D학점", 60, 69),
	F("F학점", 0, 59);
	
	private String description;
	private long lowScore;
	private long highScore;
	
	private GradeType(String description, long lowScore, long highScore) {
		this.description = description;
		this.lowScore = lowScore;
		this.highScore = highScore;
	}
	
	public String getDescription() {
		return description;
	}
	
	public long getHighScore() {
		return highScore;
	}
	
	public long getLowScore() {
		return lowScore;
	}
}