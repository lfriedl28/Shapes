package org.cvtc.shapes.test;

import static org.junit.Assert.*;
import org.cvtc.shapes.*;
import org.junit.Test;

public class CylinderTest {

	@Test
	public void testSurfaceArea() {
		Cylinder cyl1 = new Cylinder(1,1);
		assertEquals(12.566370964050293, cyl1.surfaceArea(), 0.001);
	}

	@Test
	public void testVolume() {
		Cylinder cyl1 = new Cylinder(1,1);
		assertEquals(3.14159625, cyl1.volume(), 0.001);
	}

	@Test
	public void testGetRadius() {
		Cylinder cyl1 = new Cylinder(1,1);
		assertEquals(1, cyl1.getRadius(), 0.01);
	}

	@Test
	public void testGetHeight() {
		Cylinder cyl1 = new Cylinder(1,1);
		assertEquals(1, cyl1.getHeight(), 0.01);
	}

	@Test (expected = IllegalArgumentException.class)
	public void testCylinder() {
		Cylinder cyl1 = new Cylinder(-1,0);
	}

}
