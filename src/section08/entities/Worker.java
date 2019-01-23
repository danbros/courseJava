package section08.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import section08.entities.enums.WorkerLevel;

public class Worker {
	
	private String workerName;
	private WorkerLevel workerLevel;
	private double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}
	
	public Worker(String name, WorkerLevel level, double salary, Department department) {
		this.workerName = name;
		this.workerLevel = level;
		this.baseSalary = salary;
		this.department = department;
	}
	//Get/Set
	public String getName() {
		return workerName;
	}

	public void setName(String name) {
		this.workerName = name;
	}

	public WorkerLevel getLevel() {
		return workerLevel;
	}

	public void setLevel(WorkerLevel level) {
		this.workerLevel = level;
	}

	public double getSalary() {
		return baseSalary;
	}

	public void setSalary(double salary) {
		this.baseSalary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	//Methods
		public void addContract(HourContract contract){
			contracts.add(contract);
		}
		
		public void removeContract(HourContract contract) {
			contracts.remove(contract);
		}
		
		public double income(int year, int month) {
			double sum = baseSalary;
			Calendar cal = Calendar.getInstance();//Instancia calendario;
			for(HourContract c : contracts) {//Para cada contrato c na lista de contratos, faça:
				//sum += c.totalValue();   Retornaria o valor de todos os contratos. Mas precisamos do valor do mes e ano recebidos como arg.
				cal.setTime(c.getDate());//"c.getDate()" pega a data do contrato c, "cal.setTime" define/seta como sendo a data cal.
				int c_year = cal.get(Calendar.YEAR);//".get" captura um tempo determinado (YEAR) da cal(que recebeu a data da lista c).
				int c_month = 1 + cal.get(Calendar.MONTH);//"MONTH" da calendar começa com 0.
				if(c_year == year && c_month == month){	
					sum += c.totalValue();
				}
			}
			return sum;
		}
}
