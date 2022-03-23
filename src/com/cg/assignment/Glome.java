package com.cg.assignment;

public class Glome extends Sphere implements Volume {

		Glome(String name,double radius)
		{
			this.name=name;
			this.radius=radius;
		}
		public double getVolume()
		{
			double x;
			x=0.2*(Math.PI*Math.PI)*(Math.pow(radius, 4));
			return x;
		}
	}