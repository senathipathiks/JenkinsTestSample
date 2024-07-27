package com.sena.testsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testCompareString() {
		assertTrue(App.CompareString("sena", "sena"));
	}

	@Test
	void testCompareString1() {
		assertFalse(App.CompareString("SENA", "sena"));
	}
}
