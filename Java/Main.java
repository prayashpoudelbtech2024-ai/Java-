public class Main {

    static double add(float x, float y) {
        return x + y;
    }

    public static void main(String[] args) {
        float a = 2.5f;
        float b = 3.5f;

        double sum = add(a, b);
        System.out.println("Sum is: " + sum);
    }
}
