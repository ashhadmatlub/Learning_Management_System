package services.studentList;

import java.util.ArrayList;
import java.util.List;

import model.student.Student;

public class StudentList implements Cloneable {
    private List<Student> studentsInfo;
    private boolean yes;

    public StudentList() {
        this.studentsInfo = new ArrayList<>();
    }

    // getter
    public Student getStudent(String id) {
        for (Student std : studentsInfo) {
            if (std.getId().equalsIgnoreCase(id)) {
                return std;
            }
        }
        return null;
    }

    // Method to add a new Student
    public void addItem(Student student) {

        yes = false;
        for (Student stud : studentsInfo) {
            if (stud.getId().equalsIgnoreCase(student.getId())) {
                yes = true;
                break;
            }
        }
        if (!yes) {
            studentsInfo.add(student);
        } else {
            System.out.println("Student already exists in the list");
        }
    }

    // Method to remove Student
    public void removeItem(String seat_no) {

        yes = false;
        for (Student stud : studentsInfo) {
            if (stud.getId().equalsIgnoreCase(seat_no)) {
                studentsInfo.remove(stud);
                yes = true;
                break;
            }
        }
        if (yes) {
            System.out.println("Student removed successfully");
        } else {
            System.out.println("Student doesn't exist");
        }
    }

    // Method for sorting the students acc. to there roll no.
    public void sort() {
        studentsInfo.sort((s1, s2) -> {

            Long num1 = Long.parseLong(s1.getId().replaceAll("\\D", ""));
            Long num2 = Long.parseLong(s2.getId().replaceAll("\\D", ""));
            return Long.compare(num1, num2);
        });
    }

    // Method for searching student acc. to there roll no.
    public Student search(String seat_no) {
        for (Student stud : studentsInfo) {
            if (stud.getId().equalsIgnoreCase(seat_no)) {
                return stud;
            }
        }
        return null;
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
        std.studentsInfo = new ArrayList<>();
        for (Student stud : this.studentsInfo) {
            std.studentsInfo.add(new Student(stud));
        }
        return std;
    }
}
