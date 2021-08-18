package javaProjectDay2;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Nesne tabanlı programlama", 1500, "C# + Angular" );
		Course course2 = new Course(2, "Yazılım geliştirici yetiştirme kampı", 87451, "Java + React" );
		Course course3 = new Course(3, "Programlamaya Giriş", 14862, "Temel Kurs" );
		
		Course[] courses = {course1, course2, course3};
		
		for(Course course: courses)
		{
			System.out.println(course.id +".kursumuz: "+ course.courseName + "\nFiyatı: " +course.unitPrice+ " \nAyrıntılar: " +course.detail+"\n");
			
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addCourse(course1);
		courseManager.deleteCourse(course2);

	}

}
