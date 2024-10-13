package com.wook.section01.controller;

import com.wook.section01.model.dto.EmployeeDTO;
import com.wook.section01.model.service.EmployeeService;
import com.wook.section01.view.PrintResult;

import java.util.List;

public class Controller {
    private final EmployeeService employeeService;
    private final PrintResult printResult;


    public Controller() {

        this.employeeService = new EmployeeService();
        this.printResult = new PrintResult();

    }

    public void selectAllEmployee() {

        List<EmployeeDTO> employeeList = employeeService.selectAlleEmployee();

        if (employeeList != null) {
            printResult.printMemberList(employeeList);
        } else {
            printResult.printErrorMessage("selectList");
        }

    }



}
