/*----------------------------------------------------------------------------------------------------------------------
	Taxi, Driver ve Client sınıfları ve aralarındaki ilişkiler
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;

class App {
	public static void main(String [] args)
	{
		DemoTaxiAutomationApp.run();
	}
}

class DemoTaxiAutomationApp {
	public static void run()
	{
		ClientFactory clientFactory = new ClientFactory();
		TaxiFactory taxiFactory = new TaxiFactory();

		Taxi taxi = taxiFactory.getTaxi();
		Client client1 = clientFactory.getClient();

		taxi.take(client1);

		Client client2 = clientFactory.getClient();

		taxi.take(client2);
	}
}

class ClientFactory {
	private final Random m_random = new Random();
	private static final Client [] CLIENTS = {
			new Client("Rukiye Ünal", "rukiyeunal"),
			new Client("Güray Sönmez", "guray"),
			new Client("Serdar Başokutan", "serdarbasokutan"),
			new Client("Oğuz Karan", "oguzkaran"),};
	public Client getClient()
	{
		return CLIENTS[m_random.nextInt(CLIENTS.length)];
	}
}

class TaxiFactory {
	private final Random m_random = new Random();
	private static final Driver [] DRIVERS = {
			new Driver("Veli"),
			new Driver("Selami"),
			new Driver("Secati"),
			new Driver("Necati"),
			new Driver("Ali Papila"),};

	public Taxi getTaxi()
	{
		return new Taxi(DRIVERS[m_random.nextInt(DRIVERS.length)]);
	}
}

class Taxi {
	private Driver m_driver;

	public Taxi(Driver driver/*.*/)
	{
		m_driver = driver;
	}

	public void take(Client client)
	{
		System.out.printf("Client:%s%n", client.getUserName());
	}
}

class Client {
	private String m_name;
	private String m_userName;

	//...


	public Client(String name, String userName)
	{
		m_name = name;
		m_userName = userName;
	}

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		m_name = name;
	}

	public String getUserName()
	{
		return m_userName;
	}

	public void setUserName(String userName)
	{
		m_userName = userName;
	}
	//...
}

class Driver {
	private String m_name;
	private int m_rating;
	//...


	public Driver(String name)
	{
		m_name = name;
	}

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		m_name = name;
	}

	public int getRating()
	{
		return m_rating;
	}

	public void setRating(int rating)
	{
		m_rating = rating;
	}

	//...
}
