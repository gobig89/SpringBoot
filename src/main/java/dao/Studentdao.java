package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import entity.Student;
@Repository
public class Studentdao {
	public static Map<Integer,Student> students;
	
	static{
		students=new HashMap<Integer, Student>(){
			{
		put(1, new Student(1,"GOpi","CSE"));
		put(2, new Student(2,"Karthika","MBA"));
		put(3, new Student(3,"Priya","BIO"));
		}
		};
	}
	
	public Collection<Student> getStudentsdao(){
		return this.students.values();
	}
	
	public Student getStudentsdaoByid(int id){
		return this.students.get(id);
	}
	public void deleteStudentBId(int id){
		this.students.remove(id);
	}
	public void updateStudentById(Student std){
		Student s=students.get(std.getId());
		s.setCourse(std.getCourse());
		s.setName(std.getName());
		students.put(std.getId(), s);
	}
	
	public void createStudents(Student std){
		this.students.put(std.getId(), std);
	}
}
