package javaProjectDay2;

public class CourseManager {
	public void addCourse(Course course)
	{
		System.out.println(course.courseName+ " isimli kurs listenize eklendi");
	}
	
	public void deleteCourse(Course course)
	{
		System.out.println(course.courseName + " isimli kurs listenizden silindi");
	}
}
