package com.collection.collectoin_homework.service;

import com.collection.collectoin_homework.model.Employee;
import com.collection.collectoin_homework.exceptions.EmployeeAlreadyAddedException;
import com.collection.collectoin_homework.exceptions.EmployeeNotFoundException;
import com.collection.collectoin_homework.exceptions.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {
    static final int maxNumberOfEmployees = 9;
    List<Employee> employees = new ArrayList<>(List.of(
            new Employee("Роман", "Иванов"),
            new Employee("Арсен", "Волков"),
            new Employee("Альберт", "Жмышенко"),
            new Employee("Анна", "Воронина"),
            new Employee("Михаил", "Зубенко"),
            new Employee("Ирина", "Хлебникова")
    ));

    public Employee addEmployee(String firstName, String lastName){
        if (employees.size() >= maxNumberOfEmployees) {
            throw new EmployeeStorageIsFullException("Превышен лимит сотрудников");
        }
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException("Такой сотрудник уже существует");
        }
        employees.add(employee);
        return employee;
    }

    public Employee removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException("Удаляемый сотрудник не найден");
        }
        employees.remove(employee);
        return employee;
    }

    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException("Удаляемый сотрудник не найден");
        }
        return employee;
    }

    public List<Employee> getEmployees() {
        return Collections.unmodifiableList(employees);
    }

}



