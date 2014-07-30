/*
 * @(#) MainTest.java 2014. 7. 31 
 *
 * Copyright 2014 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.nhnent.service;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.nhnent.model.GradeType;

/**
 *
 * @author Kanghoon Choi
 */
public class MainTest {
	
	/**
	 * 통합 테스트
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testIntegrate() throws Exception {
		Calculator calculator = new Calculator();
		Printer printer = new Printer();
		
		List<Integer> list = Arrays.asList(97, 80, 78, 86, 98, 99);
		
		for (int score : list) {
			GradeType gradeType = calculator.calculate(score);
			printer.printGrade(gradeType);
		}
		
		int totalScore = calculator.getTotalScore(list);
		int averageScore = calculator.getAverageScore(list);
		
		printer.printAverageGrade(totalScore, calculator.calculate(averageScore));
	}
}
