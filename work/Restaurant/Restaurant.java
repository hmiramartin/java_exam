package com.gfa.exam.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    protected String name;
    protected int founded;
    protected List<Employee> employees;

    public Restaurant(String name, int founded) {
        this.name = name;
        this.founded = founded;
        this.employees = new ArrayList<>();
    }

    public void guestsArrived() {
        for (Employee employee : employees) {
            employee.work();
        }
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }
}
