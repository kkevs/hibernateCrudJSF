package dao;

import java.util.List;

import model.EmployeeDetails;

public interface EmployeeDao {
	public void saveEmployee(EmployeeDetails employee);

	public List<EmployeeDetails> showAllEmployees();

	public void updateEmployee(EmployeeDetails employee);

	public void deleteEmployee(EmployeeDetails employee);
}
