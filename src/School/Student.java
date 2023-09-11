package School;

import java.util.Scanner;

public class Student {
    String name;
    int id;
    String phoneNumber;
    int year;

    /*Student(int id){
        this.id = id;
    }*/

    void read(Scanner scanner, int id){
        this.id = id;
        name = scanner.next();
        phoneNumber = scanner.next();
        year = scanner.nextInt();
    }

    void print() { // Student
        System.out.format("%d %s %s (%d학년)\n" ,id, name, phoneNumber, year);

    }

    boolean matches(String kwd) {
        if(name.contentEquals(kwd))
            return true;
        return(Integer.toString(id).contentEquals(kwd));
    }

}
