package by.htp_gvozdev.task.logic.operation;

import java.util.Scanner;

import by.htp_gvozdev.task.logic.Initialization;

public class ModifyAppliance {

	@SuppressWarnings("resource")
	public static void setElementApplianceTurnTrue() {
		int indexRow = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select the row to edit:");
		indexRow = scanner.nextInt();
		Initialization.list.get(indexRow - 1).setTurn(true);
	}

	@SuppressWarnings("resource")
	public static void setElementApplianceTurnFalse() {
		int indexRow = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select the row to edit:");
		indexRow = scanner.nextInt();
		Initialization.list.get(indexRow - 1).setTurn(false);
	}

}
