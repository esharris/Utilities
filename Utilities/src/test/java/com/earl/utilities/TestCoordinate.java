package com.earl.utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCoordinate {

	private static final Coordinate COORDINATE1 = new Coordinate(5, 6);
	private static final Coordinate COORDINATE2 = new Coordinate(-5, 3);

	@Test
	void testAdd() {
		assertEquals(COORDINATE1, COORDINATE1.add(Coordinate.ORIGIN));
		assertEquals(COORDINATE1, Coordinate.ORIGIN.add(COORDINATE1));
		assertEquals(new Coordinate(0, 9), COORDINATE1.add(COORDINATE2));
	}

	@Test
	void testSubtract() {
		assertEquals(COORDINATE1, COORDINATE1.subtract(Coordinate.ORIGIN));
		assertEquals(new Coordinate(-5, -6), Coordinate.ORIGIN.subtract(COORDINATE1));
		assertEquals(new Coordinate(10, 3), COORDINATE1.subtract(COORDINATE2));
	}

	@Test
	void testMult() {
		assertEquals(Coordinate.ORIGIN, COORDINATE2.mult(0));
		assertEquals(new Coordinate(10, 12), COORDINATE1.mult(2));
		assertEquals(new Coordinate(-50, 30), COORDINATE2.mult(10));
	}

}
