public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(Complex complexNumber){
        real += complexNumber.real;
        imaginary += complexNumber.imaginary;
    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(Complex complexNumber){
        real -= complexNumber.real;
        imaginary -= complexNumber.imaginary;
    }
}
