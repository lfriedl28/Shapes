//Package that this class is inside of
package org.cvtc.shapes;
//Import the built-in to display the message box
import javax.swing.JOptionPane;

public class Sphere extends Shape{

	// Variable Declarations
	
	private float radius = (float)0.0;
	
	// Getters and Setters

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	// Sphere Constructor function

	public Sphere(float radius) {
		super();
		
		// Checks for negative inputs or 0's, and throws an exception if invalid numbers are input
		if(radius < 0) {
			throw new IllegalArgumentException("Please only enter postive values");
		} else {
			this.radius = radius;
		}
	}
	
	// Overridden functions inherited from the super class of Shape
	// All of the equations were looked up online (Google)

	// Calculates the surface area using the equation (4 * (pi) * r^2)
	@Override
	public float surfaceArea() {
		return (float) (4 * Math.PI * (radius * radius));
	}

	// Calculates the volume using the equation ((4*(pi)*r^3)/3)
	@Override
	public float volume() {
		return (float) ((4 * Math.PI * (radius * radius * radius))/3);
	}

	// Calls render() and displays the message box to show the shape type, dimensions, surface area and volume
	@Override
	public void render() {
		JOptionPane.showMessageDialog(null, "SPHERE: " + "\nRadius: " + radius + 
									"\nSurface Area: " + surfaceArea() + ", "
											+ "\nVolume: " + volume());
	}
	
}
