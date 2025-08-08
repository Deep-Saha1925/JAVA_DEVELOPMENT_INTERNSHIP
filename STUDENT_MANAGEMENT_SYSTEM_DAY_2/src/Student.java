package STUDENT_MANAGEMENT_SYSTEM_DAY_2.src;
public class Student {
    private Long id;
    private String name;
    private Double marks;

    public Student(Long id, String name, Double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    //getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Double getMarks() {
        return marks;
    }
    public void setMarks(Double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
