package by.htp_gvozdev.task.logic.operation;

import java.util.Scanner;

import by.htp_gvozdev.task.bean.Kettle;
import by.htp_gvozdev.task.logic.Appliances;
import by.htp_gvozdev.task.logic.Initialization;

public class Add {

	@SuppressWarnings("resource")
	public static void addNewAppliance() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the name appliance:");
		String getName = scanner.nextLine();

		System.out.println("Enter the type appliance:");
		String getType = scanner.nextLine();

		System.out.println("Enter the power:");
		double getPower = scanner.nextDouble();

		System.out.println("Enter the consumption:");
		double getConsumption = scanner.nextDouble();

		System.out.println("Indicate if the device is switched on (true/false):");
		boolean getTurn = scanner.nextBoolean();

		ClearConsole.ClearCons();

		// System.out.println("
		// +-----------------------------------------------------------+");
		// System.out.println(" | ADDED NEW APPLIANCE |");
		// System.out.println("
		// +----+------------+--------+-------+-----------+------------+");
		// System.out.println(" | No | Name | Type | Power |Consumption|Turn(on/off)|");
		// System.out.println("
		// +----+------------+--------+-------+-----------+------------+");
		// System.out.printf("%11s %12s %8s %7s %11s %13s \t \n", "| 1 |", getName + "
		// |" , getType + " |", getPower + " |" , getConsumption + " |" , getTurn + "|
		// ");
		// System.out.println("
		// +----+------------+--------+-------+-----------+------------+");
		Initialization.list.add(new Kettle(getName, getType, getPower, getConsumption, getTurn));

		Appliances.showAppliancesAfterSort(Initialization.list);
		Appliances.getAppliancesAfterSort();

	}

}
