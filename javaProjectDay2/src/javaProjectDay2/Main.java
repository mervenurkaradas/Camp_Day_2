package javaProjectDay2;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Nesne tabanl� programlama", 1500, "C# + Angular" );
		Course course2 = new Course(2, "Yaz�l�m geli�tirici yeti�tirme kamp�", 87451, "Java + React" );
		Course course3 = new Course(3, "Programlamaya Giri�", 14862, "Temel Kurs" );
		
		Course[] courses = {course1, course2, course3};
		
		for(Course course: courses)
		{
			System.out.println(course.id +".kursumuz: "+ course.courseName + "\nFiyat�: " +course.unitPrice+ " \nAyr�nt�lar: " +course.detail+"\n");
			
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addCourse(course1);
		courseManager.deleteCourse(course2);

	}

}
