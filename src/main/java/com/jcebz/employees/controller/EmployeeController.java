package com.jcebz.employees.controller;

import com.jcebz.employees.exception.EmployeeNotFoundException;
import com.jcebz.employees.model.Employee;
import com.jcebz.employees.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/employees")
@Data
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    /* Not needed when using Lombok... use AllArgsConstructor
    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }*/

    @GetMapping
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Employee> findById(@PathVariable(name="id") String id) throws EmployeeNotFoundException {
        return employeeRepository.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/createEmployee")
    public Employee create(@Valid @RequestBody Employee employee ){
        return employeeRepository.save(employee);
    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(name="id") String id) throws EmployeeNotFoundException{
        Employee emp = employeeRepository.findById(id)
                        .orElseThrow(EmployeeNotFoundException::new);
        employeeRepository.delete(emp);
        return new ResponseEntity<String>("Deleted employee with id: "+ id,HttpStatus.OK);

    }




}
