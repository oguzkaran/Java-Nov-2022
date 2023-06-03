/*----------------------------------------------------------------------------------------------------------------------
	Sınıflararası İlişkiler:

-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the device status as OPEN, CLOSED or UNKNOWN:");
		String deviceStatusStr = kb.nextLine().toUpperCase();
		DeviceStatus deviceStatus = DeviceStatus.valueOf(deviceStatusStr);

		switch (deviceStatus) {
			case OPEN -> System.out.println("Open device");
			case CLOSED -> System.out.println("Closed device");
			case UNKNOWN -> System.out.println("Unknown device");
		}
	}
}

enum DeviceStatus {
	OPEN, CLOSED, UNKNOWN
}
