package com.qa.ExampleJunitTest.operators;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.ExampleJunit.operators.CalculatorTask;

public class CalculatorTaskTest {
	
	@Test
	public void addTest() {
		double result = CalculatorTask.add(12, 3);
		assertEquals(15, result);
		}
	
	
	@Test
	public void subTest() {
		double result = CalculatorTask.sub(12, 3);
		assertEquals(9, result);
		}
	
	@Test
	public void mulTest() {
		double result = CalculatorTask.mul(12, 3);
		assertEquals(36, result);
		}

	@Test
	public void divTest() {
		double result = CalculatorTask.div(12, 3);
		assertEquals(4, result);
		}
	
	@Test
	public void Test() {
		double result = CalculatorTask.mod(12, 3);
		assertEquals(0, result);
		}
}
