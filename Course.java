import java.io.Serializable;

public class Course implements Serializable, Cloneable {    
    public Course() {
    }

    public Course clone() {
        try {
            return (Course) super.clone();
        } catch (Exception e) {
        }
        return null;
    }

public class Course implements Serializable{
    private String subject;
    private int grade;
    private boolean current;
    private Teacher teacher;
}

public Course(String subject, int grade){
    this.subject = subject;
    this.grade = grade;
}

public void setTeacher(Teacher t){
    this.teacher = t;
}

public boolean current(){
    get.current = current;
}

}