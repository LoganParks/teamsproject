import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TEAMS{
    static ArrayList<Student> students;
    static ArrayList<Teacher> teachers;
    static ArrayList<Course> courses;

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        
        //Load the data if available ### DO NOT CHANGE THIS PART
        try{
            students =(ArrayList<Student>)loadData("students");

        }catch(Exception e){
            students = new ArrayList<>();
        }
        try{
            teachers =(ArrayList<Teacher>)loadData("teachers");
        }catch(Exception e){
            teachers = new ArrayList<>();
        }
        try{
            courses =(ArrayList<Course>)loadData("courses");
        }catch(Exception e){
            courses = new ArrayList<>();
        }


        //############## MAIN MENU STARTS HERE ##############
        int ans = 0;

        while(ans != -1){
            System.out.println("1. ");
        }
        

    }

    //#### DO NOT CHANGE THIS FUNCTION ####
    public static void saveData()throws Exception{
        FileOutputStream f1 = new FileOutputStream("students");
        ObjectOutputStream os = new ObjectOutputStream(f1);
        os.writeObject(students);
        os.close();
        f1.close();

        FileOutputStream f2 = new FileOutputStream("courses");
        os = new ObjectOutputStream(f2);
        os.writeObject(courses);
        os.close();
        f2.close();

        FileOutputStream f3 = new FileOutputStream("teachers");
        os = new ObjectOutputStream(f3);
        os.writeObject(teachers);
        os.close();
        f3.close();
    }

    //#### DO NOT CHANGE THIS FUNCTION ####
    public static Object loadData(String name) throws Exception{
        FileInputStream fis = new FileInputStream(name);
        ObjectInputStream ois = new  ObjectInputStream(fis);   
        Object o = ois.readObject();
        ois.close();
        fis.close();
        return o;
    }
}

System.out.println("Pick a class ");
listCourses();
System.out.println();
System.out.println("Choice: ");
ans = sc.nextInt();
sc.nextLine();
if (ans > -1 && ans < courses.size()) {
    Course c = courses.get(ans).clone();
    int grade = sc.nextline();
    c.setGrade(grade);
    sc.nextLine();
    System.out.println("Currently taking it (y/n)? ");
    String yesNo = sc.nextLine();
    if (yesNo.equals("y")) {
        c.setCurrent(current: true);
    }
    student.addCourse(c);
}

public int TotalGrade(){
    TotalGrade = TG;
    TG = (Grades/2);
}

public boolean calculateGPA(){
if
(TG = (TG > 89),(TG < 100));
    System.out.println("GPA is 5");
if
(TG = (TG > 79) , (TG < 90));
    System.out.println("GPA is 4");
if
(TG = ( TG > 69 ), (TG < 80));
    System.out.println("GPA is 3");
if
(TG = (TG > 59) , (TG < 70));
    System.out.println("GPA is 2");
if
(TG < 60);
    System.out.println(" GPA is 1 which is bad, go fix it.");
}

public void setName(string name) {
    Name = name;
}
public int getGradeLevel() {
    return GradeLevel;
}
public void setGradeLevel(int gradeLevel) {
    GradeLevel = gradeLevel;
}
public int getGPA() {
    return GPA;
}
public void setGPA(int gPA) {
    GPA = gPA;
}
public int getTotalGrade() {
    return TotalGrade;
}
public void setTotalGrade(int totalGrade) {
    TotalGrade = totalGrade;
}
