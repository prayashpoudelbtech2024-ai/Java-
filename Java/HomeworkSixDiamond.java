interface HomeworkSixA {
    void show();
}

interface HomeworkSixB {
    void show();
}

public class HomeworkSixDiamond implements HomeworkSixA, HomeworkSixB {

    public void show() {
        System.out.println("Diamond problem solved using interface");
    }

    public static void main(String[] args) {
        HomeworkSixDiamond obj = new HomeworkSixDiamond();
        obj.show();
    }
}