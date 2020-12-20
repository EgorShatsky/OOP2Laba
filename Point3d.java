package com.company;

public class Point3d extends Point2d {
    private double zCoord;
    public Point3d(double x,double y,double z){
        super(x,y);
        zCoord=z;
    }
    public Point3d(){
        this (0,0,0);
    }
    public double getZ(){
        return zCoord;
    }
    public void setZ(double val){
        zCoord=val;
    }

    public boolean Equals(Point3d object){
        return (super.getX()== object.getX())&&(super.getY()==object.getY())&&(this.getZ()==object.zCoord);
    }
    public double distanceTo(Point3d object){
        return Math.floor(Math.sqrt(Math.pow(object.getX()-super.getX(),2)+Math.pow(object.getY()-super.getY(),2)+Math.pow(object.getZ()-this.getZ(),2)));
    }
}
