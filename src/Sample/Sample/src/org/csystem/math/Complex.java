/*----------------------------------------------------------
	FILE			: Complex.java
	AUTHOR			: Java-Nov-2022 Group
	LAST UPDATE		: 13.05.2023
	
	Complex class that represents a complex number
	
	Copyleft (c) 1993 C and System Programmers Association 
	All Rights Free
------------------------------------------------------------*/
package org.csystem.math;

import static java.lang.Math.sqrt;

public class Complex {
	public double m_real;
	public double m_imag;
	
	private static Complex add(double re1, double im1, double re2, double im2)
	{
		return new Complex(re1 + re2, im1 + im2);
	}
	
	private static Complex subtract(double re1, double im1, double re2, double im2)
	{
		return add(re1, im1, -re2, -im2);
	}
	
	private static Complex multiply(double re1, double im1, double re2, double im2)
	{
		//TODO:
		return new Complex();
	}
	
	public Complex()
	{
	}
	
	public Complex(double real)
	{
		m_real = real;
	}
	
	public Complex(double real, double imag)
	{
		m_real = real;
		m_imag = imag;
	}
	
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.m_real, z.m_imag);
	}
	
	public Complex add(double real, double imag)
	{
		return add(m_real, m_imag, real, imag);
	}
	
	public Complex add(double val)
	{
		return add(m_real, m_imag, val, 0);
	}
	
	public Complex add(Complex other)
	{
		return add(other.m_real, other.m_imag);
	}
	
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.m_real, z.m_imag);
	}
	
	public Complex subtract(double real, double imag)
	{
		return subtract(m_real, m_imag, real, imag);
	}
	
	public Complex subtract(double val)
	{
		return subtract(m_real, m_imag, val, 0);
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(other.m_real, other.m_imag);
	}
	
	public static Complex multiply(double val, Complex z)
	{
		return multiply(val, 0, z.m_real, z.m_imag);
	}
	
	public Complex multiply(double real, double imag)
	{
		return multiply(m_real, m_imag, real, imag);
	}
	
	public Complex multiply(double val)
	{
		return multiply(m_real, m_imag, val, 0);
	}
	
	public Complex multiply(Complex other)
	{
		return multiply(other.m_real, other.m_imag);
	}
	
	public Complex getConjugate()
	{
		return new Complex(m_real, -m_imag);
	}
	
	public double getLength()
	{
		return sqrt(m_real * m_real + m_imag * m_imag);
	}
	
	public double getNorm()
	{
		return getLength();
	}
	
	public String toString()
	{
		return String.format("(%.2f, %.2f)", m_real, m_imag);
	}	
}

