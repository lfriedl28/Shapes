// Package this class is inside of
package org.cvtc.shapes;

public class ShapesTest {

	// Main method that starts program
	// Also creates new instances of the shape types: Cuboid, Cylinder and Sphere
	// Taking in the appropriate dimensions for the shape
	// Then calls the render method to display the message box that displays the dimensions, volume and surface area
	public static void main(String[] args) {
		
		Cuboid cuboid = new Cuboid(1, 1, 1);
		cuboid.render();
		
		Cylinder cylinder = new Cylinder(3, 1);
		cylinder.render();
	
		Sphere sphere = new Sphere(3);
		sphere.render();

	}

}
