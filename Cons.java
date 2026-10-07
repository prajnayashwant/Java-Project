package Constructor;

public class Cons {
Cons()
{
	System.out.println("fghi");
}
Cons(int a)
{
	System.out.println("  "+a);
}
public static void main(String[]args)
{
	Cons bb = new Cons();
	Cons kk = new Cons(50);
}
}
