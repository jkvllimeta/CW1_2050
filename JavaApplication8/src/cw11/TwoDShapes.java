/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw11;

/**
 *
 * @author M00607647
 */
public abstract class TwoDShapes extends Shape{

    public TwoDShapes(String name, int noOfSides) {
        super(name, noOfSides);
        
    }
    
    public abstract double getPerimeter();
    
}
