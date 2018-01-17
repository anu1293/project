package service;

import java.util.HashMap;

import modal.Employee;

public class EmployeeService {

	private static HashMap<Integer,Employee> hMap=new HashMap<Integer,Employee>();
	public EmployeeService() {
	
		hMap.put(1, new Employee(1, "anupam", 12345, "IIITB"));
		hMap.put(2, new Employee(2, "anubhav",98765, "indore"));
		hMap.put(3, new Employee(3, "atul", 88677, "bhopal"));
		hMap.put(4, new Employee(4, "arpit", 87457, "bhilai"));
		hMap.put(5, new Employee(5, "vaibhav",98355, "jabalpur"));
		hMap.put(6, new Employee(6, "parul", 97654, "sarini"));
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		if(hMap.get(id)!=null)
			{
			emp=hMap.get(id);
			return emp;
			}
		return null;
	}
	
	public boolean addEmployee(int id,Employee employee)
	{
		if(hMap.get(id)==null)
		{
			hMap.put(id,employee);
			return true;
		}
		return false;
	}
	
	public boolean updateEmployee(int id,Employee employee)
	{
		if(hMap.get(id)!=null)
			{
			hMap.put(id, employee);
			return true;
			
			}
		return false;
	}
	public boolean deleteEmployee(int id)
	{
		Employee emp=hMap.get(id);
		if(emp!=null)
		{	
			hMap.remove(id);
			return true;
		}
		return false;
		
	}

	
}
