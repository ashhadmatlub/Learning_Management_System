package model.course;

public class Course {
    private String name, code;

    // Constructors
    public Course() {
    }

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Course(Course other) {
        this.name = other.name;
        this.code = other.code;
    }

    // Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    // toString
    public String toString() {
        return "Course Name : " + name + " code : " + code;
    }

    // clone
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
