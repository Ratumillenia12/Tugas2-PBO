public class cobaa{
	int a; double b;

	//constructor defauld
	public cobaa(){
	a = 100;
	b = 3.14;
	}
	//constructor parameter
	public cobaa(int z){
	a = z;
	}

public static void main(String[] args){
	cobaa cb1 = new cobaa();
	cobaa cb2 = new cobaa(50);

	System.out.println(cb1.a);
	System.out.println(cb1.b);
	System.out.println(cb2.a);
	

	}
}