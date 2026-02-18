package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		Color Pink = new Color (247, 186, 247);
		StdDraw.setPenColor(Pink);
		StdDraw.filledRectangle(0.5,0,.5,.5);

		Color Purple = new Color ( 208, 186, 247);
		StdDraw.setPenColor(Purple);
		StdDraw.filledRectangle(0.5,1,.5,.5);

		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(.5, .5, .25);


		double [] x = { .5,.312,.689};
		double [] y = { .32,.5,.5,};
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledPolygon(x,y);
		StdDraw.setPenColor(Color.WHITE);

StdDraw.filledRectangle(0.5,.54,.2,.1);
		

		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(.425, .5, .08);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(.575, .5, .08);
	
		StdDraw.setPenColor(Color.RED);

StdDraw.filledRectangle(0.5,.45,.05 ,.05);
	}
}