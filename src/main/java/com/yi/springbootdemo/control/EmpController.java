package com.yi.springbootdemo.control;

import com.yi.springbootdemo.entities.Department;
import com.yi.springbootdemo.entities.Employee;
import com.yi.springbootdemo.mapper.DepartmentMapper;
import com.yi.springbootdemo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    @RequestMapping(value = "/user/login")
    public String login(String username, String password, HttpSession session, HttpServletRequest request){
        if (username.equals("admin")&&password.equals("123")){
            session.setAttribute("username",username);
            return "redirect:/main.html";
        }
        else {
            request.setAttribute("message","账户名或密码错误！");
            return "index";
        }
    }
    @GetMapping(value = "/emps")
    public String emps(HttpServletRequest request){
        List<Employee> emps = employeeMapper.getAllEmp();
        for (Employee emp : emps) {
            System.out.println(emp);
        }
        request.setAttribute("emps",emps);
        return "list";
    }
    @GetMapping("/emp")
    public String toAddPage(HttpServletRequest request){
        request.setAttribute("depts",departmentMapper.getAllDept());
        return "addemp";
    }

    @GetMapping("/emp/{id}")
    public String toUpdatePage(@PathVariable("id")Integer id,HttpServletRequest request){
        Employee employee = employeeMapper.getEmpById(id);
        System.out.println("查询到的员工列表"+employee);
        request.setAttribute("emp",employee);
        List<Department> deptList = departmentMapper.getAllDept();
        System.out.println("查询到的部门列表"+deptList);
        request.setAttribute("depts",deptList);
        return "updateemp";
    }
    @PutMapping("/emp")
    public String updateEmp(Employee employee){
        System.out.println("修改成功"+employee);
        int flag = employeeMapper.updateEmp(employee);
        System.out.println(flag);
        return "redirect:/emps";
    }

    @PostMapping("/emp")
    public String addEmp(Employee emp,HttpServletRequest request){
        System.out.println(emp);
        employeeMapper.insertEmp(emp);
        return "redirect:/emps";
    }

    @DeleteMapping(value = "/emp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        System.out.println("删除成功"+id);
        employeeMapper.deleteEmp(id);
        return "redirect:/emps";
    }

}
