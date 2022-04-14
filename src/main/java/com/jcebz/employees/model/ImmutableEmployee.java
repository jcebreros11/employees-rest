package com.jcebz.employees.model;

import java.util.Date;
import java.util.Objects;

public class ImmutableEmployee {
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String title;
    private final String department;
    private final Date startDate;
    private final String status;
    private final double salary;

    public ImmutableEmployee(Long id, String firstName, String lastName, String title, String department, Date startDate, String status, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.department = department;
        this.startDate = startDate;
        this.status = status;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getDepartment() {
        return department;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getStatus() {
        return status;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableEmployee that = (ImmutableEmployee) o;
        return Double.compare(that.salary, salary) == 0 && id.equals(that.id) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && title.equals(that.title) && department.equals(that.department) && startDate.equals(that.startDate) && status.equals(that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, title, department, startDate, status, salary);
    }

    @Override
    public String toString() {
        return "ImmutableEmployee{" +
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
