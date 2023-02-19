/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun parametre değişkeni bir referans olabilir. Bu durumda metot aynı türden bir referans ile çağrılabilir. 
	Metoda geçilen referans ile metot içerisinde ilgili nesneye erişilmiş olur. Referans parametreli bir metot aldığı
	referansa ilişkin nesne üzerinde değişiklik yapabilir. Bu durumda bu değişiklik metodu çağrıdan koddaki referans
	üzerinden aynı nesneye erişildiği için görülebilir. Bir metodun geri dönüş değeri de referans olabilir. Bu durumda
	metodun geri dönüş değerine ilişkin return deyimine ait ifadenin türünün aynı türden bir referans olması gerekir.
	
	Aşağıdaki örnekte createTime metodu, içeride yaratmış olduğu nesnenin referansına geri dönmektedir. printTime
	metodu parametresi ile aldığı Time türünden referansın gösterdiği nesneye erişip bilgilerini akrana yazdırmaktadır.
	changeTime metodu aldığı refeeransa ilişkin nesneye erişip hour, minute, second ve millisecond elemanlarının 
	değerlerini değiştirmektedir. Örneği çalıştırarak durumu gözlemleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{
		Time time;
		
		time = TimeUtil.createTime(19, 19, 14, 234);
		TimeUtil.printTime(time);
		TimeUtil.changeTime(time, 20, 34, 45, 345);
		TimeUtil.printTime(time);
	}
}

class TimeUtil {
	public static Time createTime(int hour, int minute, int second, int millisecond)
	{
		Time time = new Time();
		
		changeTime(time, hour, minute, second, millisecond);
		
		return time;
	}
	
	public static void changeTime(Time time, int hour, int minute, int second, int millisecond)
	{
		//...
		time.hour = hour;
		time.minute = minute;
		time.second = second;
		time.millisecond = millisecond;
	}
	
	public static void printTime(Time time)
	{
		System.out.printf("%02d:%02d:%02d.%03d%n", time.hour, time.minute, time.second, time.millisecond);
	}
}

class Time {
	public int hour;
	public int minute;
	public int second;
	public int millisecond;
	//...
}
