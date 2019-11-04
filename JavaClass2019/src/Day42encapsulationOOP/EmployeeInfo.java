package Day42encapsulationOOP;

public class EmployeeInfo {
	
	/*
	 * name 
	 * ssn
	 * age
	 * salary
	 */
	
	private String Name;
	private long SSN;
	private byte Age;
	private double Salary;
	
	
	//name
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() {
		return this.Name;
	}//ssn
	public long getSSN() {
		return SSN;
	}
	public void setSSN(long SSN) {
		this.SSN=SSN;
	}//age
	public byte getAge() {
		return Age;
	}
	public void setAge(byte Age) {
		this.Age=(byte)Age;
	}//salary
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double Salary) {
		this.Salary=Salary;
	}//set info
	public void setInfo(String Name,long SSN, byte Age, double Salary) {
		setName(Name);
		setSSN(SSN);
		setAge(Age);
		setSalary(Salary);
		
	}
}
