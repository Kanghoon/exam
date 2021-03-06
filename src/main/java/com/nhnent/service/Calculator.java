package com.nhnent.service;

import java.util.List;

import com.nhnent.model.GradeType;

/**
 * 학점계산기
 *
 * @author Kanghoon Choi
 */
public class Calculator {

	/**
	 * 점수를 입력받아 등급타입(GradeType)을 반환합니다.
	 *
	 * @param 학점
	 * @return 등급타입
	 */
	public GradeType calculate(int score) {

		for (GradeType type : GradeType.values()) {

			if (score >= type.getLowScore() && score <= type.getHighScore()) {
				return type;
			}
		}
		return GradeType.F;
	}

	/**
	 * 총점계산
	 *
	 * @param 학점 리스트
	 * @return 총점
	 */
	public int getTotalScore(List<Integer> list) {
		int result = 0;
		
		for (int score : list) {
			result += score; 
		}
		
		return result;
	}

	/**
	 * 평균계산
	 *
	 * @param 학점 리스트
	 * @return 총점
	 */
	public int getAverageScore(List<Integer> list) {
		
		int result = Math.round((float)getTotalScore(list) / (float)list.size());
		
		return result;
	}
}
