package kz.manas.exam1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.*;
import kz.manas.exam1.services.*;
import kz.manas.exam1.models.*;

@Test
@ContextConfiguration(locations = { "file:C:/Users/Manas/workspace/exam2/src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
public class StudentsServiceImplTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private StudentsService studentsService;
	
	 
	 @Test()
	 public void testInsertStudent() {
		 Students actual = new Students();
		 actual.setFirstname("Manas");
		 actual.setLastname("Amandos");
		 actual.setLevel("BCs");
		 actual.setValuation((long)4);
		 studentsService.addStudent(actual);
		 List<Students> students = studentsService.getStudents();
		 Students expected = students.get(students.size() - 1);
		 Assert.assertEquals(actual.getFirstname(), expected.getFirstname());
		 Assert.assertEquals(actual.getLastname(), expected.getLastname());
		 Assert.assertEquals(actual.getLevel(), expected.getLevel());
		 Assert.assertEquals(actual.getValuation(), expected.getValuation());
	 }
}