package at.campus02.bsd
        ;

public class Calculator {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double faculty(double num1) {
        int fact = 1;

        for (int i = 1; i <= num1; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
