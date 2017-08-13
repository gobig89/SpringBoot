package controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import entity.Student;
import services.StudentService;

@RestController
@RequestMapping("/students")
public class Studentcontroller {

	@Autowired
	private StudentService studentservice;
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Student> getStudents(){
		return studentservice.getStudentsService();
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Student getStudents(@PathVariable("id") int id){
		return studentservice.getStudentsServiceByid(id);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	
	public void deleteStudentBId(@PathVariable("id") int id){
		this.studentservice.deleteStudentBId(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void updateStudentsById(@RequestBody Student std){
		this.studentservice.updateStudentsByIdService(std);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void createStudents(@RequestBody Student std){
		this.studentservice.createStudents(std);
	}
}
