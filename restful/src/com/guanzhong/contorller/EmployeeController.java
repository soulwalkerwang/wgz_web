package com.guanzhong.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guanzhong.bean.Department;
import com.guanzhong.bean.Employee;
import com.guanzhong.service.DepartmentService;
import com.guanzhong.service.EmployeeService;


@Controller
@RequestMapping(value="/department")
public class EmployeeController
{
	
	EmployeeService employeeService;
	DepartmentService departmentService;
	
	
	@Autowired
	public EmployeeController(EmployeeService employeeService, DepartmentService departmentService)
	{
		
		this.employeeService = employeeService;
		this.departmentService = departmentService;
		
	}
	
	@RequestMapping(value="/{did}/employee", method=RequestMethod.GET)
	public @ResponseBody List<Employee> getAllEmpByDepId(@PathVariable("did") Integer department_id, 
			                       ModelMap modelMap) 
	{
		List<Employee> list = employeeService.findAllDepartment(department_id);
		modelMap.addAttribute("list", list);
		
		return list;
		
		
    }
	
	@RequestMapping(value="/{did}/employee/{eid}", method=RequestMethod.GET)
	public @ResponseBody Employee getEmpByDepId(@PathVariable("did") Integer department_id,
			                    @PathVariable("eid") Integer employee_id,
			                    ModelMap modelMap)
	{
		Employee employee = employeeService.findbyEmployeeId(department_id, employee_id);
		modelMap.addAttribute("employee", employee);
		
		System.out.println(employee.getEmployee_name());
		
		return employee;
		
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody List<Employee> getAllEmployee(ModelMap modelMap)
	{
		List<Employee> list = employeeService.findAllEmployee();
		modelMap.addAttribute("list", list);
		
		return list;
		
	}
	
	@RequestMapping(value="/{did}/employee/{eid}", method=RequestMethod.DELETE)
	public String deleteEmpById(@PathVariable("eid") Integer employee_id,
			                    ModelMap modelMap)
	{
		boolean flag = false;
		flag = employeeService.delete(employee_id);
		if(flag == true)
		{
			modelMap.addAttribute("flag","SUCCESS");
		}
		else
		{
			modelMap.addAttribute("flag","FAIL");
			
		}
		
		return "showflag";
		
		
	}
	
	
	@RequestMapping(value="/{did}/employee", method=RequestMethod.POST)
	public String saveEmpByDepId(@PathVariable("did") Integer department_id,
			                       @RequestParam("employee_name") String employee_name,
			                       ModelMap modelMap) 
	{
		
		
		Department department = employeeService.getDepartmentById(department_id);
		Employee employee = new Employee();
		employee.setEmployee_name(employee_name);
		employee.setDepartment(department);
		
		employeeService.save(employee);
		
		
		
		return "showflag";
		
		
    }
	
	@RequestMapping(value="/{did}/employee/{eid}", method=RequestMethod.PUT)
	public String updateEmpByDepId(@PathVariable("did") Integer department_id,
			                     @PathVariable("eid") Integer employee_id,
			                     @RequestParam("employee_name") String employee_name,
			                       ModelMap modelMap)
	{
		boolean flag = false;
		Employee employee = employeeService.getEmployeeById(employee_id);
		employee.setEmployee_name(employee_name);
		
		flag = employeeService.update(employee);
		
		if(flag == true)
		{
			modelMap.addAttribute("flag","SUCCESS");
		}
		else
		{
			modelMap.addAttribute("flag","FAIL");
			
		}
		
		return "showflag";
		
		
		
	}
	
	@RequestMapping(value="/{did}", method=RequestMethod.GET)
	public @ResponseBody Department getAllEmpByDepId(@PathVariable("did") Integer department_id) 
	{
		
		Department department = departmentService.getDepartmentById(department_id);
		
		return department;
		
		
    }
	
	@RequestMapping(method=RequestMethod.POST)
	public void saveDepartment( @RequestParam("department_name") String department_name)
	{
		Department department = new Department();
		department.setDepartment_name(department_name);
	    departmentService.save(department);
		
		
		
	}
	
	
	@RequestMapping(value="/{did}", method=RequestMethod.DELETE)
	public void deleteDepartmentById(@PathVariable("did") Integer department_id)
	{
		
		departmentService.delete(department_id);
		
		
		
	}

	@RequestMapping(value="/{did}", method=RequestMethod.PUT)
	public void updateDepartmentById(@PathVariable("did") Integer department_id,
			@RequestParam("department_name") String department_name)
	{
		
		Department department = departmentService.getDepartmentById(department_id);
		department.setDepartment_name(department_name);
		
		departmentService.update(department);
		
	}
	
	 

}
