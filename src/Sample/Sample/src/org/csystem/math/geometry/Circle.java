/*----------------------------------------------------------
	FILE			: Circle.java
	AUTHOR			: Java-Nov-2022 Group
	LAST UPDATE		: 13.05.2023

	Circle class that represents a circle

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
------------------------------------------------------------*/
package org.csystem.math.geometry;

import static java.lang.Math.PI;

public class Circle {
    private double m_radius;

    public Circle()
    {
    }

    public Circle(double radius)
    {
        setRadius(radius);
    }

    public double getRadius()
    {
        return m_radius;
    }

    public void setRadius(double radius)
    {
        m_radius = Math.abs(radius);
    }

    public double getArea()
    {
        return PI * m_radius * m_radius;
    }

    public double getCircumference()
    {
        return 2 * PI * m_radius;
    }

    public String toString()
    {
        return String.format("Radius:%f, Area:%f, Circumference:%f", m_radius, getArea(), getCircumference());
    }
}
