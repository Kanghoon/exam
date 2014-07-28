package com.nhnent.service;

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
}
