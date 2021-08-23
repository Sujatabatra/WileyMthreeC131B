package com.sujata.controllers;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.naming.Binding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePaySlip;
import com.sujata.bean.User;
import com.sujata.model.service.EmployeeService;
import com.sujata.model.service.UserService;

@Controller
@SessionAttributes({"user"})
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public ModelAndView loginPageController() {
		return new ModelAndView("login","user",new User());
	}
	
	@RequestMapping("/login")
	public ModelAndView loginCheck(@ModelAttribute("user") User usr/*,HttpSession session*/){
		ModelAndView modelAndView=new ModelAndView();
		
		User user=userService.getUserByCredentials(usr);
		modelAndView.addObject("user", usr);
		String message;
		if(usr==null) {
			message="Invalid Login Credentials";
			modelAndView.addObject("message", message);
			modelAndView.setViewName("loginFailed");
		}
		else {
			modelAndView.addObject("user", usr); //request scope
//			session.setAttribute("user", user);
			
			modelAndView.setViewName("index");
		}
		return modelAndView;
	}
	
	@RequestMapping("/main")
	public ModelAndView welcomePageController() {
		return new ModelAndView("index");
	}

	@RequestMapping("/insertEmpPage")
	public ModelAndView insertEmpPageController() {
		return new ModelAndView("insertEmp", "emp", new Employee());
	}

	@ModelAttribute("empIds")
	public List<Integer> getAllIds() {
		return employeeService.getAllEmployees().stream().map(Employee::getEmpId).collect(Collectors.toList());
	}

	@RequestMapping("/save")
	public ModelAndView insertEmployee(@ModelAttribute("emp") Employee employee,
			BindingResult result/* HttpServletRequest request */) {
		ModelAndView modelAndView = new ModelAndView();
		if (result.hasErrors()) {
			return new ModelAndView("insertEmp", "command", new Employee());
		}

		String message = null;
		if (employeeService.insertEmployee(employee))
			message = "Employee Added Succesfully";
		else
			message = "Employee Can't be Added";

		modelAndView.addObject("message", message);

		modelAndView.setViewName("output");

		return modelAndView;
	}

	@RequestMapping("/deleteEmpPage")
	public ModelAndView deleteEmpPageController() {
		return new ModelAndView("deleteEmp");
	}

	@RequestMapping("/delete")
	public ModelAndView deleteEmployee(@RequestParam("empId") int eid/* HttpServletRequest request */) {
		ModelAndView modelAndView = new ModelAndView();
		String message = null;
//		if(employeeService.deleteEmployee(Integer.parseInt(request.getParameter("empId"))))
		if (employeeService.deleteEmployee(eid))
			message = "Employee Record Deleted";
		else
			message = "Employee Record Not Deleted";

		modelAndView.addObject("message", message);
		modelAndView.setViewName("output");

		return modelAndView;
	}

	@RequestMapping("/updateEmpPage")
	public ModelAndView updateEmployeePageController() {
		return new ModelAndView("updateEmp", "command", new Employee());
	}

	@RequestMapping("/updateEmp")
	public ModelAndView updateEmployeeController(@ModelAttribute Employee employee/* HttpServletRequest request */) {

		String message = null;
		if (employeeService.UpdateEmployeeSalary(employee.getEmpId(), employee.getEmpSalary()))
			message = "Employee Salary Updated Succesfully";
		else
			message = "Employee Salary not Updated";

		return new ModelAndView("output", "message", message);
	}

	@RequestMapping("/searchEmpPage")
	public ModelAndView searchEmpPageController() {
		return new ModelAndView("searchEmp");
	}

	@RequestMapping("/searchEmp")
	public ModelAndView searchEmpController(HttpServletRequest request) {
		Employee employee = employeeService.searchEmployeeById(Integer.parseInt(request.getParameter("empId")));
		return new ModelAndView("showEmp", "employee", employee);
	}

	@RequestMapping("/generatePaySlipPage")
	public ModelAndView generatePaySlipPageController() {
		return new ModelAndView("inputEmpIdForPaySlip");
	}

	@RequestMapping("/payslip")
	public ModelAndView paysipController(HttpServletRequest request) {
		EmployeePaySlip payslip = employeeService.getPaySlip(Integer.parseInt(request.getParameter("empId")));

		return new ModelAndView("showPayslip", "payslip", payslip);
	}

	@RequestMapping("/displayAllEmps")
	public ModelAndView displayAllEmployeesController() {
		Collection<Employee> emps = employeeService.getAllEmployees();

		return new ModelAndView("displayAllEmployees", "employees", emps);
	}
}
