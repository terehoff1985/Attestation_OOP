

public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);

        ComplexCalculator calculator = new ComplexCalculator();
        ComplexNumber sum = calculator.calculate("addition", a, b);
        ComplexNumber product = calculator.calculate("multiplication", a, b);

        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        System.out.println("Product: " + product.getReal() + " + " + product.getImaginary() + "i");
    }
}