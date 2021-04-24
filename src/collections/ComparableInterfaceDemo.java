package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Teacher implements Comparable<Teacher> {
    int id, teachingHours;
    String name, subName;

    public Teacher(int id, int teachingHours, String name, String subName) {
        this.id = id;
        this.teachingHours = teachingHours;
        this.name = name;
        this.subName = subName;
    }

    @Override
    public int compareTo(Teacher o) {
        return id>o.id?1:-1;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teachingHours=" + teachingHours +
                ", name='" + name + '\'' +
                ", subName='" + subName + '\'' +
                '}';
    }
}

public class ComparableInterfaceDemo {
    public static void main(String[] args) {
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher(100, 2, "Samrat Kumar", "Basics Of C Language"));
        teacherList.add(new Teacher(123, 4, "Nikhil Kumar", "Java Programming"));
        teacherList.add(new Teacher(142, 3, "Golu Barnwal", "Python Language"));
        teacherList.add(new Teacher(111, 8, "Anushka Barnwal", "Statistical Math"));
        teacherList.add(new Teacher(105, 1, "Komal Kumari", "Science"));

        System.out.println("Before Any Sorting : ");

        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }

        Collections.sort(teacherList);

        System.out.println("After Sorting on the basis of Id : ");
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }

        System.out.println("After Sorting on the basis of Teaching Hour : ");
        // we can't change the class file so that we have to pass comparator
        // lambda expression to the Collection class
        Collections.sort(teacherList,(obj1,obj2)->obj1.teachingHours>obj2.teachingHours?1:-1);
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }




    }
}
