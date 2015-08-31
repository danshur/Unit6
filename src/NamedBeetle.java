
public class NamedBeetle extends Beetle{
	private String name;
	public String temp;
	private String nickName;
	
	public void setName(String beetleName) {
		this.name = beetleName;
	}
	public void sayName() {
		System.out.println(name);
	} 
	public String getName() {
	return name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}
