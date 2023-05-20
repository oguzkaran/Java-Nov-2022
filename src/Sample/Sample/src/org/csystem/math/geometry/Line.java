/*----------------------------------------------------------
	FILE			: Line.java
	AUTHOR			: Java-Nov-2022 Group
	LAST UPDATE		: 20.05.2023

	Line class that represents a line in cartesian plane

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
------------------------------------------------------------*/
package org.csystem.math.geometry;

public class Line {
    private Point m_p1, m_p2;

    //...

    public Line(double x1, double y1, double x2, double y2)
    {
        m_p1 = Point.createCartesian(x1, y1);
        m_p2 = Point.createCartesian(x2, y2);
    }

    public Point getPoint1()
    {
        return Point.createCartesian(m_p1.getX(), m_p1.getY());
    }

    public Point getPoint2()
    {
        return Point.createCartesian(m_p2.getX(), m_p2.getY());
    }

    public double getX1()
    {
        return m_p1.getX();
    }

    public void setX1(int x1)
    {
        m_p1.setX(x1);
    }

    public double getY1()
    {
        return m_p1.getY();
    }

    public void setY1(int y1)
    {
        m_p1.setY(y1);
    }

    public double getX2()
    {
        return m_p2.getX();
    }

    public void setX2(int x2)
    {
        m_p2.setX(x2);
    }

    public void setY2(int y2)
    {
        m_p1.setY(y2);
    }

    public double getY2()
    {
        return m_p2.getY();
    }

    public boolean isInside(Point point)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public String toString()
    {
        return String.format("%s, %s", m_p1.toString(), m_p2.toString());
    }
}
