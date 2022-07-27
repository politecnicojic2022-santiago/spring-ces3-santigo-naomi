package co.edu.poli.ces3.employees.controllers;

import co.edu.poli.ces3.employees.dao.EmployeesDao;
import co.edu.poli.ces3.employees.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeesController {

    @Autowired
    private EmployeesDao employeesDao;

    @RequestMapping(value = "test")
    public String test(){
        return "Hola Spring Boot";
    }

    @RequestMapping(value = "api/employees", method = RequestMethod.GET)
    public List<Employee> getEmployees(){
        return employeesDao.getEmployees();
    }

    @RequestMapping(value = "api/employee/{id}", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable("id") int id){
        return employeesDao.getEmployee(id);
    }

    @RequestMapping(value = "api/employee", method = RequestMethod.POST)
    public Employee createEmployees(@RequestBody Employee e){
        return employeesDao.createEmployee(e);
    }

    @RequestMapping(value = "api/employee/{id}", method = RequestMethod.PUT)
    public Employee updateEmployees(@PathVariable("id") int id, @RequestBody Employee e){
        return employeesDao.updateEmployee(id, e);
    }

    @RequestMapping(value = "api/employee/{id}", method = RequestMethod.DELETE)
    public Employee deleteEmployees(@PathVariable("id") int id){
        return employeesDao.deleteEmployee(id);
    }
}
