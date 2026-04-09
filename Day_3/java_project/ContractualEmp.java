package java_project;

public class ContractualEmp extends Emp{
	private float incentiver;
	

	public ContractualEmp() {
		// TODO Auto-generated constructor stub
		
	}


	
	public float getIncentiver() {
		return incentiver;
	}
	public void setIncentiver(float incentiver) {
		this.incentiver = incentiver;
	}



	public ContractualEmp(int empNo, String name, float basicSalary, float incentiver) {
		super(empNo, name, basicSalary);
		this.incentiver = incentiver;
	}


	@Override
	public float processSalary() {
		float finalSalary = getBasicSalary() + incentiver;
		return finalSalary;
	}

}


