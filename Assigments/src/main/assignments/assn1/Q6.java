
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Color r = new Red();
		r.examples();
	}

}

interface Color{
	void examples();
}
class Red implements Color{

	public void examples() {
		System.out.println("Roses");
	}
}