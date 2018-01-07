package by.htp_gvozdev.task.logic;

import java.util.Scanner;

import by.htp_gvozdev.task.logic.operation.Add;
import by.htp_gvozdev.task.logic.operation.ClearConsole;
import by.htp_gvozdev.task.logic.operation.CloseProgramm;
import by.htp_gvozdev.task.logic.operation.Delete;
import by.htp_gvozdev.task.logic.operation.ModifyAppliance;
import by.htp_gvozdev.task.logic.operation.PrintToFile;
import by.htp_gvozdev.task.logic.operation.Sort;

public class ChoisMenu {

	public static void getChoisMenu() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String userChois = scanner.nextLine();

		switch (userChois) {
		case "1.0":
			ClearConsole.ClearCons();
			Appliances.showAppliancesAfterSort(Initialization.list);
			Appliances.getAppliancesAfterSort();
			break;
		case "1.1":
			ClearConsole.ClearCons();
			Add.addNewAppliance();
			break;
		case "1.2":
			ClearConsole.ClearCons();
			Delete.deleteItem();
			Appliances.showAppliancesAfterSort(Initialization.list);
			Appliances.getAppliancesAfterSort();
			break;
		case "4.1":
			ClearConsole.ClearCons();
			ModifyAppliance.setElementApplianceTurnTrue();
			Appliances.showAppliancesAfterSort(Initialization.list);
			Appliances.getAppliancesAfterSort();
			break;
		case "4.2":
			ClearConsole.ClearCons();
			ModifyAppliance.setElementApplianceTurnFalse();
			Appliances.showAppliancesAfterSort(Initialization.list);
			Appliances.getAppliancesAfterSort();
			break;
		case "2.1":
			ClearConsole.ClearCons();
			Sort.sortByName();
			Appliances.showAppliancesAfterSort(Initialization.list);
			Appliances.getAppliancesAfterSort();
			break;
		case "2.2":
			ClearConsole.ClearCons();
			Sort.sortByType();
			Appliances.showAppliancesAfterSort(Initialization.list);
			Appliances.getAppliancesAfterSort();
			break;
		case "2.3":
			ClearConsole.ClearCons();
			Sort.sortByPower();
			Appliances.showAppliancesAfterSort(Initialization.list);
			Appliances.getAppliancesAfterSort();
			break;
		case "2.4":
			ClearConsole.ClearCons();
			Sort.sortByConsumption();
			Appliances.showAppliancesAfterSort(Initialization.list);
			Appliances.getAppliancesAfterSort();
			break;
		case "2.5":
			ClearConsole.ClearCons();
			System.out.println("     *Function not available.");
			Appliances.showAppliancesAfterSort(Initialization.list);
			Appliances.getAppliancesAfterSort();
			MenuApp.menuShow();
			break;
		case "3":
			ClearConsole.ClearCons();
			Appliances.getShowRange(Initialization.list);
			MenuApp.menuShow();
			break;
		case "5":
			PrintToFile.printFile();
			ClearConsole.ClearCons();
			MenuApp.menuShow();
			break;
		case "6":
			ClearConsole.ClearCons();
			CloseProgramm.getCloseProgramm();
			break;
		default:
			MenuApp.menuShow();
			break;
		}
	}

}
