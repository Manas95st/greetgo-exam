package kz.manas.exam1.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kz.manas.exam1.models.Students;
import kz.manas.exam1.services.StudentsService;

@Controller
public class StudentsController {
	
	@Autowired
	private StudentsService studentsService;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    
	@RequestMapping(value = "/table", method = RequestMethod.GET)
	public String table(Model model){
		model.addAttribute("list", studentsService.getStudents());
		return "table";
	}
	

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addStudent(Model model){
		model.addAttribute("student", new Students());
		return "add";
	}
	
    
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudentInDB(@ModelAttribute("student") Students student, Model model){
		studentsService.addStudent(student);
		return "redirect:/table";
	}
	
    
	@RequestMapping(value = "/deletequestion/{id}/{name}", method = RequestMethod.GET)
	public String deleteStudent(@PathVariable int id,@PathVariable String name, Model model){
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		return "delete";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteStudentInDB(@PathVariable int id, Model model){
		studentsService.deleteStudent((long) id);
		return "redirect:/table";
	}
	
	
}
