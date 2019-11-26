/**
 * 
 */

/**
 * @author abreu
 *
 */
public class Employee2 {
	class Employee{
		private String name;
		private int age;
		private int EmpId;
		private double HourlyPay;
		private String role;
	public Employee() {
		this.name = "Jay";
		this.age = 20;
		this.EmpId = 1234567;
		this.HourlyPay = 20.00;
		this.role = "designer";
	}
	public Employee(String name, int age, int EmpId, double HourlyPay, String role) {
		this.name = name;
		this.age = age;
		this.EmpId = EmpId;
		this.HourlyPay = HourlyPay;
		this.role = role;
	}
	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}
	public String getname() {
		return this.name;
	}
	public int getEmpId() {
		return this.EmpId;
	}
	public double getHourlypay(){
		return this.HourlyPay;
	}
	public String getRole() {
		return this.role;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmpId(int id) {
		this.EmpId = id;
	}
	public void setHourlyPay(double pay) {
		this.HourlyPay = pay;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean equals(Object O) {
		if(this == O) {
			return true;
		}
		if(O instanceof Employee) {
			Employee n1 = (Employee)O;
			if(this.name == n1.name) {
				if (this.age == n1.age) {
					if(this.EmpId == n1.EmpId) {
						if(this.HourlyPay == n1.HourlyPay) {
							if(this.role == n1.role) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
	public String toString() {
		return "Employee: " + "name = " + name + ", age = " + age + ", EmpId = " + EmpId + ", HourlyPay = " + HourlyPay + ", role = " + role;
	}
	}

}
