/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day1;

/**
 *
 * @author user
 */
public class Square {
    private double length;
    
    private String color;
    
    // Konstruktors
    public Square(double length, String color){
        this.color = color;
        this.length = length;
        
    }
    // Jauna metode
    public double getArea(){
        return length*length;
        
    }
    
    public double getPerimeter(){
        return this.length*4;
        //return length*4
    }
    
    public String getColor(){
        return this.color;
    }
}
