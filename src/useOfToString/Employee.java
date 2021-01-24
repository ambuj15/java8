package useOfToString;

public class Employee {
	String name;
	int employeeNumber;

	public Employee(String name, int eNo)
	{
		this.name=name;
		this.employeeNumber=eNo ;
	}
	
	public String toString()
	{
		return name + ":" + employeeNumber;
	}
}
