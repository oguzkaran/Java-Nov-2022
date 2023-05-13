/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Bazı durumlarda sınıfın public metotlarının isimlerinin hatta yapısının da değiştirilmesi gerekbilir.
	Bu durumda sınıfı yazan programcı eski metodu hemen devre dışı bırakmaz. Belki de hiç devre dışı bırakmaz. Metodu
	"deprecated" duruma getirir ve bunu dökumantosayona da yansıtır. Hatta bazı araçlar yardımıyla derleyicinin de deprecated
	metodun çağrılması durumunda "warning" vermesini sağlar. Bu durumda eski kodlar yine derlenir. Ancak duruma göre
	müşteri kodlarda değişiklik yapılabilir. Anımsanacağı gişbi deprecated olmanın pekçok gerekçesi olabilir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Date date = new Date(11, 7, 1983);

		System.out.printf("%02d/%02d/%04d%n", date.getDay(), date.getMonth(), date.getYear());

		date.setDay(6);
		date.setMonth(9);
		date.setYear(2021);

		System.out.printf("%02d/%02d/%04d%n", date.getDay(), date.getMonth(), date.getYear());
	}
}

class Date {
	private String m_dateStr;

	public Date(int day, int month, int year)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", day, month, year);
	}

	public void setDay(int day)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", day, getMonth(), getYear());
	}

	public void setMonth(int month)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", getDay(), month, getYear());
	}

	public void setMontValue(int month)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", getDay(), month, getYear());
	}

	public void setYear(int year)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", getDay(), getMonth(), year);
	}

	public int getDay()
	{
		return Integer.parseInt(m_dateStr.substring(0, 2));
	}

	public int getMonth()
	{
		return Integer.parseInt(m_dateStr.substring(3, 5));
	}

	public int getYear()
	{
		return Integer.parseInt(m_dateStr.substring(6));
	}
	//...
}