package at.campus02.bsd
        ;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    static ArithmeticException arithmeticException = new ArithmeticException();
    private static Logger logger = LogManager.getLogger();


    public double add(double num1, double num2) {
        logger.debug("The method add has been called with num1 = " + num1 + " and num2 = " + num2);

        return num1 + num2;
    }

    public double minus(double num1, double num2) {
        logger.debug("The method minus has been called with num1 = " + num1 + " and num2 = " + num2);

        return num1 - num2;
    }

    public double divide(double num1, double num2) throws ArithmeticException {


            if (num2 == 0){
                logger.error("The method divide has been called with num1 = " + num1 + " and num2 = " + num2);
                throw arithmeticException;
            }

        logger.debug("The method divide has been called with num1 = " + num1 + " and num2 = " + num2);

        return num1 / num2;





    }

    public double multiply(double num1, double num2) {
        logger.debug("The method multiply has been called with num1 = " + num1 + " and num2 = " + num2);


        return num1 * num2;
    }

    public double faculty(double num1) {
        logger.debug("The method faculty has been called with num1 = " + num1);

        if (num1 == 0){
            return 0;
        }
        int fact = 1;

        for (int i = 1; i <= num1; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
