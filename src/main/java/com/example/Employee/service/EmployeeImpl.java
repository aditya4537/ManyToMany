package com.example.Employee.service;

import com.example.Employee.model.EmployeeData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeImpl implements Employee{

    ArrayList<EmployeeData> ed = new ArrayList<>();
    @Override
    public void empData() {
        ed.clear();
        EmployeeData e1 = new EmployeeData();
        e1.setName("Aditya");
        e1.setSalary(200000);
        ed.add(e1);

        EmployeeData e2 = new EmployeeData();
        e2.setName("Patel");
        e2.setSalary(150000);
        ed.add(e2);

        System.out.println(ed);
    }
}
