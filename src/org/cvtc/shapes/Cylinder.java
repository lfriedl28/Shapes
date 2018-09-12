//Package that this class is inside of
package org.cvtc.shapes;
//Import the built-in to display the message box
import javax.swing.JOptionPane;

public class Cylinder extends Shape{

	// Variable Declarations
	
	private float radius = (float)0.0;
	private float height = (float)0.0;
	
	// Getters and Setters
	
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	// Cylinder Constructor function
	
	public Cylinder(float radius, float height) {
		super();
		
		// Checks for negative inputs or 0's and throws an exception if invalid
		
		if(radius <= 0 || height <= 0) {
			throw new IllegalArgumentException("Please only enter valid, positive numbers (above 0");
		} else {
			this.radius = radius;
			this.height = height;
		}
	}

	// Overridden functions inherited from the super class of Shape
	// All of the equations were looked up online (Google)
	
	// Calculates the surface area using the equation: (2(pi) + rh) + 2(pi) + r^2)
	@Override
	public
	float surfaceArea() {
		return (float) (2 * Math.PI * (radius * height) + (2 * Math.PI * (radius * radius)));
	}
	@Override
	public
	float volume() {
		return (float) (Math.PI) * (radius * radius) * height;
	}
	@Override
	public
	void render() {
		JOptionPane.showMessageDialog(null, "CYLINDER: " + "\nRadius: " + radius + ", Height: " + height +
										"\nSurface Area: " + surfaceArea() + 
										", \nVolume: " + volume());
	}
	
}
