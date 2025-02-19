package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(128, 0, 128);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.2);
		StdDraw.setPenColor(255, 255, 0);
		StdDraw.filledSquare(0.5, 0.5, 0.1);
		StdDraw.setPenColor(0, 0, 255);
		StdDraw.filledCircle(0.5, 0.5, 0.05);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.rectangle(0.5, 0.50, 0.40, 0.2);
		
	}
}