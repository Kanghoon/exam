package com.nhnent.model;

public enum GradeType {
	A("A?숈젏", 90, 100),
	B("B?숈젏", 80, 89),
	C("C?숈젏", 70, 79),
	D("D?숈젏", 60, 69),
	F("F?숈젏", 0, 59);
	
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
	
	public static GradeType getGradeType(long score) {
		
		for (GradeType type : GradeType.values()) {
			
			if (score >= type.lowScore && score <= type.highScore) {
				return type;
			}
		}
		return F;
	}
}