package com.example.Employee.controller;

import com.example.Employee.service.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/main")
public class EmployeeController {
    @Autowired
    Employee el;

    @RequestMapping("/data")
    public String empData(){
        el.empData();
        return "The employee data is printed.";
    }
}
