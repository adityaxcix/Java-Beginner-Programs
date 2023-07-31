package _31_07_23_;
public class EmployeeDataEncapsulation
{

	int id;
	int salary;
	String name;

	public void setID(int id) {
		this.id = id;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeDataEncapsulation(int id, int salary, String name) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	
	public static void main(String[] args) {

		EmployeeDataEncapsulation E1 = new EmployeeDataEncapsulation(1, 20000, "Kohli ");
		EmployeeDataEncapsulation E2 = new EmployeeDataEncapsulation(2, 15000, "dhoni");
		System.out.println("1st Employee ");
		System.out.println("ID : "+E1.id);
		System.out.println("Name : "+E1.name);
		System.out.println("Salary : "+E1.salary);
		
		System.out.println("\n"+"2nd Employee ");
		System.out.println("ID : "+E2.id);
		System.out.println("Name : "+E2.name);
		System.out.println("Salary :  "+ E2.salary);
		
		
	}

}
