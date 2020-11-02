package testHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int employeeid;
	private String employee_name;
	private String mobil_no;

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getMobil_no() {
		return mobil_no;
	}

	public void setMobil_no(String mobil_no) {
		this.mobil_no = mobil_no;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employee_name=" + employee_name + ", mobil_no=" + mobil_no
				+ "]";
	}
	
	
}