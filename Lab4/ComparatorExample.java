import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        // create list students
        List<Student> listStudents = new ArrayList<Student>();

        // add students to list
        listStudents.add(new Student("Vinh",5,6,7));
        listStudents.add(new Student("Quy",8,6,7));
        listStudents.add(new Student("Quang",6,6,7));
        listStudents.add(new Student("Phu",7,6,7));

        // sort list student by it's name ASC
        System.out.println("sort list student by it's name ASC: ");
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.average() < o2.average() ? -1 : o1.average() == o2.average() ? 0 : 1;
            }
        });
        // show list students
        for (Student student : listStudents) {
            System.out.println();
            System.out.println(student.toString());
        }
    }
}