class parent {
    int x = 10;
}

class Child extends parent {
    int y = 20;

    public static void main(String[] args) {
        Child obj = new Child();

        System.out.println("Value of x: " + obj.x);
        System.out.println("Value of y: " + obj.y);
    }
}