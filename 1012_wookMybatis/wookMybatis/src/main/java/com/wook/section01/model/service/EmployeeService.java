package com.wook.section01.model.service;

import com.wook.section01.model.dao.WookMapper;
import com.wook.section01.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.wook.section01.common.Template.getSqlSession;

public class EmployeeService {

    private WookMapper wookMapper;

    public List<EmployeeDTO> selectAlleEmployee () {

        SqlSession sqlSession = getSqlSession();

        wookMapper = sqlSession.getMapper(WookMapper.class);

        List<EmployeeDTO> memberDTO = wookMapper.selectAllEmployee();

        sqlSession.close();

        return memberDTO;

    }
}
