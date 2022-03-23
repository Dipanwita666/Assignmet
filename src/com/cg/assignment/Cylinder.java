package com.cg.assignment;

public class Cylinder extends Circle implements Volume {

	public double height;
	Cylinder(String name,double radius,double height)
	{
		this.name=name;
		this.radius=radius;
		this.height=height;
	}
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		double x;
		x=Math.PI*(radius*radius)*height;
		return x;
	}
}