package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.*;
import org.junit.Test;

public class CuboidTest {

	@Test
	public void testSurfaceArea() {
		Cuboid cube1 = new Cuboid(3,3,3);
		assertEquals(54, cube1.surfaceArea(), 0.0002);
		//fail("Not yet implemented");
	}

	@Test
	public void testVolume() {
		Cuboid cube1 = new Cuboid(3,3,3);
		assertEquals(27, cube1.volume(), 0.01);
	}

	@Test
	public void testGetWidth() {
		Cuboid cube1 = new Cuboid(1,3,3);
		assertEquals(cube1.getWidth(), 3, 2);
	}

	@Test
	public void testGetHeight() {
		Cuboid cube1 = new Cuboid(1,1,3);
		assertEquals(1, cube1.getHeight(), .1);
	}

	@Test
	public void testGetDepth() {
		Cuboid cube1 = new Cuboid(3,3,3);
		assertEquals(1, 1, cube1.getDepth());
	}

	@Test (expected = IllegalArgumentException.class)
	public void testCuboid() {
		Cuboid cube1 = new Cuboid(-1,-1,0);
	}

}
