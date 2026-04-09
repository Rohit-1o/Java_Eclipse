package java_project;

public class AbstractClassMain {

	public static void main(String[] args) {
		Emp [] employes = new Emp[5];
		employes[0] = new PermanentEmp(101, "James", 10000.45f, 2300.23f, 1200.4f);
		employes[1] = new PermanentEmp(102, "Kevin", 9945.55f, 2123.23f, 960.4f);
		employes[2] = new PermanentEmp(103, "Ana", 8756.65f, 2999.23f, 880.4f);
		employes[3] = new ContractualEmp(104, "Andrew", 7000.45f, 2230.23f);
		employes[4] = new ContractualEmp(105, "Steve", 11000.45f, 2500.23f);
		
		for (Emp currentEmp : employes) {
			String empName = currentEmp.getName();
			float finalSalary = currentEmp.processSalary();
			System.out.println(empName + " is earning a Salary " + finalSalary);
		}
		
	}

}
