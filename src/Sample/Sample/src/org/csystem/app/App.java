/*-----------------------------------------------------------------------------------------------------------------------
	Java'da exception sınıfları kategori olarak iki gruba ayrılır: checked, unchecked

	unchecked exception sınıfı: Bir exception sınıfının türetme hiyerarşisi içerisinde RuntimeException veya Error
	sınıfı varsa bu sınıf unchecked exception sınıfıdır

	checked exception sınıfı: unchecked olmayan exception sınıfıdır

	Anahtar Notlar: Türetme kavramı dolayısıyla bir exception sınıfından türetilen bir başka exception sınıf kategori olarak
	taban sınıfı ile aynıdır

	
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
	public static void main(String[] args)
	{
		try {
			double val = Console.readDouble("Input a value:", "Invalid value!...");

			Console.writeLine("log(%f) = %f", val, MathUtil.log(val));
		}
		catch (MathException ex) {
			ex.printStackTrace();
		}
		System.out.println("C and System Programmers Association");
	}
}

class MathUtil {
	public static double log(double val)
	{
		if (val < 0)
			throw new NaNException("Indeterminate");

		if (val == 0)
			throw new NegativeInfinityException("Undefined");

		return Math.log(val);
	}
}

class NegativeInfinityException extends MathException {
	public NegativeInfinityException(String message)
	{
		super(message, MathExceptionStatus.NEGATIVE_INFINITY);
	}

	public String getMessage()
	{
		return String.format("Message:%s, Status:Negative Infinity", super.getMessage());
	}
}

class NaNException extends MathException {
	public NaNException(String message)
	{
		super(message, MathExceptionStatus.NAN);
	}

	public String getMessage()
	{
		return String.format("Message:%s, Status:NaN", super.getMessage());
	}
}

enum MathExceptionStatus {ZERO, POSITIVE_ZERO, NEGATIVE_ZERO, INFINITY, POSITIVE_INFINITY, NEGATIVE_INFINITY, NAN,}

class MathException extends Exception {
	private final MathExceptionStatus m_mathExceptionStatus;

	public MathException(String message, MathExceptionStatus mathExceptionStatus)
	{
		super(message);
		m_mathExceptionStatus = mathExceptionStatus;
	}


	public MathExceptionStatus getMathExceptionStatus()
	{
		return m_mathExceptionStatus;
	}
}

