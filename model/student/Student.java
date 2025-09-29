package model.student;

public class Student implements Cloneable {
    private String name, id, field;
    private int year;

    public Student() {
    }

    public Student(String name, String id, String field, int year) {
        this.name = name;
        this.id = id;
        this.field = field;
        this.year = year;
    }

    public Student(Student other) {
        this.name = other.name;
        this.id = other.id;
        this.field = other.field;
        this.year = other.year;
    }

    // setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String seat_no) {
        this.id = seat_no;
    }

    public String getId() {
        return id;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "Name : " + name + ", I'd : " + id + ", Field : " + field + ", Year : " + year;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
