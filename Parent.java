package program;

public class Parent {
	void cancer()
	{
		System.out.println("I am having cancer");
	}
}

public class Parent extends Parent {	   
	public static void main(String[] args) {
		Demo  tt = new Demo();
		tt.cancer();
		
	}
}
