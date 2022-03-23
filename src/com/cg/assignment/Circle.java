package com.cg.assignment;

public class Circle extends Shape implements Area {

	public double radius;
	Circle()
	{
		
	}
	Circle(String name,double radius)
	{
		this.name=name;
		this.radius=radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double x;
		x=Math.PI*(radius*radius);
		return x;
		
	}

}