
public class GeoCircle extends GeoShape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void drawShape() {
		System.out.println("drawing a circle");
	}
}
