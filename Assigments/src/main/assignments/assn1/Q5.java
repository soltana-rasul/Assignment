
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Food food = new Tastes();
		food.savory();
		System.out.println();
		food.sweet();
	}

}
abstract class Food {
	public void savory() {
		System.out.print("Popcorn");
	}
	public abstract void sweet();
}
//subclass
class Tastes extends Food{
	public void sweet() {
		System.out.print("Candy");
	}
}