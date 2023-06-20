package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("allEmp",service.findAllEmployees());
        model.addAttribute("emp", new Employee());
        return "employee";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("emp") Employee emp) {
        service.createEmployee(emp);
        return "redirect:/employee/";
    }
}
