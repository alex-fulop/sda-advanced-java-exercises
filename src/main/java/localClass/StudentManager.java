package localClass;

public class StudentManager {
	public void processStudent(String name, int age, String specialization) {
		class Student {
			private String studentName;
			private int studentAge;
			private String studentSpecialization;

			public Student(String studentName, int studentAge, String studentSpecialization) {
				this.studentName = studentName;
				this.studentAge = studentAge;
				this.studentSpecialization = studentSpecialization;
			}

			public void displayInfo() {
				System.out.println("Student Name: " + studentName);
				System.out.println("Student Age: " + studentAge);
				System.out.println("Student Specialization: " + studentSpecialization);
			}
		}

		Student student1 = new Student(name, age, specialization);
		Student student2 = new Student("Ana", 20, "Inginerie");

		student1.displayInfo();

		System.out.println();

		student2.displayInfo();
	}
}
