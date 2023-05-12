package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();



        System.out.println("I added 20 and 10 and the result is: " + c.add(20, 10) + " WOW!");
        System.out.println("I divided 20 by 10 and the result is: " + c.divide(20, 10) + " WOW!");
        System.out.println("I multiplied 20 by 10 and the result is: " + c.multiply(20, 10) + " WOW!");
        System.out.println("I subtracted 20 by 10 and the result is: " + c.minus(20, 10) + " WOW!");


    }
}
