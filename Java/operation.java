import java.util.Scanner;

class Calculator {
    int a, b;

    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    void calculate(int choice) {
        switch (choice) {
            case 1: System.out.println("Sum = " + (a + b)); break;
            case 2: System.out.println("Sub = " + (a - b)); break;
            case 3: System.out.println("Mul = " + (a * b)); break;
            case 4:
                if (b == 0)
                    System.out.println("Cannot divide by zero");
                else
                    System.out.println("Div = " + (a / b));
                break;
            default: System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("1.Add 2.Sub 3.Mul 4.Div");
        int choice = sc.nextInt();

        Calculator c = new Calculator(x, y);
        c.calculate(choice);
    }
}
