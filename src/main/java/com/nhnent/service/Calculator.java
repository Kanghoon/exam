package com.nhnent.service;

import java.util.List;

import com.nhnent.model.GradeType;

public class Calculator {

	public GradeType calculate(int score) {

		for (GradeType type : GradeType.values()) {

			if (score >= type.getLowScore() && score <= type.getHighScore()) {
				return type;
			}
		}
		return GradeType.F;
	}

	public int getTotalScore(List<Integer> list) {

		
		
		return 538;
	}
}
