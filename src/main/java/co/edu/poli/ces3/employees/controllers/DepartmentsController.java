package co.edu.poli.ces3.employees.controllers;

import co.edu.poli.ces3.employees.dao.DepartmentDao;
import co.edu.poli.ces3.employees.models.Department;
import co.edu.poli.ces3.employees.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentsController {

    @Autowired
    DepartmentDao dao;

    @RequestMapping(value = "api/departments", method = RequestMethod.GET)
    public List<Department> getEmployees(){

        return dao.getDepartments();
    }

    @RequestMapping(value = "api/departments/{id}", method = RequestMethod.GET)
    public Department getEmployee(@PathVariable("id") int id){
        return dao.getDepartment(id);
    }

    @RequestMapping(value = "api/departments", method = RequestMethod.POST)
    public Department insertEmployees(@RequestBody Department d){
        return dao.createDepartment(d);
    }

    @RequestMapping(value = "api/departments/{id}", method = RequestMethod.PUT)
    public Department updateEmployees(@PathVariable("id") int id, @RequestBody Department d){
        return dao.updateDepartment(id, d);
    }

    @RequestMapping(value = "api/departments/{id}", method = RequestMethod.DELETE)
    public Department removeEmployees(@PathVariable("id") int id){
        System.out.println(id);
        return dao.deleteDepartment(id);
    }
}
