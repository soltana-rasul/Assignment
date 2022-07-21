
public class Q1Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q1Parent p = new Q1Parent();
		p.setEyeColor("brown");
		p.setHeightCm(165);

		Q1Child c = new Q1Child();
		c.setInterests("Coding");
		
		c.getInterests();
		c.getDetails();
		
	}

}
