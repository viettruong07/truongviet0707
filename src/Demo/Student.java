package Demo;

public class Student {
    private int id;
    private String name;
    private String email;
    private float GPA;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(int id, String name, String email, float GPA) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
