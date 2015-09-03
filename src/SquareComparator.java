


import java.util.Comparator;

public class SquareComparator implements Comparator<GeoSquare> {
	
	@Override
	public int compare(GeoSquare o1, GeoSquare o2){
		double area1=o1.getHeight() * o1.getWidth();
		double area2=o2.getHeight() * o2.getWidth();
		return area1.compareTo(area2);
	}

}
