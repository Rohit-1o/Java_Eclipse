package java_project;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe emp = new Employe();
		Employe emp2 = new Employe();
		Employe emp3 = new Employe();
		
		// Assign basic salary to 3rd employee
		emp.employeid = 1004;
		emp2.name = "Rohit Goud";
		emp3.basicSalary = 45000.34f;
		
		//Printing name of 1st employee
		System.out.println("Name of 1st Employee :"+ emp.employeid +" " + emp2.name +" " + emp3.basicSalary);
	}

}
