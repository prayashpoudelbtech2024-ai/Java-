import java.util.Scanner;

class Student {
    String name;
    int roll;
    String prn;

    Student(String n, int r, String p) {
        name = n;
        roll = r;
        prn = p;
    }

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = info.nextLine();

        System.out.print("Enter roll no: ");
        int roll = info.nextInt();
        info.nextLine();

        System.out.print("Enter PRN: ");
        String prn = info.nextLine();

        Student s = new Student(name, roll, prn);

        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.roll);
        System.out.println("PRN: " + s.prn);
    }
}
