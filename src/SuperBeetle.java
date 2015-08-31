
/* 
 * Exercise	
1. Write a class called SuperBeetle which extends Beetle. Add two instance methods
drawOctagon( double side ) and drawHexagon( double side ). Which draw an
octagon (an eight-sided figure) and a hexagon (a six-sided figure), respectively.
Note: there are 60 degrees in the external angle of a hexagon, and 45 in the
external angle of an octagon. Test your work.	
2. Add to SuperBeetle the instance method drawPolygon( double side, int numSides ),
which draws a polygon with the indicated length and number of sides. Note: The
number of degrees in the external angle of polygon can be computed using (360./
number-of-sides). Test your work.	
 */

public class SuperBeetle extends Beetle{

	public static void main(String[] args) {
		SuperBeetle hexi = new SuperBeetle();
		SuperBeetle octi = new SuperBeetle();
		SuperBeetle adam = new SuperBeetle();
		//octi.drawOctagon(20);
		//hexi.drawHexagon(20);
		//adam.drawPolygon(10, 5);	//its a pentagon
		adam.drawPolygon(15, 10); //decagon?

	}
	public void drawOctagon(double side)  {
		for (int count = 1; count <= 8; count = count + 1) {
			this.move(side);
			this.turn(45);
		}
	}
	public void drawHexagon(double side) {
		for (int count = 1; count <= 6; count = count + 1) {
			this.move(side);
			this.turn(60);
		}
	}
	public void drawPolygon( double side, int numSides ) {
		int turnDegree = 360 / numSides;
		for (int count = 1; count <= numSides; count = count + 1) {
			this.move(side);
			this.turn(turnDegree);
		}
	}

}
