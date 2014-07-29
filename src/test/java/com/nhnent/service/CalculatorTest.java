package com.nhnent.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.nhnent.model.GradeType;

/**
 * @author Kanghoon Choi
 */
public class CalculatorTest {
	
	private Calculator calculator = new Calculator();

	/**
	 * Test calculate_90점_이상이면_ a를_받는다.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCalculate_90점_이상이면_A를_받는다() throws Exception {
		GradeType actual = calculator.calculate(96);
		assertEquals(GradeType.A, actual);
	}
	
	/**
	 * Test calculate_80점에서_90점_사이면_ b를_받는다.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCalculate_80점에서_90점_사이면_B를_받는다() throws Exception {
		GradeType actual = calculator.calculate(85);
		assertEquals(GradeType.B, actual);
	}

	/**
	 * Test calculate_60점_이하이면_ f를_받는다.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCalculate_60점_이하이면_F를_받는다() throws Exception {
		GradeType actual = calculator.calculate(50);
		assertEquals(GradeType.F, actual);
	}
	
	/**
	 * Test get total score_리스트형태로_학점을_받으면_총점을_반환한다.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testGetTotalScore_리스트형태로_학점을_받으면_총점을_반환한다() throws Exception {
		int expected = 538;
		
		List<Integer> list = Arrays.asList(97, 80, 78, 86, 98, 99);
		int actual = calculator.getTotalScore(list);
		
		assertEquals(expected, actual);
	}

}
