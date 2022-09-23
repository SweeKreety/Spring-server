package com.example.demo;

import com.example.demo.model.students.Students;
import com.example.demo.model.students.StudentsDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringClientServerApplicationTests {
@Autowired
private StudentsDao studentsdao;
	//@Test
	void addStudentsList() {
		Students students= new Students();
		students.setName("Ariana");
		students.setAddress("Gongabu");
		students.setContact(98215478);
		studentsdao.save(students);
	}
	@Test
	void getAllStudentsAndDeleteThem(){
		List<Students> student= studentsdao.getAllStudents();
		for (Students students : student){
			studentsdao.delete(students);
		}


	}

}
