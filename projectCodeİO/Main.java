package projectCodeİO;

import projectCodeİO.business.CategoryManager;
import projectCodeİO.business.CourseManager;
import projectCodeİO.business.InstructorManager;
import projectCodeİO.core.DatabaseLogger;
import projectCodeİO.core.FileLogger;
import projectCodeİO.core.Logger;
import projectCodeİO.core.MailLogger;
import projectCodeİO.dataAccess.HibernateCategoryDao;
import projectCodeİO.dataAccess.HibernateCourseDao;
import projectCodeİO.dataAccess.JdbcInstructorDao;
import projectCodeİO.entities.Category;
import projectCodeİO.entities.Course;
import projectCodeİO.entities.Instructor;

public class Main {

public static void main(String[] args) throws Exception {
		
		Instructor instructor = new Instructor(1, "Abdurrahman", "Tanışman", 2000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor);
		
		Course course = new Course(2, "Java Kursu", 1000);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
		
		Category category = new Category(3, "Eğitim");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category);
	}

}
