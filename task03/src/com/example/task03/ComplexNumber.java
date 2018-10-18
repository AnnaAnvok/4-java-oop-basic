package com.example.task03;

public class ComplexNumber {
    private double Re;
    private double Im;

    ComplexNumber(double Re, double Im) {
        this.Re = Re;
        this.Im = Im;
    }

    ComplexNumber() {
        this.Re = 0;
        this.Im = 0;
    }

    public ComplexNumber Add(ComplexNumber number) {
        Re = this.Re + number.Re;
        Im = this.Im + number.Im;
        ComplexNumber Result = new ComplexNumber(Re, Im);
        return Result;
    }

    public ComplexNumber Mult(ComplexNumber number) {
        Re = this.Re * number.Re - this.Im * number.Im;
        Im = this.Im * number.Re + this.Re * number.Im;
        ComplexNumber Result = new ComplexNumber(Re, Im);

        return Result;
    }

    public String Print() {
        if (Re != 0 && Im > 0 )
            return String.format("%f+%fi", Re, Im);
        else if (Im < 0 && Re != 0)
            return String.format("%f%fi", Re, Im);
        else if (Im == 0 && Re != 0)
            return String.format("%f", Re);
        else
            return String.format("%f", Im);
    }
}
