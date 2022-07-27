package co.edu.poli.ces3.employees.dao;

import co.edu.poli.ces3.employees.models.Department;

import java.util.List;

public interface DepartmentDao {

    List<Department> getDepartments();

    Department getDepartment(int id);

    Department createDepartment(Department department);

    Department updateDepartment(Department department);

    Department deleteDepartment(int id);
}
