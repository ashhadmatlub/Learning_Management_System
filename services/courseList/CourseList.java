package services.courseList;

import java.util.ArrayList;
import java.util.List;

import model.course.Course;

public class CourseList {
    private List<Course> courseData;
    private Boolean exists;

    public CourseList() {
        this.courseData = new ArrayList<>();
    }

    public Course getCourse(Course cs) {
        for (Course csr : courseData) {
            if (cs.getCode().equalsIgnoreCase(csr.getCode())) {
                return cs;
            }
        }
        return null;
    }

    // Methpd for add course
    public void addItem(Course crs) {
        exists = false;
        for (Course cs : courseData) {
            if (crs.getCode().equals(cs.getCode())) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            courseData.add(crs);
        } else {
            System.out.println("Course already exists");
        }
    }

    // Method to remove course
    public void removeItem(String code) {
        exists = true;
        for (Course cs : courseData) {
            if (code.equalsIgnoreCase(cs.getCode())) {
                courseData.remove(cs);
                exists = false;
                break;
            }
        }
        if (exists) {
            System.out.println("Course Doesn't exists");
        } else {
            System.out.println("Course removed successfully");
        }
    }

    // Method for searching
    public Course search(String code) {
        for (Course cs : courseData) {
            if (cs.getCode().equalsIgnoreCase(code)) {
                return cs;
            }
        }
        return null;
    }

    // Mehtod to sort the data
    public void sort() {
        courseData.sort((c1, c2) -> {
            Long num1 = Long.parseLong(c1.getCode().replaceAll("\\D", ""));
            Long num2 = Long.parseLong(c2.getCode().replaceAll("\\D", ""));

            return Long.compare(num1, num2);
        });
    }

    // toString
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Course cs : courseData) {
            sb.append(cs.toString()).append("\n");
        }
        return sb.toString();
    }

    // Copy
    public Object clone() throws CloneNotSupportedException {
        CourseList course = new CourseList();
        course.courseData = new ArrayList<>();
        for (Course cs : this.courseData) {
            course.courseData.add(new Course(cs));
        }
        return course;
    }
}
