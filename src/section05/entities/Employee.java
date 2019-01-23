package section05.entities;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	//CONSTRUCT
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//METODS
	public void increaseSalary(double percent) {
		this.salary += salary * percent / 100;
	}

	//ToSTRING
	public String toString() {
		return id
				+ ", "
				+ name
				+ ", "
				+String.format("%.2f", salary);
	}
	
	
	//GET SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
