/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import common.Algorithm;
import view.Menu;

/**
 *
 * @author Admin
 */
public class CalculateShape extends Menu<String>{
    static String[] options = {"Circle", "Triangle", "Rectangle", "Exit"};
    Algorithm algorithm;
    public CalculateShape() {
        super("===== CALCULATOR SHAPE PROGRAM =====", options);
        algorithm = new Algorithm();
    }
    
    @Override
    public void execute(int n) {
        switch(n) {
            case 1: algorithm.displayCircle();
                break;
            case 2:algorithm.displayTriangle();
                break;
            case 3: algorithm.displayRectangle();
                break;
            case 4: System.exit(0);
                break;
        }
    }
}
