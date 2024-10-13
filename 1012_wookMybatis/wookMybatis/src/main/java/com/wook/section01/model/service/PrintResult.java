package com.wook.section01.model.service;

import com.wook.section01.model.dto.EmployeeDTO;

import java.util.List;

public class PrintResult {

    public void printMemberList(List<EmployeeDTO> employeeList) {

        for (EmployeeDTO memberDTO : employeeList) {
            System.out.println("memberDTO = " + memberDTO);
        }

    }
}
