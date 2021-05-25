package com.qa.ExampleJunitTest.operators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.jupiter.api.Test;

import com.qa.ExampleJunit.operators.Blackjack;

public class BlackjackTest {
	
	//public static void main(String[] args) {
		// @Test
		// @BeforeAll, @AfterAll - runs at start and end - once each, these methods must be static! 
		// @BeforeEach, @AfterEach - runs before and after each @Test
		
		// Assertions// =======// fail();
		// assetTrue | assertFalse
		// assertEquals| assertNotEquals
		// assertNull | assertNotNull
		// assertSame | assertNotSame
	
	@Test
	
	public void playTest() {
		int result = Blackjack.play(22, 22);
		assertEquals(0, result);
		assertNull(null);
}
	@Test
	public void playTest1() {
		int result = Blackjack.play(12, 20);
		assertEquals(20, result);
		
}
	
	@Test
	public void playTest2() {
		int result = Blackjack.play(14, 22);
		assertEquals(14, result);
}
	@Test
	public void playTest3() {
		int result = Blackjack.play(22, 15);
		assertEquals(15, result);
}
	
	@Test
	public void playTest4() {
		int result = Blackjack.play(15, 15);
		assertSame(15, result);
}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
