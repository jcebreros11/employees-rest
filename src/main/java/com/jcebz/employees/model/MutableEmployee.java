package com.jcebz.employees.model;

import java.util.Date;
import java.util.Objects;

public class MutableEmployee {
    private Long id;
    private String firstName;
    private String lastName;
    private String title;
    private String department;
    private Date startDate;
    private String status;
    private double salary;

    public MutableEmployee(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableEmployee that = (MutableEmployee) o;
        return Double.compare(that.salary, salary) == 0 && id.equals(that.id) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && title.equals(that.title) && department.equals(that.department) && startDate.equals(that.startDate) && status.equals(that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, title, department, startDate, status, salary);
    }

    @Override
    public String toString() {
        return "MutableEmployee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                ", startDate=" + startDate +
                ", status='" + status + '\'' +
                ", salary=" + salary +
                '}';
    }
}
