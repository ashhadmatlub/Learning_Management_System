package data.course;

import java.util.Scanner;

import model.course.Course;
import services.courseList.CourseList;

public class InputC {
    private String name, code;
    private int input;
    private Course course;
    private CourseList cList;

    Scanner sc = new Scanner(System.in);

    public void inputCourseData() {

        cList = new CourseList();

        System.out.println("Enter the number of courses you want to add");
        input = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < input; i++) {

            System.out.println("Enter Course name:");
            name = sc.nextLine();

            System.out.println("Enter Course code:");
            code = sc.nextLine();

            course = new Course(name, code);
            cList.addItem(course);

        }

        cList.sort();
    }

    public void search() {
        System.out.println("Enter Course code:");
        code = sc.nextLine();
        cList.search(code);
    }

    public void remove() {
        System.out.println("Enter Course code");
        code = sc.nextLine();
        cList.removeItem(code);
    }

    public void display() {
        cList.toString();
    }
}
