abstract class HomeworkSixCalculator {
    abstract void add(int a, int b);
    abstract void sub(int a, int b);
}

public class HomeworkSixCalcImpl extends HomeworkSixCalculator {

    void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public static void main(String[] args) {
        HomeworkSixCalcImpl obj = new HomeworkSixCalcImpl();
        obj.add(20, 10);
        obj.sub(20, 10);
    }
}