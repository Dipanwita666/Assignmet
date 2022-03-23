package com.cg.assignment;


	import java.util.Scanner;

	public class Test {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the side ");
			double side=sc.nextDouble();
			System.out.println("Enter the height ");
			double height=sc.nextDouble();
			System.out.println("Enter the radius ");
			double radius=sc.nextDouble();
			
			Circle c=new Circle("Circle",radius);
			double ca=c.getArea();
			System.out.println("Area of circle = "+ ca+" sq units");
			
			Square sq=new Square("Square",side);
			double sqa=sq.getArea();
			System.out.println("Area of square = "+ sqa+" sq units");
			
			Cylinder cy=new Cylinder("Cylinder",radius,height);
			double cya=cy.getArea();
			System.out.println("Volume of Cylinder = "+ cya+" cu units");
			
			Sphere sp=new Sphere("Sphere",radius);
			double spa=sp.getArea();
			System.out.println("Volume of sphere = "+ spa+" cu units");
			
			Cube cu=new Cube("Cube",side);
			double cua=cu.getArea();
			System.out.println("Volume of cube = "+ cua+" cu units");
			
			Glome g=new Glome("Glome",radius);
			double gl=g.getArea();
			System.out.println("Volume of glome = "+ gl+" cu units");
			
		}

	}

