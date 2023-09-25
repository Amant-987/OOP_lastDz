package calc;

public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);

        ComplexCalculator calculator = new ComplexCalculatorImpl();

        ComplexNumber sum = calculator.add(a, b);
        ComplexNumber product = calculator.multiply(a, b);
        ComplexNumber quotient = calculator.divide(a, b);

        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }
}