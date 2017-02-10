import java.util.List;

/**
 * Created by ethan on 2017-02-07.
 */
public class Student extends Person {
    String major;
    private List<Course> courseList;
    boolean fulltime;
    public Student(String name, String emailAddress, String major,boolean fulltime) {
        super(name, emailAddress);
        this.major = major;
        this.fulltime = fulltime;
    }
    public void addCourse(Course c){
        courseList.add(c);
    }
    public String toString() {
        return String.format("Name: %s\nMajor: %s\nEmail: %s", this.name, this.major, this.emailAddress);
    }
}
