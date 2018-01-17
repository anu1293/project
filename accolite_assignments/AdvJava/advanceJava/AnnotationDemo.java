package advanceJava;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface StudentAnnotation {
	String branch();

	int code();

	String college() default "IIITB";
}

@StudentAnnotation(branch = "CSE", code = 5)
class UGStudentAnnotation {
	public void display() {
		StudentAnnotation s = getClass().getAnnotation(StudentAnnotation.class);
		System.out.println(s.branch());
		System.out.println(s.code());
		System.out.println(s.college());
	}
}

public class AnnotationDemo {

	public static void main(String[] args) {
		UGStudentAnnotation ug = new UGStudentAnnotation();
		ug.display();
	}

}

