package co.edu.poli.ces3.employees.dao;

import co.edu.poli.ces3.employees.models.Department;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class DepartmentImpl implements DepartmentDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Department> getDepartments() {
        String query = "FROM Department";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Department getDepartment(int id) {
        return null;
    }

    @Override
    public Department createDepartment(Department department) {
        return null;
    }

    @Override
    public Department updateDepartment(Department department) {
        return null;
    }

    @Override
    public Department deleteDepartment(int id) {
        return null;
    }
}
