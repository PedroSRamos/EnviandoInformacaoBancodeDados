package br.edu.univas.repository;

import br.edu.univas.configuration.DatabaseConfiguration;
import br.edu.univas.vo.Student;

public class StudentRepository {

	private DatabaseConfiguration databaseConfiguration;

	public StudentRepository() {
		databaseConfiguration = DatabaseConfiguration.getInstanceDatadase();
	}

	public void insert(Student student) {
		//proceed with insert object in database
	}
}
