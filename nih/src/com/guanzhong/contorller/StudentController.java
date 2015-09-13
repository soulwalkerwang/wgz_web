package com.guanzhong.contorller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guanzhong.bean.Student;
import com.guanzhong.service.StudentService;

@Controller
public class StudentController
{
	@Autowired
	
	StudentService studentService;
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public void saveStudent(HttpServletRequest request, ModelMap modelMap)
	{
		String studentName = request.getParameter("student_name");
		Integer studentSsn = Integer.parseInt(request.getParameter("student_ssn"));
		
		Student student = new Student();
		
		student.setSsn(studentSsn);
		student.setStudentName(studentName);
		
		studentService.save(student);
		
	}

}
