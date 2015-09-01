
public class GeoEquilateralTriangle extends GeoTriangle {

	public double getSide() {
		return super.getLenght1();

	}

	public void setSide(double side) {
		super.setLenght1(side);
		super.setLenght2(side);
		super.setLenght3(side);
	}

	public GeoEquilateralTriangle(double side) {
		super(side, side, side);
	}

}
