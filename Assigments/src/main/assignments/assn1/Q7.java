


class animal{
	protected String name = "Luna";
	
	void details(){
		System.out.println("Animal info...");
	}
}
		
class cat extends animal{
	private int age = 3;
	private String sound = "Meow";
	void color() {	
		super.details();
		System.out.println(super.name);
		System.out.println("Black");
	}
}

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	cat c = new cat();
	c.color();	
	}
}


