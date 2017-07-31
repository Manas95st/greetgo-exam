package kz.manas.exam1.mappers;



import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import kz.manas.exam1.models.Students;


public interface StudentsMapper {
	
	@Insert("INSERT INTO students (firstname, lastname, level,"
			+ "valuation) VALUES"
			+ "(#{firstname},#{lastname}, #{level}, #{valuation})")
	@Options(useGeneratedKeys=true, keyProperty="id", flushCache=true, keyColumn="id")
	public void insertStudent(Students student);
		
	
	
	@Select("SELECT * FROM students")
	@Options(flushCache=true)
	public List<Students> getStudents();
	
	@Delete("DELETE FROM students WHERE id = #{id}")
	@Options(flushCache=true)
	public void deleteStudent(long id);
	
	
}
