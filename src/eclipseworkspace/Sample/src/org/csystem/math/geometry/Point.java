/*----------------------------------------------------------
	FILE			: Point.java
	AUTHOR			: Java-Nov-2022 Group
	LAST UPDATE		: 25.03.2023
	
	Point class that represents a point in cartesian plane
	
	Copyleft (c) 1993 C and System Programmers Association 
	All Rights Free
------------------------------------------------------------*/
package org.csystem.math.geometry;

public class Point {
	public double x, y; 
	
	public Point()
	{	
	}
	
	public Point(double a)
	{
		x = a;
	}
	
	public Point(double a, double b)
	{
		x = a;
		y = b;
	}
	
	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(double a, double b)
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}
	
	public String toString()
	{
		return String.format("(%.2f, %.2f)", x, y);
	}
}