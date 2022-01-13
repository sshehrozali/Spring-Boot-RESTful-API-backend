package student;

import java.time.LocalDate;

public class Student {

    // Attributes for a Student
    private int id;
    private String name;
    private LocalDate birth;

    // Constructor without anything
    public Student() {
    }

    // Constructor with everything
    public Student(int id, String name, LocalDate birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    // Constructor without ID -> Because Database will already generate it for us
    public Student(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    // Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
