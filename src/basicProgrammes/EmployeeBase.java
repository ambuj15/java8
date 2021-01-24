package basicProgrammes;

public class EmployeeBase {

	String name;
	int eNo;

	public EmployeeBase(String n, int number) {
		this.name = n;
		this.eNo = number;
	}
	
	public String toString()
	{
		return name + ":" + eNo;
	}
}
