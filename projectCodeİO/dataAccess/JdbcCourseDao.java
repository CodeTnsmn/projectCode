package projectCodeİO.dataAccess;

import projectCodeİO.entities.Course;

public class JdbcCourseDao implements CourseDao {

	public void add(Course course) {
		System.out.println("JDBC ile veritabanına kurs eklendi.");
	}
}
