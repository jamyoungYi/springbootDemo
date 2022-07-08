package com.yi.springbootdemo.mapper;

import com.yi.springbootdemo.entities.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDept(Integer id);

    //useGeneratedKeys使用自动递增列，设置主键返回到的属性
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int addDept(Department department);

    @Insert("update department set departmentName = #{departmentName} where id=#{id}")
    public int updateDept(Department department);

    @Select("select * from department")
    public List<Department> getAllDept();

}

