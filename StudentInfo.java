import java.util.*;

 

class Student {
    String name, major;
    int id;

 

    Student(String name, String major, int id) {
        this.name = name;
        this.major = major;
        this.id = id;
    }
}

 

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> st = new ArrayList<Student>();
        for (int i = 0; i < 3; i++) {
            st.add(new Student(sc.next(), sc.next(), sc.nextInt()));
        }

 

        System.out.println("befor updating");
        for (Student student : st) {
            System.out.println("name : " + student.name + "\tmajor : " + student.major);
        }

 

        for (Student student : st) {
            st.set(1, new Student(student.name, "BBB", student.id));
        }

 

        System.out.println("after updating");
        for (Student student : st) {
            System.out.println("name : " + student.name + "\tmajor : " + student.major);
        }
    }
}
