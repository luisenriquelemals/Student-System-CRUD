package com.example.StudentSystem;

import com.example.StudentSystem.entity.Student;
import com.example.StudentSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Peter", "Tomson", "petertomson@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Alan", "Musk", "alanmusk@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Mark", "Zuckerberg", "markzuk@gmail.com");
//		studentRepository.save(student3);
//
//		Student student4 = new Student("Bill", "Gates", "billgates@gmail.com");
//		studentRepository.save(student4);

	}
}
