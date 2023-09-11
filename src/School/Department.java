package School;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
    Scanner scan = new Scanner(System.in);
    ArrayList<Student> studentList = new ArrayList<>();

    void run() {
        readAll();
        printAll();
        search();
    }

    void readAll() {
        while(true){
            int id = scan.nextInt();
            if(id == 0)
                break;
            Student st = new Student();
            st.read(scan, id);
            studentList.add(st);
        }
    }

    void printAll() {
        for (Student st : studentList) {
            st.print();
        }
    }

    void search() {
        String name = null;
        while (true) {
            System.out.print( "키워드:");
            name = scan.next();
            if (name.equals("end"))
                break;
            for (Student st : studentList) {
                if (st.matches(name))
                    st.print();
            }
        }
    }
    public static void main(String[] args){
        Department my = new Department();
        my.run();
    }
}

