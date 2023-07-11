package payroll;
class Employee{
	void pay(String name,double salary) {
		double s=salary*12;
		System.out.println("Salaried employee");
		System.out.println(name+"="+s);
		
	}
	void pay(String name,double hourlyrate,double hoursworked) {
		double s=hourlyrate*hoursworked*7;
		System.out.println("Hourly employee");
		System.out.println(name+"="+s);
	}
}



public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee e=new Employee();
	e.pay("ARJUN",40000);
	e.pay("vijay", 650, 5);
	
		

	}

}
