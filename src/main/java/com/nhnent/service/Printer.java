/*
 * @(#) Printer.java 2014. 7. 31 
 *
 * Copyright 2014 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.nhnent.service;

import com.nhnent.model.GradeType;

/**
 * @author Kanghoon Choi
 */
public class Printer {

	/**
	 * 학점을 콘솔에 출력한다.
	 *
	 * @param type the type
	 */
	public void printGrade(GradeType type) {
		System.out.println("당신의 학점은 " + type.getDescription() + "입니다.");
	}
	
	/**
	 * 총점과 평균학점을 출력한다.
	 *
	 * @param totalScore the total score
	 * @param type the type
	 */
	public void printAverageGrade(int totalScore, GradeType type) {
		System.out.println("당신의 총점은 " + totalScore + "점이며, 평균 학점은 " + type.getDescription() + "입니다.");
	}
}
