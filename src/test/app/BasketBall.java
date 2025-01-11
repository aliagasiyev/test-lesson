package test.app;

public class BasketBall {

    public static void main(String[] args) {
        try {
            System.out.println(5);
            throw new Exception("Test Exception");
        } catch (Exception e) {
        }
        System.out.println("Program continues...");
    }
}