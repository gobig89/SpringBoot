package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Studentdao;
import entity.Student;

@Service
public class StudentService {
	@Autowired
	private Studentdao studentsdao;
	
	public Collection<Student> getStudentsService(){
		return studentsdao.getStudentsdao();
	}
	
	public Student getStudentsServiceByid(int id){
		return studentsdao.getStudentsdaoByid(id);
	}
	
	public void deleteStudentBId(int id){
		this.studentsdao.deleteStudentBId(id);
	}
	public void updateStudentsByIdService(Student std){
		this.studentsdao.updateStudentById(std);
	}
	public void createStudents(Student std){
		this.studentsdao.createStudents(std);
	}
}
