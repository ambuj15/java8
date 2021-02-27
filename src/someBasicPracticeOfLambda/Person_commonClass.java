package someBasicPracticeOfLambda;

public class Person_commonClass {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person_commonClass(String firstName, String lastName, int age)
	{
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		return "First: " + firstName + ", Last: " + lastName + ", age: " + age;
	}
}
