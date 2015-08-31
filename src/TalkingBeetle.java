/*
 * Exercise	
1. Create a	new	class TalkingBeetle. The TalkingBeetle prints a	message	when it is 
about to make a	circle.	For	example, it	would say “Watch out, I’m making a circle”	
before	turning. Test your work.	
2. Add	a constructor to your class	that takes a color	(String)	and	a	name	(String)	as	
parameters.	The	name should	be	an	instance	variable.	Remember	that	the	
superclass	already	has	a constructor	that	takes	color	as	a	parameter.	
3. Update	the	method	makeCircle	so	that	it	now	says	“Name	is	about	to	make	a	
circle”.
 */

public class TalkingBeetle extends Beetle {
	private String name;

	public TalkingBeetle(String color, String name) {
		super(color);
		this.setName(name);
	}

	public void makeCircle(double radius) {
		 System.out.println(this.getName() + " is about to make a circle");
		 super.makeCircle(radius);
		 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
}
