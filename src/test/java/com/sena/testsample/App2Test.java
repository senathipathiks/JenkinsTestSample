package com.sena.testsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class App2Test {

	@Test
	void testSum() {
		int[] arr= {1,2,3,4};
		assertEquals(10,App2.sum(arr));
	}
	
}
