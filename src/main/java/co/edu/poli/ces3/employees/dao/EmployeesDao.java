package co.edu.poli.ces3.employees.dao;

import co.edu.poli.ces3.employees.models.Employee;

import java.util.List;

public interface EmployeesDao {

    List<Employee> getEmployees();

    Employee getEmployee(int id);

    Employee createEmployee(Employee employee);

    Employee updateEmployee(int id, Employee employee);

    Employee deleteEmployeee(int id);
}
