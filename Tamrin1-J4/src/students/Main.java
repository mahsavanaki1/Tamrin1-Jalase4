package students;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter fullname: ");
        student.setFullname(scanner.nextLine());
        System.out.print("Enter username: ");
        student.setUsername(scanner.nextLine());
        System.out.print("Enter password: ");
        student.setPassword(scanner.nextLine());
        if (student.getFullname() == null || student.getUsername() == null) {
            System.out.println("Nothing To Show :(");
        } else {
            System.out.println(student);
        }
    }

}
