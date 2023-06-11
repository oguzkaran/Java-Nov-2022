/*----------------------------------------------------------
	FILE			: AnalyticalCircle.java
	AUTHOR			: Java-Nov-2022 Group
	LAST UPDATE		: 11.06.2023

	AnalyticalCircle class that represents a circle
	int cartesian plane

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
------------------------------------------------------------*/
package com.bartucankaya;

import org.csystem.math.geometry.Circle;
import org.csystem.math.geometry.MutablePoint;

public class AnalyticalCircle extends Circle {
    private final MutablePoint m_mutablePoint;

    public AnalyticalCircle()
    {
        this(0);
    }

    public AnalyticalCircle(double radius)
    {
       this(radius, 0, 0);
    }

    public AnalyticalCircle(double x, double y)
    {
        this(0, x, y);
    }

    public AnalyticalCircle(double radius, double x, double y)
    {
        super(radius);
        m_mutablePoint = MutablePoint.ofCartesian(x, y);
    }

    public double getX()
    {
        return m_mutablePoint.getX();
    }

    public void setX(double x)
    {
        m_mutablePoint.setX(x);
    }

    public double getY()
    {
        return m_mutablePoint.getY();
    }

    public void setY(double y)
    {
        m_mutablePoint.setX(y);
    }



}
