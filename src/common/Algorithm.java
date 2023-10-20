/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import model.Circle;
import model.Rectangle;
import model.Triangle;

/**
 *
 * @author Admin
 */
public class Algorithm {
    Library l = new Library();
    public void displayCircle() {
        double radius = l.getDouble("Please input radius of Circle: ");
        while (radius <= 0)
            radius = l.getDouble("Please input radius of Circle: ");
        Circle c = new Circle(radius);
        c.printResult();
    }
    public void displayTriangle() {
        double sideA = l.getDouble("Please input side A of Triangle: ");
        while (sideA <= 0)
            sideA = l.getDouble("Please input side A of Triangle: ");
        double sideB = l.getDouble("Please input side B of Triangle: ");
        while (sideB <= 0)
            sideB = l.getDouble("Please input side B of Triangle: ");
        double sideC = l.getDouble("Please input side C of Triangle: ");
        while (sideC <= 0)
            sideC = l.getDouble("Please input side C of Triangle: ");
        Triangle t = new Triangle(sideA, sideB, sideC);
        t.printResult();
    }
    public void displayRectangle() {
        double width = l.getDouble("Please input side width of Rectangle: ");
        while (width <= 0)
            width = l.getDouble("Please input side width of Rectangle: ");
        double length = l.getDouble("Please input side length of Rectangle: ");
        while (length <= 0)
            length = l.getDouble("Please input side length of Rectangle: ");
        Rectangle r = new Rectangle(width, length);
        r.printResult();
    }
}
