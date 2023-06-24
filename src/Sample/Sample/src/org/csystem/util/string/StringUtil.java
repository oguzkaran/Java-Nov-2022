/*----------------------------------------------------------
	FILE			: StringUtil.java
	AUTHOR			: Java-Nov-2022 Group
	LAST UPDATE		: 24.06.2023
	
	Utility class for string operations
	
	Copyleft (c) 1993 C and System Programmers Association 
	All Rights Free
------------------------------------------------------------*/
package org.csystem.util.string;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public final class StringUtil {
	private static final String LETTERS_TR = "abcçdefgğhıijklmnoöprsştuüvyz";
	private static final String LETTERS_EN = "abcdefghijklmnopqrstuwxvyz";
	private static final String LETTERS_CAPITAL_TR = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
	private static final String LETTERS_CAPITAL_EN = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
	private static final String LETTERS_ALL_TR = LETTERS_TR + LETTERS_CAPITAL_TR;
	private static final String LETTERS_ALL_EN = LETTERS_EN + LETTERS_CAPITAL_EN;

	private StringUtil()
	{
	}

	public static String capitalize(String s)
	{
		return s.isEmpty() ? "" : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}

	public static String changeCase(String s)
	{
		char [] c = s.toCharArray();

		for (int i = 0; i < c.length; ++i)
			c[i] = Character.isUpperCase(c[i]) ? Character.toLowerCase(c[i]) : Character.toUpperCase(c[i]);

		return String.valueOf(c);
	}

	public static int countString(String s1, String s2)
	{
		int count = 0;

		for (int index = -1; (index = s1.indexOf(s2, index + 1)) != -1; ++count)
			;

		return count;
	}

	public static int countStringIgnoreCase(String s1, String s2)
	{
		return countString(s1.toLowerCase(), s2.toLowerCase());
	}

	public static String getRandomText(Random r, int n, String text)
	{
		char [] c = new char[n];
		int len = text.length();

		for (int i = 0; i < n; ++i)
			c[i] = text.charAt(r.nextInt(len));

		return String.valueOf(c);
	}

	public static String getRandomTextEN(int n)
	{
		return getRandomTextEN(new Random(), n);
	}

	public static String getRandomTextEN(Random r, int n)
	{
		return getRandomText(r, n, LETTERS_ALL_EN);
	}

	public static String getRandomTextTR(int n)
	{
		return getRandomTextTR(new Random(), n);
	}

	public static String getRandomTextTR(Random r, int n)
	{
		return getRandomText(r, n, LETTERS_ALL_TR);
	}

	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			char cLeft = Character.toLowerCase(s.charAt(left));

			if (!Character.isLetter(cLeft)) {
				++left;
				continue;
			}

			char cRight = Character.toLowerCase(s.charAt(right));

			if (!Character.isLetter(cRight)) {
				--right;
				continue;
			}

			if (cLeft != cRight)
				return false;

			++left;
			--right;
		}

		return true;
	}

	public static boolean isPangram(String s, String alphabet)
	{
		int len = alphabet.length();

		for (int i = 0; i < len; ++i)
			if (!s.contains(alphabet.charAt(i) + ""))
				return false;

		return true;
	}

	public static boolean isPangramEN(String s)
	{
		return isPangram(s.toLowerCase(), LETTERS_EN);
	}

	public static boolean isPangramTR(String s)
	{
		return isPangram(s.toLowerCase(), LETTERS_TR);
	}

	public static String join(String [] str, String delimiter, boolean skipBlanks)
	{
		String result = "";

		for (String s : str) {
			if (skipBlanks && s.isBlank())
				continue;

			result += s + delimiter;
		}

		return result.substring(0, result.length() - delimiter.length());
	}
	public static String join(String [] str, String delimiter)
	{
		return join(str, delimiter, false);
	}

	public static String join(String [] str, char delimiter)
	{
		return join(str, String.valueOf(delimiter));
	}

	public static String join(String [] str, char delimiter, boolean skipBlanks)
	{
		return join(str, String.valueOf(delimiter), skipBlanks);
	}

	public static String padLeading(String s, int len)
	{
		return padLeading(s, len, ' ');
	}

	public static String padLeading(String s, int len, char ch)
	{
		int length = s.length();

		return len <= length ? s : String.valueOf(ch).repeat(len - length) + s;
	}

	public static String padTrailing(String s, int len)
	{
		return padTrailing(s, len, ' ');
	}

	public static String padTrailing(String s, int len, char ch)
	{
		int length = s.length();

		return len <= length ? s : s + String.valueOf(ch).repeat(len - length);
	}

	public static String reverse(String str)
	{
		char [] c = str.toCharArray();

		ArrayUtil.reverse(c);

		return String.valueOf(c);
	}
}

