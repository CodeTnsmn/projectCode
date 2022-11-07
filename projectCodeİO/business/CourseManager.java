package projectCodeİO.business;



import projectCodeİO.core.Logger;
import projectCodeİO.dataAccess.CourseDao;
import projectCodeİO.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if(course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
		}
		if(course.getName().equals(course.getName())) {
			throw new Exception("Kurs ismi tekrarlanamaz.");
		}
		
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
