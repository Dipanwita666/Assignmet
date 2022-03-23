package com.cg.assignment;

public class Cube extends Square implements Volume {

	Cube(String name,double side)
	{
		this.name=name;
		this.side=side;		
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		double x;
		x=side*side*side;
		return x;
	}
}