package com.cg.assignment;

public class Box {

		double l, b, h;
		
		Box(double length, double breadth, double height){
			l=length;
			b=breadth;
			h=height;
		}

		double volume() {
			double v;
			v = l*b*h;
			return v;
		}

		public static void main(String[] args) {
			
			Box b = new Box(5.8,66,7);
			
			double vol;
			
			vol= b.volume();
			
			System.out.println("The volume of the box is : "+ vol);

		}
	}

