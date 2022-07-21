

class Grade{
	int getPassingGrade() {
		return 70;
	}
}
class CourseA extends Grade {
	int getPassingGrade() {
		return 65;
	}
}
class CourseB extends Grade {
	int getPassingrade() {
		return 50;
	}
}
class CourseC extends Grade{
	
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CourseC c = new CourseC(); 
		System.out.println(c.getPassingGrade());
		
		CourseA a = new CourseA();
		System.out.println(a.getPassingGrade());
		
	}

}
