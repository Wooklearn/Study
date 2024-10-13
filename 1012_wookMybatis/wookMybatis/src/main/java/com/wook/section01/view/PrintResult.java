package com.wook.section01.view;

import com.wook.section01.model.dto.EmployeeDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintResult {


    public void printMemberList(List<EmployeeDTO> employeeList) {

        System.out.println("요청하신 전체 메뉴 조회 결과입니다.");

        for (EmployeeDTO employeeDTO : employeeList) {
            System.out.println("employeeDTO = " + employeeDTO);
        }

    }

    public void printNameList(Map<String, String > employeeName) {

        String name = employeeName.get("name");

        Map<String, String> EmployeeName = new HashMap<>();
        EmployeeName.get(name);

        System.out.println("요청하신 직원 조회 결과입니다.");

        for (EmployeeDTO employeeDTO : EmployeeName) {
            System.out.println("employeeDTO = " + employeeDTO);
        }
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "selectList":
                System.out.println("직원 전체 조회에 실패하셨습니다.");
            case "selectMember":
                System.out.println("입력하신 이름의 직원 조회에 실패하셨습니다.");
        }
    }
}
