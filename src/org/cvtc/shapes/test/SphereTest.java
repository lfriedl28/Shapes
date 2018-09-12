package org.cvtc.shapes.test;

import static org.junit.Assert.*;
import org.cvtc.shapes.*;
import org.junit.Test;

public class SphereTest {

	@Test
	public void testSurfaceArea() {
		Sphere ball1 = new Sphere(10);
		assertEquals(1256.64, ball1.surfaceArea(), 0.01);
	}

	@Test
	public void testVolume() {
		Sphere ball1 = new Sphere(10);
		assertEquals(4188.79, ball1.volume(), 0.01);
	}

	@Test
	public void testGetRadius() {
		Sphere ball1 = new Sphere(10);
		assertEquals(10, ball1.getRadius(), 0.01);
	}

	@Test (expected = IllegalArgumentException.class)
	public void testSphere() {
		Sphere ball1 = new Sphere(-10);
	}

}
