package projectCodeİO.dataAccess;

import projectCodeİO.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanına eğitmen eklendi.");
	}
}
