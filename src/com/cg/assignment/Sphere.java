package com.cg.assignment;
public class Sphere extends Circle implements Volume {

	Sphere()
	{
		
	}
	Sphere(String name,double radius)
	{
		this.name=name;
		this.radius=radius;
	}
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		double x;
		x=(4/3)*Math.PI*(radius*radius);
		return x;
	}
}