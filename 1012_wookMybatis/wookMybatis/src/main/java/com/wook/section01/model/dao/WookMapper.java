package com.wook.section01.model.dao;

import com.wook.section01.model.dto.EmployeeDTO;

import java.util.List;

public interface WookMapper {

    List<EmployeeDTO> selectAllEmployee();
}
