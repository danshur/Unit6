
public class GeoRegularPolygon extends GeoShape {
	public int sides;
	public double lenght;

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	@Override
	public void drawShape() {
		System.out.println("drawing a regular polygon");
	}
}
