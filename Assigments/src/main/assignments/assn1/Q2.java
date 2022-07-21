
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hello obj = new hello();
		String result = obj.hello("hi");
		System.out.print(result);
	}
} 
class hi{
	public String hi(String b) {
		return b;
	}
}
class hello{
	public String hello(String a) {
		return a;
		
	}
}
//example for reference
class add {
	public int mult (int a, int b) {
	return a*b;
	}
}