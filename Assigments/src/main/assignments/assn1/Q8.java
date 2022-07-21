

final class Car{
	Car(){
		System.out.println("Nissan");
	}
	final void details() {
		final int mph = 80;
	System.out.println("Blue" + " " + mph);
	}
}
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.details();
	}

}
