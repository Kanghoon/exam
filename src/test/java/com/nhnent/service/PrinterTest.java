package com.nhnent.service;

import org.junit.Test;

import com.nhnent.model.GradeType;


public class PrinterTest {

	@Test
	public void testPrint() throws Exception {
		new Printer().printGrade(GradeType.A);
	}
}
