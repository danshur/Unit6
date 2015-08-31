
public class TestNamedBeetle {
	public static void main(String[] args) {
		NamedBeetle jerry = new NamedBeetle();
		NamedBeetle tom = new NamedBeetle();
		NamedBeetle dog = new NamedBeetle(); 
		jerry.temp = "aaa";
		 tom.temp = "ZZZ";
		 //System.out.println( jerry.temp ); // Output: aaa
		 //System.out.println( tom.temp ); // Output: zzz
		 dog.setName("dingo");
		 dog.setNickName("buddy");
		 //System.out.println("My new dogs name is " + dog.getName() + " his nickname is " + dog.getNickName());
		 
		 
	}
}
