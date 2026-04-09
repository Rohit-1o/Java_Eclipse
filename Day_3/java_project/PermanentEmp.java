package java_project;

public class PermanentEmp extends Emp{
	private float da;
	private float hra;
	
	@Override
	public float processSalary() {
		// TODO Auto-generated method stub
		float finalSalary =getBasicSalary()+ da + hra;
		return finalSalary;
	}
	

	public PermanentEmp(int empNo, String name, float basicSalary, float da, float hra) {
		super(empNo, name, basicSalary);
		this.da = da;
		this.hra = hra;
	}

	public float getDa() {
		return da;
	}
	public void setDa(float da) {
		this.da = da;
	}


	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}

}

