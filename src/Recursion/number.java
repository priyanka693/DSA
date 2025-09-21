package Recursion;

public class number {
    public static void main(String[] args) {
        test(1);
    }
    static void test(int num) {
        if (num == 5){
            System.out.println(5);
            return;
        }

        System.out.println(num);
        test(num + 1);

    }
}
