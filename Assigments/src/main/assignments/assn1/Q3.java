
public class Q3 {

	private String jobTitle = null;
	private int salary = 0;
	private String emplName = null;

	// constructors
	
	Q3(){
		emplName = "John";
		salary = 75000;
	}
	
	Q3(String jobTitle, int salary){
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	Q3(String jobTitle){
		this.jobTitle = jobTitle;
	}
	
}
