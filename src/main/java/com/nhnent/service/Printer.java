package com.nhnent.service;

import com.nhnent.model.GradeType;

public class Printer {

	/**
	 * 학점을 콘솔에 출력한다.
	 *
	 * @param type the type
	 */
	public void printGrade(GradeType type) {
		System.out.println("당신의 학점은 " + type.getDescription() + "입니다.");
	}
}
