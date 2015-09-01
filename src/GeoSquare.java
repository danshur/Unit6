
public class GeoSquare extends GeoRectangle {

	public void getSide() {
		super.getWidth();
	}

	public void setSide(double side) {
		//super(side, side);
		super.setWidth(side);
		super.setHeight(side);
		

	}

	public GeoSquare(double width, double height) {
		// super.setWidth(0);
		// super.setHeight(0);
		super(width, height);

	}

}
