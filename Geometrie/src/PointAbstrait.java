import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

public abstract class PointAbstrait extends ElementGeometrique {

	public PointAbstrait(String myName) {
		super(myName);
	}
	
	abstract double[] coord();
	
	public void tracer(Graphics g) {
		
	}
}