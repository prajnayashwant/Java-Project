package program;

public class Parents {
	void marry()
	{
		System.out.println("slelcted by family");
	}
	void property()
	{
		System.out.println("property of family");
	}
	public static void main(String[] args) {
		Parent bb = new Parent();
		bb.marry();
		bb.property();
	}
}
class Parent extends Parents {
	void marry()
	{
		System.out.println("campus selected");
	}
}
