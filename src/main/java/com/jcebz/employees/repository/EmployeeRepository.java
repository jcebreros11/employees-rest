package com.jcebz.employees.repository;

import com.jcebz.employees.exception.EmployeeNotFoundException;
import com.jcebz.employees.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {


    /* Without using Jpa / or DB, we create a runtime list and built in CRUD operations
     private List<Employee> employees = new ArrayList <Employee>();

    public EmployeeRepository() {
    }



    //CREATE Operation
    public Employee create(Employee emp){
        employees.add(emp);
        return emp;
    }

    public Employee save(Employee emp){
        employees.add(emp);
        return emp;

    }


    //READ Operations

    public List<Employee> findAll(){
        return employees;
    }

    public Employee findById(String id) throws EmployeeNotFoundException{
        return employees.stream().filter(employee -> employee.id().equals(id))
                .findFirst()
                .orElseThrow(EmployeeNotFoundException::new);
    }


    //UPDATE Operation

    public void update(Employee employee, String id) throws EmployeeNotFoundException{
        //Find current record
        Employee currEmployee = employees.stream().filter(emp -> emp.id().equals(id))
                .findFirst()
                .orElseThrow(EmployeeNotFoundException::new);

        //find index in the employees list
        int ind  = employees.indexOf(currEmployee);

        employees.set(ind, employee);

    }

    //DELETE Operation
    public void delete(String id) {
        employees.removeIf(emp -> emp.id().equals(id));
    }

     */
}

