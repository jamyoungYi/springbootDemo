package com.yi.springbootdemo.mapper;

import com.yi.springbootdemo.entities.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);

    public List<Employee> getAllEmp();

    public int updateEmp(Employee employee);

    public int deleteEmp(Integer id);

}
