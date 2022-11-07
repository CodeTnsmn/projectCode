package projectCodeİO.dataAccess;

import projectCodeİO.entities.Course;

public class HibernateCourseDao implements CourseDao {

	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına kurs eklendi.");
	}
}
