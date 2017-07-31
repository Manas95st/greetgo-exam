package kz.manas.exam1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kz.manas.exam1.mappers.StudentsMapper;
import kz.manas.exam1.models.Students;

@Service("studentsService")
public class StudentsServiceImpl implements StudentsService{
	
	@Autowired
	private StudentsMapper studentsMapper;
	
	@Transactional
	public boolean addStudent(Students students) {
		studentsMapper.insertStudent(students);
		return true;
	}
	
	public List<Students> getStudents(){
		return studentsMapper.getStudents();
	}
	
	public boolean deleteStudent(Long id) {
		studentsMapper.deleteStudent(id);
		return true;
	}
	
	
}
