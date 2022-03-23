package com.cg.assignment;



public class Square extends Shape implements Area{

	public double side;
	Square()
	{
		
	}
	Square(String name,double side)
	{
		this.name=name;
		this.side=side;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double x;
		x=side*side;
		return x;
	}
}