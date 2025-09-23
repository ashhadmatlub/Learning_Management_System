package services.studentList;

import java.util.ArrayList;
import java.util.List;

import model.student.Student;

public class StudentList implements Cloneable {
    private List<Student> studentsInfo = new ArrayList<>();

    // Method to add a new Student
    public void addItem(Student student) {
        studentsInfo.add(student);
    }

    // Method to remove Student
    public void removeItem(String seat_no) {
        for (Student stud : studentsInfo) {
            if (stud.getId().equals(seat_no)) {
                studentsInfo.remove(stud);
                break;
            } else {
                System.out.println("Student doesn't exist");
            }
        }
    }

    // Method for sorting the students acc. to there roll no.
    public void sort() {
        studentsInfo.sort((s1, s2) -> {

            int num1 = Integer.parseInt(s1.getId().replaceAll("\\D", ""));
            int num2 = Integer.parseInt(s2.getId().replaceAll("\\D", ""));
            return Integer.compare(num1, num2);
        });
    }

    // Method for searching student acc. to there roll no.
    public void search(String seat_no) {
        for (Student stud : studentsInfo) {
            if (stud.getId().equals(seat_no)) {
                System.out.println(stud);
                break;
            } else {
                continue;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student stud : studentsInfo) {
            sb.append(stud.toString()).append("\n");
        }

        return sb.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        StudentList std = new StudentList();
        std.studentsInfo = new ArrayList<>(this.studentsInfo);
        return std;
    }
}
