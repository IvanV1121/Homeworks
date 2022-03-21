package com.IvanV1121.HomeWorkOnePartTwo;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double image){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (Double.isNaN(real) && Double.isNaN(imag) || imag <=0){
            return "("+real+imag+"i)";
        }
        return "("+real+"+"+imag+"i)";
    }

    public boolean isReal(){
        if (real != 0){
            return true;
        }
        else {
        return false;
        }
    }

    public boolean isImage(){
        if (imag != 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean equals(double real, double image){
        double EpsReal = (real + this.real)*0.001;
        double EpsImag = (real + this.real)*0.001;
        return ((Math.abs(real - this.real)<EpsReal) && (Math.abs(imag - this.imag)<EpsImag));
    }

    public boolean equals(MyComplex another){
        double EpsReal = (another.real + this.real)*0.001;
        double EpsImag = (another.real + this.real)*0.001;
        return ((Math.abs(another.real - this.real)<EpsReal) && (Math.abs(another.real - this.imag)<EpsImag));
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(real,2)+Math.pow(imag,2));
    }

    public double argument(){
        return Math.atan(imag/real);
    }

    public MyComplex add(MyComplex right){
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right){
        MyComplex myComplex = new MyComplex();
        myComplex.real = this.real + right.getReal();
        myComplex.imag = this.imag + right.getImag();
        return myComplex;
    }

    public MyComplex subtract(MyComplex right){
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        MyComplex myComplex = new MyComplex();
        myComplex.real = this.real - right.getReal();
        myComplex.imag = this.imag - right.getImag();
        return myComplex;
    }

    public MyComplex multiply(MyComplex right){
        double realNew = this.real * right.real - this.imag * right.imag;
        double imageNew = this.imag * right.real + this.real * right.imag;
        this.real = realNew;
        this.imag = imageNew;
        return this;
}
    public MyComplex multiplyNew(MyComplex right){
        MyComplex myComplex = new MyComplex();
        myComplex.real = this.real * right.real - this.imag * right.imag;
        myComplex.imag = this.imag * right.real + this.real * right.imag;
        return myComplex;
    }

    public MyComplex divide(MyComplex right){
        double realNew = (this.real * right.real + this.imag * right.imag)/
                (Math.pow(right.real,2)+Math.pow(right.imag,2));
        double imageNew = (this.imag * right.real - this.real * right.imag)/
                (Math.pow(right.real,2)+Math.pow(right.imag,2));
        this.real = realNew;
        this.imag = imageNew;
        return this;
    }
    public MyComplex divideNew(MyComplex right){
        MyComplex myComplex = new MyComplex();
        myComplex.real = (this.real * right.real + this.imag * right.imag)/
                (Math.pow(right.real,2)+Math.pow(right.imag,2));
        myComplex.imag = (this.imag * right.real - this.real * right.imag)/
                (Math.pow(right.real,2)+Math.pow(right.imag,2));
        return myComplex;
    }

    public MyComplex conjugate(){
        MyComplex myComplex = new MyComplex();
        myComplex.imag = -this.imag;
        myComplex.real = this.real;
        return myComplex;
    }




}
