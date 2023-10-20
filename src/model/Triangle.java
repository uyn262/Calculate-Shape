/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    
    
    
    @Override
    public double getPerimeter() {
        if (isRectangle(sideA, sideB, sideC))
            return sideA + sideB + sideC;
        return -1;
    }

    @Override
    public double getArea() {
        if (isRectangle(sideA, sideB, sideC)) {
            double p = getPerimeter()/2;
            return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        }
        return -1;  
    }

    @Override
    public void printResult() {
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }

//    private boolean isRetangle() {
//        return (sideA + sideB > sideC 
//                && sideB + sideC > sideA && sideC + sideA > sideB);
//    }
    public boolean isRectangle(double sideA, double sideB, double sideC) {
        return (sideA + sideB > sideC 
                && sideB + sideC > sideA && sideC + sideA > sideB);
    }
    
    
}
