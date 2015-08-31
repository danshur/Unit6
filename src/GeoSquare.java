
public class GeoSquare extends GeoRectangle {

	public void getSide() {
		super.getWidth();
	}
	public void setSide(double side) {
		super.setWidth(side);
		super.setHeight(side);
	}
	
	public GeoSquare() {
		// TODO Auto-generated constructor stub
	}

}
