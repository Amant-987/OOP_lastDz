package calc;

import org.apache.log4j.Logger;


public class ComplexCalculatorImpl implements ComplexCalculator {
    private static final Logger logger = Logger.getLogger(ComplexCalculatorImpl.class);

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() + b.getReal();
        double imaginary = a.getImaginary() + b.getImaginary();
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.info("Результат сложения: " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.info("Результат умножения: " + result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.info("Результат деления: " + result);
        return result;
    }


}