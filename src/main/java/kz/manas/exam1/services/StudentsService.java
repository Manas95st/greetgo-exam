package kz.manas.exam1.services;

import java.util.List;

import kz.manas.exam1.models.Students;

public interface StudentsService {
	public boolean addStudent(Students student);
	public List<Students> getStudents();
	public boolean deleteStudent(Long id);
}
