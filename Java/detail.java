class StudentInfo {
    int roll;
    String name;
    static String college = "ABC College";

    StudentInfo(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        StudentInfo s = new StudentInfo(1, "Prayash");
        s.display();
    }
}
