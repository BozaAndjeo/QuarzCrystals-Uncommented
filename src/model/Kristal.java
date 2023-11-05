/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Runelord
 */
public class Kristal {
    private double[] x=new double[12];
    private int id;
    
    
    
    
    public double getX(int i) {
        return x[i];
    }

    public void setX(int i,double x) {
        this.x[i] = x;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    

    
}
