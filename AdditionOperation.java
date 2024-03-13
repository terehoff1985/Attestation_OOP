


public class AdditionOperation implements Operation {
    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }
}