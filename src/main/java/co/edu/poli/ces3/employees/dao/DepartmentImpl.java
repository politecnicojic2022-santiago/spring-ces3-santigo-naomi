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
        return entityManager.find(Department.class, id);
    }

    @Override
    public Department createDepartment(Department department) {
        return entityManager.merge(department);
    }

    @Override
    public Department updateDepartment(int id, Department department) {
        department.setId(id);
        return entityManager.merge(department);
    }

    @Override
    public Department deleteDepartment(int id) {
        Department d = entityManager.find(Department.class, id);
        entityManager.remove(d);
        return d;
    }
}
