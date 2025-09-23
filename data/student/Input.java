package data.student;

import java.util.Scanner;

import model.student.Student;
import services.studentList.StudentList;

public class Input {
    private String name, id, field;
    private int year, inp;
    private StudentList stud;
    private Student std;

    Scanner sc = new Scanner(System.in);

    public void inputStudentData() {

        stud = new StudentList();

        System.out.println("Enter the total number of students you wants to add in the list");
        inp = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < inp; i++) {

            System.out.println("Enter name of the student");
            name = sc.nextLine();

            System.out.println("Enter seat no. of the student");
            id = sc.nextLine();

            System.out.println("Enter field of the student");
            field = sc.nextLine();

            System.out.println("Enter year of the student");
            year = sc.nextInt();
            sc.nextLine();
            std = new Student(name, id, field, year);
            stud.addItem(std);
        }

        stud.sort();

        // System.out.println(stud);

    }

    public void search() {
        System.out.println("Enter the I'd of the student");
        id = sc.nextLine(); // input
        stud.search(id);
    }
}
