//Package that this class is inside of
package org.cvtc.shapes;
// Import the built-in to display the message box
import javax.swing.JOptionPane;

public class Cuboid extends Shape{
	
	// Variable Declarations
	
	private float width = (float) 0.0;
	private float height = (float) 0.0;
	private float depth = (float) 0.0;
	
	// Getters and Setters
	
	public float getWidth() {
		return width;
	}
	
	private void setWidth(float width) {
		this.width = width;
	}
	
	public float getHeight() {
		return height;
	}
	
	private void setHeight(float height) {
		this.height = height;
	}
	
	public float getDepth() {
		return depth;
	}
	
	private void setDepth(float depth) {
		this.depth = depth;
	}
	
	// Cuboid Constructor function
	
	public Cuboid(float depth, float height, float width) {
		super();
		
		// Checks for negative inputs or 0's, and throws an exception if invalid numbers are input
		if(depth <= 0 || height <= 0 || width <= 0) {
			throw new IllegalArgumentException("Please only use positive values, greater than 0");
		} else {
			this.depth = depth;
			this.height = height;
			this.width = width;
		}
		
	}

	// Overridden functions inherited from the super class of Shape
	// All of the equations were looked up online (Google)
	
	//Calculates the Surface Area using the equation (2dw + 2dh + 2wh)
	@Override
	public
	float surfaceArea() {
		return (2 * (depth * width)) + (2 * (depth * height)) + (2 * (width * height));
	}

	// Calculates the Volume using the equation (dwh)
	@Override
	public
	float volume() {
		return (depth * width * height);
	}

	// Calls render() and displays the message box to show the shape type, dimensions, surface area and volume
	@Override
	public
	void render() {
		JOptionPane.showMessageDialog(null, "CUBOID: " + "\nDepth: " + depth + ", Width: " + width + ", Height: " + height +
									  " \nSurface Area: " + surfaceArea() + 
									  ", \nVolume: " + volume());
	}
	
}
	
	


