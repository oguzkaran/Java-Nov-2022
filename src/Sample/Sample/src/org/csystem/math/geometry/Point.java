/*----------------------------------------------------------
	FILE			: Point.java
	AUTHOR			: Java-Nov-2022 Group
	LAST UPDATE		: 20.05.2023
	
	Point class that represents a point in cartesian plane
	
	Copyleft (c) 1993 C and System Programmers Association 
	All Rights Free
------------------------------------------------------------*/
package org.csystem.math.geometry;

import static java.lang.Math.*;

public class Point {
	private double m_x, m_y;

	private Point(double a, double b, boolean polar)
	{
		if (polar) {
			m_x = a * cos(a);
			m_y = a * sin(a);
		}
		else {
			m_x = a;
			m_y = b;
		}
	}

	public static Point createCartesian()
	{
		return createCartesian(0);
	}

	public static Point createCartesian(double x)
	{
		return createCartesian(x, 0);
	}

	public static Point createCartesian(double x, double y)
	{
		return new Point(x, y, false);
	}

	public static Point createPolar(double radius, double theta)
	{
		return new Point(radius, theta, true);
	}

	public double getX()
	{
		return m_x;
	}

	public void setX(double x)
	{
		m_x = x;
	}

	public double getY()
	{
		return m_y;
	}

	public void setY(double y)
	{
		m_y = y;
	}

	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(double x, double y)
	{
		return sqrt(pow(m_x - x, 2) + pow(m_y - y, 2));
	}
	
	public double distance(Point other)
	{
		return distance(other.m_x, other.m_y);
	}
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		m_x += dx;
		m_y += dy;
	}
	
	public String toString()
	{
		return String.format("(%.2f, %.2f)", m_x, m_y);
	}
}
